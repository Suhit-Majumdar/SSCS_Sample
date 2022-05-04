package com.wipro.ospo.sscs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class AppConfiguration {

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Software Supply Chain Security [SSCS] - SBOM Microservice")
						.description("Service that manages the SBOM activities of SSCS.").version("v0.0.1")
						.license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0")))
				.externalDocs(new ExternalDocumentation().description("SBOM Documentation")
						.url("https://github.com/wipro-ospo-coe/SSCS-SBOM"));
	}
}