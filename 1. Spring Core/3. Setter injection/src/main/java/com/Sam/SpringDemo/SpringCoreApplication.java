package com.Sam.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.Sam.SpringDemo",
		"com.Sam.util"
		})
public class SpringCoreApplication
	{
		// Component Scanning
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
	}
}
