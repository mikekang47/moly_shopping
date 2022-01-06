package com.solidcommerce.moly_shopping.controllers;

import com.solidcommerce.moly_shopping.application.ProductService;
import com.solidcommerce.moly_shopping.domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(ProductController.class)
class ProductControllerTest {
    @MockBean
    private ProductService productService;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    void setUp() {
        Product product = new Product();
        given(productService.getProducts()).willReturn(List.of(product));

    }

    @Test
    void getProducts() throws Exception{
        mvc.perform(get("/products")).andExpect(status().isOk());
    }
}