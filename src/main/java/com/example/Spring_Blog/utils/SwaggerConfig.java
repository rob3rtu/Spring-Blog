package com.example.Spring_Blog.utils;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI defineSwagger() {
        Server server = new Server();
        server.setUrl("https://localhost:8080");
        server.setDescription("Development");

        Contact myContact = new Contact();
        myContact.setName("Robert Udrea");
        myContact.setEmail("robert.udrea@cst.ro");

        Info swaggerInformation = new Info()
                .title("Spring Blog API")
                .version("1.0.0")
                .description("API Documentation")
                .contact(myContact);

        return new OpenAPI().info(swaggerInformation).servers(List.of(server));
    }
}
