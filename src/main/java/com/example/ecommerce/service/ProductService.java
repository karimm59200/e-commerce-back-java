package com.example.ecommerce.service;

import com.example.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {

    // recherche de tous les produits.
    List<Product> findAll();

    Product findById(Integer id);

    // recherche de produit par categorie.
    Product findByCategory(String category);
}
