package unam.diplomado.pixup.discoservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@OpenAPIDefinition(
		info = @Info (
				version = "v1",
				title = "Pixup Disco Microservice Endpoints",
				description = "Definicion de los Endpoints de Disco Service para el Sistema Pixup",
				contact = @Contact(
						name = "UNAM",
						url = "https://www.unam.mx",
						email = "delizad01@gmail.com")
				)
		)

public class OpenApiConfig {

}

