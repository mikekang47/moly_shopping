package com.solidcommerce.moly_shopping.infra;

import com.solidcommerce.moly_shopping.domain.Product;
import com.solidcommerce.moly_shopping.domain.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface JpaProductRepository
    extends ProductRepository, CrudRepository<Product, Long>{
    List<Product> findAll();
}
