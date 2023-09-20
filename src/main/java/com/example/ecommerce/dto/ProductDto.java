package com.example.ecommerce.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Integer id;
    private String name;
    private String category;

    public ProductDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductCreationDTO{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
