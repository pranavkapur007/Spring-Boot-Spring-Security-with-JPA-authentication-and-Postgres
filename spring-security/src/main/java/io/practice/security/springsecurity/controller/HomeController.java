package io.practice.security.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "<H1>Welcome</H1>";
    }

    @RequestMapping("/admin")
    public String getAdmin(){
        return "<H1>Admin</H1>";
    }

    @RequestMapping("/user")
    public String getUser(){
        return "<H1>User</H1>";
    }
}
