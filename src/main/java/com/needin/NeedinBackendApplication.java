package com.needin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class NeedinBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(NeedinBackendApplication.class, args);
	}
}

