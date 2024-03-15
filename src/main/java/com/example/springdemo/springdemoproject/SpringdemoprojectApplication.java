package com.example.springdemo.springdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.springdemo")
public class SpringdemoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoprojectApplication.class, args);
	}

}
