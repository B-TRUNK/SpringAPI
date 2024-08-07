package com.spring.REST.Repos;

import com.spring.REST.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product ,Integer> {
}
