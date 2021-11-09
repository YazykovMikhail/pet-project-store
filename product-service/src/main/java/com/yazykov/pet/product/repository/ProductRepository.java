package com.yazykov.pet.product.repository;

import com.yazykov.pet.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
