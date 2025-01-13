package com.javalogin.javalogin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.javalogin.javalogin.model.User;
import com.javalogin.javalogin.repository.UserRepository;

@SpringBootApplication
public class JavaloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaloginApplication.class, args);
	}

	@Bean
    CommandLineRunner run(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("testuser", "password"));
        };
    }
}


