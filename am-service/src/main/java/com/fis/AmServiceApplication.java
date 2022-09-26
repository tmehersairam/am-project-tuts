package com.fis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class AmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmServiceApplication.class, args);
	}

}
