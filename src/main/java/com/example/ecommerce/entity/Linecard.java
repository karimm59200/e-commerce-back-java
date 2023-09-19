package com.example.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Linecard {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private int cardId;

    private int productId;

    private int quantity;

    private double price;
}
