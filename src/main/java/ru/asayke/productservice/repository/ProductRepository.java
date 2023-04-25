package ru.asayke.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.asayke.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}