package com.microservices.microservicesevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MicroservicesEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEventsApplication.class, args);
	}

}
