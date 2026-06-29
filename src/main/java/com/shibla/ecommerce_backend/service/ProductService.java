package com.shibla.ecommerce_backend.service;

import com.shibla.ecommerce_backend.entity.Product;
import com.shibla.ecommerce_backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Add Product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Get All Products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get Product By ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
    public Product updateProduct(Long id, Product updatedProduct) {

        Product product = productRepository.findById(id).orElse(null);

        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());
            product.setImageUrl(updatedProduct.getImageUrl());

            return productRepository.save(product);
        }

        return null;
    }

    // Delete Product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}