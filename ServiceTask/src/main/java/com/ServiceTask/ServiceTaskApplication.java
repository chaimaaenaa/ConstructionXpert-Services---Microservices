package com.ServiceTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTaskApplication.class, args);
	}

}
