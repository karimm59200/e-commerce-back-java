package com.example.ecommerce.dto;

import com.example.ecommerce.entity.Client;
import com.example.ecommerce.entity.LineProduct;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CardDto {


    private int id;
    private LocalDateTime dateAndTime;

    private List<LineProduct> linecards;

    private Client client;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public List<LineProduct> getLinecards() {
        return linecards;
    }

    public void setLinecards(List<LineProduct> linecards) {
        this.linecards = linecards;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "CardDTO{" +
                "id=" + id +
                ", dateAndTime=" + dateAndTime +
                ", linecards=" + linecards +
                ", client=" + client +
                '}';
    }
}
