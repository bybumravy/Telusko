package com.example.B18;

import com.example.B18.model.Product;
import com.example.B18.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductRepo repo) {
        return args -> {
            Product anh = new Product(
                    101,
                    "Iphone",
                    20000
            );

            Product Min = new Product(
                    102,
                    "Camera",
                    70000
            );

            repo.saveAll(
                    List.of(anh, Min)
            );
        };
    }

}
