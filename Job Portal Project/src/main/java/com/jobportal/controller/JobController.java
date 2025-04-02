package com.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/jobs")
public class JobController {

    @GetMapping("/post")
    public String postJob() {
        return "post-job";
    }

    @PostMapping("/post")
    public String submitJob() {
        // TODO: Implement job posting logic
        return "redirect:/jobs";
    }

    @GetMapping("/apply/{id}")
    public String applyForJob() {
        // TODO: Implement job application logic
        return "apply-job";
    }

    @PostMapping("/apply/{id}")
    public String submitApplication() {
        // TODO: Implement application submission logic
        return "redirect:/jobs";
    }
} 