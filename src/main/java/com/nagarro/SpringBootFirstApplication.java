package com.nagarro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication implements CommandLineRunner{

	public static final Logger logger =LoggerFactory.getLogger(SpringBootFirstApplication.class);
	public static void main(String[] args) {
		logger.info("Its a continous integration job ");
		SpringApplication.run(SpringBootFirstApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("It is my second logger");
		
	}

}
