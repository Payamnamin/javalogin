package com.javalogin.javalogin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javalogin.javalogin.model.Product;
import com.javalogin.javalogin.model.User;
import com.javalogin.javalogin.repository.ProductRepository;
import com.javalogin.javalogin.repository.UserRepository;

@SpringBootApplication
public class JavaloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaloginApplication.class, args);
	}

	@Bean
    CommandLineRunner run(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("testuser", "password", "test@example.com", "John", "Doe")); // Create a new user.
        };
    }

	@Bean
CommandLineRunner loadData(ProductRepository productRepository) {
    return args -> {
        // Check if the database is emty or there is spme products in it.
        if (productRepository.count() == 0) {
            productRepository.save(new Product("Laptop", "High-performance laptop", 1200.0, "/images/laptop.jpg"));
            productRepository.save(new Product("Smartphone", "Latest model smartphone", 800.0, "/images/iphone.jpg"));
            productRepository.save(new Product("Headphones", "Noise-cancelling headphones", 200.0, "/images/headphone.jpg"));
         }
       };
    }
	

	
}


