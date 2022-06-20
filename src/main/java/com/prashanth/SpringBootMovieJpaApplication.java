package com.prashanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootMovieJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMovieJpaApplication.class, args);
	}

}
