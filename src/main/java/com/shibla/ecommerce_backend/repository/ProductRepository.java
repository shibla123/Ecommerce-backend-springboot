package com.shibla.ecommerce_backend.repository;

import com.shibla.ecommerce_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}