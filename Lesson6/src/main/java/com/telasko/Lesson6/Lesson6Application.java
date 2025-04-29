package com.telasko.Lesson6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lesson6Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Lesson6Application.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
