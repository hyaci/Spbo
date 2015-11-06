function filterparam(obj){
	var filter='';
	var issearch=false;
	if(obj.searching==true){
		issearch=true;
	}
	for(var key in obj){
		if(key != undefined){
			filter=filterparamValue(obj[key],issearch);
			if(filter==0){
				filter='';
			}else{
				break;
			}
		}
	}
	return filter;
}

function filterparamValue(value,issearch){
	value=value+'';
	if(issearch){
		if(value.indexOf('/')!=-1){
			return '含有特殊字符/';
		}else if(value.indexOf('>')!=-1){
			return '含有特殊字符>';
		}else if(value.indexOf('<')!=-1){
			return '含有特殊字符<';
		}else if(value.indexOf('#')!=-1){
			return '含有特殊字符#';
		}
	}
	if(value.indexOf('|')!=-1){
		return '含有特殊字符|';
	}else if(value.indexOf('\\')!=-1){
		return '含有特殊字符\\';
	}else if(value.indexOf('&')!=-1){
		return '含有特殊字符&';
	}else if(value.indexOf(';')!=-1){
		return '含有特殊字符;';
	}else if(value.indexOf('$')!=-1){
		return '含有特殊字符$';
	}else if(value.indexOf('%')!=-1){
		return '含有特殊字符%';
	}else if(value.indexOf('@')!=-1){
		return '含有特殊字符@';
	}else if(value.indexOf('\'')!=-1){
		return '含有特殊字符\'';
	}else if(value.indexOf('"')!=-1){
		return '含有特殊字符"';
	}else if(value.indexOf('\\\'')!=-1){
		return '含有特殊字符\\\'';
	}else if(value.indexOf('\\"')!=-1){
		return '含有特殊字符\\"';
	}else if(value.indexOf('>')!=-1){
		if(value.indexOf('<')!=-1){
			return '含有特殊字符<>';
		}
		return 0;
	}else{
		return 0;
	}
}
