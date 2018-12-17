package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.log4j.Logger;


@SpringBootApplication
public class DemoApplication {

	final static Logger logger = Logger.getLogger(DataLoader.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
