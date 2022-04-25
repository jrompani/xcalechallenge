package com.xcalechallenge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MicroserviceRespuestas2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRespuestas2Application.class, args);
	}

}
