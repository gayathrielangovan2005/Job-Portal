package com.example.jobPortal.controller;

import com.example.jobPortal.model.JobPost;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class jobControl {

    
    private JobPost jobPost;


    @GetMapping({"/","/home"})
    public String index() {
        return "home"; // JSP view
    }

    @GetMapping("/viewalljobs")
    public String view(){
        return "viewalljobs";
    }

    @GetMapping("/addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleform(JobPost jobPost){
        return "success";
    }
}
