package com.yazykov.pet.store.product.repository;

import com.yazykov.pet.store.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
