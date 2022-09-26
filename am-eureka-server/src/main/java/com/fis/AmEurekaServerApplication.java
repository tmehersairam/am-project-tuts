package com.fis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmEurekaServerApplication.class, args);
	}

}
