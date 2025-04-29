package com.example.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class LapTop implements Computer{
    @Override
    public void complie(){
        System.out.println("Complie success");
    }
}
