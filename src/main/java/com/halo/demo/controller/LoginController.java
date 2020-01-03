package com.halo.demo.controller;

import com.halo.demo.model.Admin;
import com.halo.demo.model.Teacher;
import com.halo.demo.service.LoginService;
import com.halo.demo.service.LoginService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.net.ssl.SSLEngine;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/11/4 10:22.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private LoginService1 loginService1;
    private static Cookie cookie;
    @GetMapping("/")
    public String index(){
        return "login";
    }

    @GetMapping("/login")
    public String get(){
        return "login";
    }

//    教师登陆
    @PostMapping("/login")
    @RequestMapping("/login")
    public String login(@RequestParam(value = "tno", required = false) Integer tno,
                           @RequestParam(value = "tpassword", required = false) String tpassword,
                        HttpServletRequest request, HttpServletResponse response) {
        //存入session
        HttpSession session=request.getSession();
        session.setAttribute("type",1);
        session.setAttribute("tno",tno);

//存入cookie
        cookie = new Cookie("type","2");
        response.addCookie(cookie);

        Teacher teacher = new Teacher();
        teacher.setTno(tno);
        teacher.setTpassword(tpassword);
        int res = loginService.verfity(teacher);
        if(res == 1){
            return "redirect:index";
        }
        return "login";
    }

    //    管理员登陆
    @PostMapping("/login1")
    @RequestMapping("/login1")
    public String login1(@RequestParam(value = "tno1", required = false) Integer tno1,
                         @RequestParam(value = "tpassword1", required = false) String tpassword1,
                         HttpServletRequest request, HttpServletResponse response) {
        HttpSession session=request.getSession();
        session.setAttribute("type",1);

        cookie = new Cookie("type","1");
        response.addCookie(cookie);

        Admin admin = new Admin();
        admin.setTno(tno1);
        admin.setTpassword(tpassword1);
        int res = loginService1.verfity(admin);

        if(res == 1){
            return "redirect:index";
        }
        return "login";
    }
}
