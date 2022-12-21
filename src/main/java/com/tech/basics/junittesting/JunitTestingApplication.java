package com.tech.basics.junittesting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JunitTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitTestingApplication.class, args);
		log.info("Here I am in main");

	}

}
