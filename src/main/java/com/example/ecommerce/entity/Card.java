package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Card {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private int id;

    private LocalDateTime dateAndTime;

    @OneToMany(mappedBy = "card")
   private List<LineProduct> linecards;

    @ManyToOne
    private Client client;


}
