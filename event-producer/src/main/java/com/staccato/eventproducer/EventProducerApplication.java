package com.staccato.eventproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class EventProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventProducerApplication.class, args);
	}

}
