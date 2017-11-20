package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Demo01Application {

	@RequestMapping("/")
	String hello() {
		return "hoge";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo01Application.class, args);
	}
}
