package com.gec.djexam.controller;

import com.gec.djexam.domain.User;
import com.gec.djexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String workId, String password, HttpSession session){

        if("116060300114".equals(workId)&&"123".equals(password)){
            session.setAttribute("workId",workId);
            return "forward:../index/index";
        }
        return "redirect:tologin";
    }


}
