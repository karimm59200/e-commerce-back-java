package com.example.ecommerce.dto;

import com.example.ecommerce.entity.Card;
import com.example.ecommerce.entity.Product;
import lombok.Data;

@Data
public class LineProductDto {


    private int id;

    private Card card;


    private Product product;

    private int quantity;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LineProductDTO{" +
                "id=" + id +
                ", card=" + card +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
