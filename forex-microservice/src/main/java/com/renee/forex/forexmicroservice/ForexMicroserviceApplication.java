package com.renee.forex.forexmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ForexMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexMicroserviceApplication.class, args);
	}
}
