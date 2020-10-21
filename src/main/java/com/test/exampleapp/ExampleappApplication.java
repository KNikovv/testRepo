package com.test.exampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ExampleappApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExampleappApplication.class, args);
	}
  
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ExampleappApplication.class);
	}

}
