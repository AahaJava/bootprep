package com.ahk.boot.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("start")
public class WelcomeController {

    @GetMapping("welcome")
    public String sayWelcome(){
        //return "Welcome to Spring Application without security";
        return "Welcome to Spring Application with security";
    }

    @GetMapping("/session")
    public String sessionInfo(HttpSession session) {
        return "Session ID: " + session.getId() + ", Last Accessed: " + session.getLastAccessedTime();
    }
}
