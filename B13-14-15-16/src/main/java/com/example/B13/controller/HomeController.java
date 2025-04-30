package com.example.B13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {
    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "Hello World";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't teach, we educate";
    }
}

