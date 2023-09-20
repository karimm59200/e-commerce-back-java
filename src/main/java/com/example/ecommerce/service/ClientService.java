package com.example.ecommerce.service;

import com.example.ecommerce.dto.ClientDto;
import com.example.ecommerce.entity.Client;

import java.util.Optional;

public interface ClientService {

    ClientDto create(ClientDto clientDto);



    Client update(ClientDto client);

   void delete(Client client);

   Optional<Client> findById(Integer id);

    Client findByUsername(String username);

    Client findByEmail(String email);


    Iterable<Client> findAll();
}
