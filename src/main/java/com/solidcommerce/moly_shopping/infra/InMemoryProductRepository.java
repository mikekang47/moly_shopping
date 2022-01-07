package com.solidcommerce.moly_shopping.infra;

import com.solidcommerce.moly_shopping.domain.Product;
import com.solidcommerce.moly_shopping.domain.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryProductRepository implements ProductRepository {
    private final List<Product> products = new ArrayList<>();
    private Long newId = 0L;

    @Override
    public List<Product> findAll() {
        return products;
    }
}
