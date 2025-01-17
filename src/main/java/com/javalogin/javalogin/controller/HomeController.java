package com.javalogin.javalogin.controller;

import com.javalogin.javalogin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    private ProductRepository productRepository;

    // Home Page
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "index"; 
    }

    // Product Details
    @GetMapping("/product/{id}")
    public String productDetails(@PathVariable Long id, Model model) {
        var product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID: " + id));
        model.addAttribute("product", product);
        return "product-details";
    }
}