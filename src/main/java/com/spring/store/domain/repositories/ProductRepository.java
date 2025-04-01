package com.spring.store.domain.repositories;

import com.spring.store.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}