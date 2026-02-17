package com.cts.backend.platform.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI traveleaseApi() {
        return new OpenAPI()
                .info(new Info().title("TravelEase API")
                                .description("Reservation, Operations & Guest Experience APIs")
                                .version("v1"));
    }
}
