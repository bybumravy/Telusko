package com.example.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class DeskTop implements Computer{
   
    
    @Override
    public void complie() {
        System.out.println("Comilie success fullly");
    }
}
