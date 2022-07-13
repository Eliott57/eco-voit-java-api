package com.ecovoit.EcoVoitAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcoVoitApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcoVoitApiApplication.class, args);
	}

}
