package com.example.ecommerce.service;

import com.example.ecommerce.entity.Card;

public interface CardService {

        Card create(Card card);

        Card update(Card card);

        Card delete(Card card);

        Card findById(Integer id);

        Card findByLastName(String lastName);


}
