package com.javalogin.javalogin.repository;

import com.javalogin.javalogin.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}