package com.hackathon.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.hackathon")
@SpringBootApplication
public class SpringbootDemoMaven1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoMaven1Application.class, args);
	}

}
