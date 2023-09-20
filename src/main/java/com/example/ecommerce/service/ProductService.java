package com.example.ecommerce.service;

import com.example.ecommerce.dto.ProductDto;
import com.example.ecommerce.entity.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    // recherche de tous les produits.
    List<Product> findAll();

    Optional<Product> findById(Integer id);

    // recherche de produit par categorie.
    Product findByCategory(String category);

    ProductDto save(ProductDto productDto);

    void updateProduct(ProductDto productDto);

    void deleteProduct(Integer id);
}
