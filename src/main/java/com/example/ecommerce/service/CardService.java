package com.example.ecommerce.service;

import com.example.ecommerce.entity.Card;

import java.util.Optional;

public interface CardService {

        Card create(Card card);

        Card update(Card card);

        Card delete(Card card);

        Optional<Card> findById(Integer id);

        Card findByLastName(String lastName);


}
