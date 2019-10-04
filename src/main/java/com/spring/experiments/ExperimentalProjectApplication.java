package com.spring.experiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Test")
public class ExperimentalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentalProjectApplication.class, args);
	}

}
