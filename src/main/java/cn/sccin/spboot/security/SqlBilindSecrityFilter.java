package cn.sccin.spboot.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.context.annotation.Configuration;

/**
 * Created by developer_hyaci on 2015/9/24.
 */

@Configuration
public class SqlBilindSecrityFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	/**
	 * 哪些不参加sql盲注过滤在此进行判定
	 * @param request
	 * @return boolean false[不参加]，true[参加]
	 */
	private boolean isEnterSqlFilter(HttpServletRequest request){
		if(ServletFileUpload.isMultipartContent(request)){
			//当为文件上传时不进行SQL盲注过滤
			return false;
		}else{
			return true;
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest requestBean=(HttpServletRequest) request;

		//判定是否需要对SQL盲注进行处理
		Map<String, String[]> filterMap = requestBean.getParameterMap();
		boolean filterFlag=false;//SQL注入标识
		if(isEnterSqlFilter(requestBean)){
			String filterValue="";
			for(String key:filterMap.keySet()){
				for(String value:filterMap.get(key)){
					filterValue=value.replaceAll("(^|\\&)|(\\|)|(\\;)|(\\$)|(\\%)|(\\@)|(\\')|(\\\")|(\\>)|(\\<)|(\\))|(\\()|(\\+)|(\\,)|(\\\\)|(\\#|$)","");
					if(!value.equals(filterValue)){
						filterFlag=true;
						break;
					}
				}
				if(filterFlag){
					break;
				}
			}
			filterValue=null;
		}
		boolean isRedirect=false;
		if(filterFlag){
			//当出现SQL注入安全问题时
			//解决方案：前台UI进行特殊字符判定，后台进行特殊字符替换（假如跳过前台后台已经进行拦截处理）；
			if(requestBean.getHeader("X-Requested-With")!=null){
				//Ajax请求时
				requestBean=new SqlBlindFilterRequestWrapper(requestBean);
			}else{
				isRedirect=true;
			}
			
		}
		if(isRedirect&&filterFlag){
			//出现SQL注入且非Ajax请求时
			HttpServletResponse responseBean = (HttpServletResponse)response;
			responseBean.sendRedirect("/sqlblind.html");
		}else{
			chain.doFilter(requestBean, response);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}

	private class SqlBlindEntry<K,V> implements Entry<K, V>{
		private Entry me;

		public SqlBlindEntry(Entry me) {
			if (me == null) {
				throw new IllegalArgumentException(
						"Map.Entiry argument not null.");
			}
			if(me.getValue() instanceof String ){
				me.setValue(me.getValue().toString().replaceAll("(^|\\&)|(\\|)|(\\;)|(\\$)|(\\%)|(\\@)|(\\')|(\\\")|(\\>)|(\\<)|(\\))|(\\()|(\\+)|(\\,)|(\\\\)|(\\#|$)",""));
			}else if(me.getValue() instanceof String []){
				String [] values=(String[]) me.getValue();
				for(int i=0;i<values.length;i++){
					values[i]=values[i].replaceAll("(^|\\&)|(\\|)|(\\;)|(\\$)|(\\%)|(\\@)|(\\')|(\\\")|(\\>)|(\\<)|(\\))|(\\()|(\\+)|(\\,)|(\\\\)|(\\#|$)","");
				}
				me.setValue(values);
			}else{
				
			}
			this.me = me;
		}

		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return (K) me.getKey();
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return (V) me.getValue();
		}

		@Override
		public V setValue(V value) {
			// TODO Auto-generated method stub
			return (V) me.setValue(value);
		}

	} 

	private class SqlBlindFilterRequestWrapper extends 	HttpServletRequestWrapper{

		private Map paramap;
		public SqlBlindFilterRequestWrapper(HttpServletRequest request) {
			super(request);
			Map tempMap=request.getParameterMap();
			Map buildMap = new HashMap();
			Iterator iterator = tempMap.entrySet().iterator();
			while (iterator.hasNext()) {
				SqlBlindEntry entry = new SqlBlindEntry<String,Object>((Entry) iterator.next());
				buildMap.put(entry.getKey(),entry.getValue());
			}
			paramap=buildMap;
		}

		@Override
		public String getParameter(String name) {
			// TODO Auto-generated method stub
			if (paramap.get(name) instanceof String) {
				return (String) paramap.get(name);
			}else if(paramap.get(name) instanceof String []){
				return ((String [])paramap.get(name))[0];
			}else{
				return super.getParameter(name);
			}
		}
		@Override
		public Map<String, String[]> getParameterMap() {
			// TODO Auto-generated method stub
			return paramap;
		}
		@Override
		public String[] getParameterValues(String name) {
			// TODO Auto-generated method stub
			if (paramap.get(name) instanceof String) {
				ArrayList<String> arr=new ArrayList<String>();
				arr.add((String) paramap.get(name));
				return arr.toArray(new String [1]);
			}else if(paramap.get(name) instanceof String []){
				return (String [])paramap.get(name);
			}else{
				return super.getParameterValues(name);
			}
		}

	}


}
