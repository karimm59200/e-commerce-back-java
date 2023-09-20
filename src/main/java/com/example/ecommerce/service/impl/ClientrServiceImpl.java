package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Client;
import com.example.ecommerce.dto.ClientDto;
import com.example.ecommerce.repository.ClientRepository;
import com.example.ecommerce.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientrServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    private ModelMapper modelMapper;

    public ClientrServiceImpl(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
        this.modelMapper = new ModelMapper();
    }


//    @Override
//    public ClientDto create(ClientDto clientDto) {
//        Client client = modelMapper.map(clientDto, Client.class);
//        client = clientRepository.save(client);
//        return modelMapper.map(client, ClientDto.class);
//    }

    @Override
    public ClientDto create(ClientDto clientDto) {
        Client client = modelMapper.map(clientDto, Client.class);
        client = clientRepository.save(client);
        return modelMapper.map(client, ClientDto.class);
    }


    @Override
    public Client update(ClientDto client) {
        Client client1 = modelMapper.map(client, Client.class);
        return clientRepository.save(client1);

    }


    @Override
    public void delete(Client id) {
        clientRepository.delete(id);

    }

//    @Override
//    public User findById(Integer id) {
//        return userRepository.findById(id).get();
//    }

    @Override
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client findByUsername(String lastName) {
        return clientRepository.findUserByLastName(lastName);
    }

    @Override
    public Client findByEmail(String email) {
        return clientRepository.findUserByEmail(email);
    }

    @Override
    public Iterable<Client> findAll() {return clientRepository.findAll();}
}
