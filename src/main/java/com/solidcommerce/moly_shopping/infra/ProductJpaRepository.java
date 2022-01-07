package com.solidcommerce.moly_shopping.infra;

import com.solidcommerce.moly_shopping.domain.Product;
import com.solidcommerce.moly_shopping.domain.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface ProductJpaRepository
    extends ProductRepository, CrudRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    List<Product> findAll();
}
