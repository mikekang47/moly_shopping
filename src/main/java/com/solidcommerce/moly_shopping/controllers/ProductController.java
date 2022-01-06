package com.solidcommerce.moly_shopping.controllers;

import com.solidcommerce.moly_shopping.application.ProductService;
import com.solidcommerce.moly_shopping.domain.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    List<Product> getProducts() {
        return productService.getProducts();
    }


}
