package com.revature.AFLocationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.revature.entities"})
@EntityScan(basePackages = {"com.revature.entities"})

public class AfLocationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfLocationServiceApplication.class, args);
	}

}
