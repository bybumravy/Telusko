package com.example.demo.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class Dev {
    @Autowired
    @Qualifier("lapTop")  // Đảm bảo tên bean là "lapTop" (chữ thường)
    private Computer lap; 
    public void build() {
        lap.complie();
        System.out.println("Building Dev...");
    }
}
