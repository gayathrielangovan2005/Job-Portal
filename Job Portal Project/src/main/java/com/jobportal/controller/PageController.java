package com.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/jobs")
    public String jobs() {
        return "jobs";
    }

    @GetMapping("/companies")
    public String companies() {
        return "companies";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
} 