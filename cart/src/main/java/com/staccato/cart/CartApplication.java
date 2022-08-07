package com.staccato.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
//@EnableSwagger2
@SpringBootApplication
public class CartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}
//	 @Bean
//
//     public Docket demoSwaggerApi() {
//
//         return new Docket(DocumentationType.SWAGGER_2)
//        		 .select()
//        		 .apis(RequestHandlerSelectors.basePackage("com.staccato.cart.controller"))
//                 .build();
//
//     }
}
