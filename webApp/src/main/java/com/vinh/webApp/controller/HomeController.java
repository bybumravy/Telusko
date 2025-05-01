package com.vinh.webApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to my website";

    }
    @RequestMapping("/about")
    public String about(){
        return "We dont...";
    }
}
