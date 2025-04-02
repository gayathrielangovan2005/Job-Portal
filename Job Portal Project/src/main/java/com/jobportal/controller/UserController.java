package com.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/profile")
    public String userProfile() {
        return "profile";
    }

    @GetMapping("/dashboard")
    public String userDashboard() {
        return "dashboard";
    }
} 