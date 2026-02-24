package com.feginClientDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeginClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginClientDemoApplication.class, args);
	}

}
