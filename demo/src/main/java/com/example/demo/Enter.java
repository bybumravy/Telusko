package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Model.Dev;
@SpringBootApplication
public class Enter {
    public static void main(String[] args) {
         ApplicationContext context = SpringApplication.run(Enter.class, args);
        Dev d = context.getBean(Dev.class);
        
   
      
    }

}
