package com.example.shelter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@OpenAPIDefinition
public class ShelterBotTgApplication {

	public static void main(String[] args) {
		System.out.println("Start project");
		SpringApplication.run(ShelterBotTgApplication.class, args);
	}

}
