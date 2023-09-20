package com.example.ecommerce.service.impl;

import com.example.ecommerce.dto.ProductDto;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
     ProductRepository productRepository;

     ModelMapper modelMapper;

        public ProductServiceImpl(ProductRepository productRepository) {

            this.productRepository = productRepository;
            this.modelMapper = new ModelMapper();
        }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

//    @Override
//    public Product findById(Integer id) {
//        return productRepository.findById(id).get();
//    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public Product findByCategory(String category) {
        return productRepository.findProductByCategory(category);
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        product = productRepository.save(product);
        return modelMapper.map(product, ProductDto.class);


    }

    @Override
    public void updateProduct(ProductDto productDto) {
        Product product = productRepository.findById(productDto.getId()).get();
        product.setCategory(productDto.getCategory());
        product.setName(productDto.getName());
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
