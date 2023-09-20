package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ProductDto;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.service.ProductService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    private ProductService productService;



    public ProductController(ProductService productService) {
        this.productService = productService;

    }


    @PostMapping("/create_product")
    public ResponseEntity<ProductDto>addProduct(@RequestBody ProductDto productDto){
        return new ResponseEntity<ProductDto>( productService.save(productDto), HttpStatus.CREATED);
    }

    @GetMapping("/get_product/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") Integer id){
        return new ResponseEntity<Optional<Product>>(productService.findById(id), HttpStatus.OK);
    }

    @GetMapping("get_all_product")
    public ResponseEntity<Iterable<Product>> getAllProduct(){
        return new ResponseEntity<Iterable<Product>>(productService.findAll(), HttpStatus.OK);
    }

    @PutMapping("/update_product")
    public ResponseEntity<Product> updateProduct(@RequestBody ProductDto productDto){
        productService.updateProduct(productDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete_product/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Integer id){
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
