package com.nameless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Api2eurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Api2eurekaApplication.class, args);
	}
}
