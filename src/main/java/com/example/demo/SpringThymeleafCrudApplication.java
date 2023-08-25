package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class SpringThymeleafCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafCrudApplication.class, args);
	}

}