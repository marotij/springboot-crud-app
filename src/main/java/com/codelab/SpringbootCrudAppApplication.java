package com.codelab;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Employee-Service",
		version = "1.0.0",
		description = "Employees Management Service Information"
),
		servers = @Server(
				url = "http://localhost:9091",
				description = "Employee Rest Api"

		)

)
public class SpringbootCrudAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootCrudAppApplication.class, args);
	}

}
