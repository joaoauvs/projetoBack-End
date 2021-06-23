package com.appsala.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.appsala.app.controllers",
				"com.appsala.app.entities",
				"com.appsala.app.enuns",
				"com.appsala.app.repository",
				"com.appsala.app.services"
		}
		)
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}