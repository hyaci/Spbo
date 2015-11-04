package cn.sccin.spboot.web;

import cn.sccin.spboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by developer_hyaci on 2015/9/24.
 */
@Controller
public class UserControl {
    @Autowired
    private UserService userService;

    @RequestMapping("/pub/register")
    public String register(@Param("username")String username,@Param("password") String password,Model model){
       /* if(username!=null &&!username.equals("")&&
                password!=null &&!password.equals("")){
            System.out.println(username + "<===>" + password);
            try {
                userService.register(username,password);
            }catch (Exception e){
                e.printStackTrace();
                model.addAttribute("error",true);
            }
        }*/
        return "register";
    }

    @RequestMapping("/foo")
    public String foo() {
        throw new RuntimeException("Expected exception in controller");
    }

}
