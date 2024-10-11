package com.example.Spring_Blog.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User robert = new User("Robert Udrea", "robert@mail.com", "parola123");
            User alex = new User("Alex Pavel", "alex@mail.com", "alex1");

            userRepository.saveAll(List.of(robert, alex));
        };
    }
}
