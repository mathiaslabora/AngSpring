package com.example.angspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan
@EnableJpaRepositories(basePackages = "com.example.angspring")
@EnableTransactionManagement
@SpringBootApplication
public class AngSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngSpringApplication.class, args);
	}

}
