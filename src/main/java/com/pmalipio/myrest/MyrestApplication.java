package com.pmalipio.myrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
public class MyrestApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyrestApplication.class, args);
	}
}
