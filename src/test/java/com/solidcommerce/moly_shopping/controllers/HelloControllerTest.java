package com.solidcommerce.moly_shopping.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloControllerTest {
    HelloController helloController = new HelloController();

    @Test
    void sayHello() {
        assertThat(helloController.sayHello()).isEqualTo("Hello world");
    }

}