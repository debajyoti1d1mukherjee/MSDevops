package com.ibm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//This is a boot application hook test
@SpringBootApplication
@EnableMongoRepositories("com.ibm.demo.repository")

@EnableCaching
public class MobileLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileLoginApplication.class, args);
	}
//main method added	
	public void run() {
		
	}
}














