package com.py.Lesson25.repo;

import com.py.Lesson25.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}