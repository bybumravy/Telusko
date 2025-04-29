package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class HomeController {
   
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        System.err.println("IM here");
        System.out.println("hello word");
        return "Hello world";
    }
    @RequestMapping("/about")
    public String about(){
        return "ok";
    }
}
