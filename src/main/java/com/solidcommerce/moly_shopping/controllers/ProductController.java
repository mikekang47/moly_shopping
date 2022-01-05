package com.solidcommerce.moly_shopping.controllers;

import com.solidcommerce.moly_shopping.domain.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> products = new ArrayList<>();
    Long newId = 0L;

    @GetMapping
    List<Product> getProducts() {
        return products;
    }

    void generateId() {
        newId++;
    }
}
