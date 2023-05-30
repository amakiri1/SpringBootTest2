package myPackage.boot.controller;/*
 *ClassName:LoginController
 *Package:myPackage.boot.controller
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/25-13:12
 *Version:v1.0
 */

import myPackage.boot.pojo.User;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @GetMapping("/")
    public String loginPage(){
        return "login";
    }
    @PostMapping("login")
    public String login(User user, HttpSession session){
        if(user.getPassword().equals("123")){
            session.setAttribute("user",user);
            return "success";
        }else {
            return "login";
        }
    }
}
