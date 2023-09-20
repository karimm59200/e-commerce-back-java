package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Card;
import com.example.ecommerce.repository.CardRepository;
import com.example.ecommerce.service.CardService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardServiceImpl  implements CardService {

    private CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card create(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card update(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card delete(Card card) {
        cardRepository.delete(card);
        return card;
    }

//    @Override
//    public Card findById(Integer id) {
//        return cardRepository.findById(id).get();
//    }

    @Override
    public Optional<Card> findById(Integer id) {
        return cardRepository.findById(id);
    }

    @Override
    public Card findByLastName(String lastName) {
        return null;
    }


}
