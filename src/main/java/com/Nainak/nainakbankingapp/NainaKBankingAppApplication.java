package com.Nainak.nainakbankingapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
	(info = @Info(
			title = "The Naina-k Bank APP",
		description = "Backend Rest APIs for Naina-k Bank",
		version = "v1.0",
		contact = @Contact(
				name = "WAINAINA WAITIKI",
				email = "victorwainaina4@gmail.com",
				url = "https://github.com/Waitiki"
		),

		license = @License(
				name = "Naina-k",
				url = "https://github.com/Waitiki"
		)
),
		externalDocs = @ExternalDocumentation(
				description = "The Naina-k Bank App Documentation",
		url = "https://github.com/Waitiki"
))

public class NainaKBankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NainaKBankingAppApplication.class, args);
	}

}
