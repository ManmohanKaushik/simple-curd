package com.bikkadit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SimpleCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCurdApplication.class, args);
		log.info("Our Simple Curd Application is Running......................... ");
	}

}
