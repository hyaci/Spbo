package cn.sccin.spboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * Created by developer_hyaci on 2015/10/23.
 */
@Controller
public class HtmlControl {


    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        //登陆之后的页面跳转()
        return "home";
    }

    @RequestMapping("/pub/index.html")
    public String index(HttpServletResponse response,HttpServletRequest request, Model model) {
        return "index";
    }

    @RequestMapping(value = { "/sqlblind.html" })
    public String sqlblind() {
        return "sqlblindMsg";
    }
}
