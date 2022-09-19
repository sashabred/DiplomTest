package com.example.test;

import com.example.test.model.Address;
import com.example.test.model.House;
import com.example.test.service.HouseServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	CommandLineRunner run(HouseServiceImpl houseService) {
		return args -> {
			houseService.save(new House(new Address( "Russia", "Ulan-Ude", "Babushkina"), "32"));
		};
	}
}
