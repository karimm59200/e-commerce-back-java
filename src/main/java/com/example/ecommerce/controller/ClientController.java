package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ClientDto;
import com.example.ecommerce.entity.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ecommerce.service.ClientService;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private ClientService clientService;


    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/create_client")
    public ResponseEntity<ClientDto> addClient(@RequestBody ClientDto clientDto){
        return new ResponseEntity<ClientDto>( clientService.create(clientDto), HttpStatus.CREATED);
    }

    @GetMapping("/get_client/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Integer id){
        return new ResponseEntity<Client>(clientService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping("/get_all_client")
    public ResponseEntity<Iterable<Client>> getAllClient(){
        return new ResponseEntity<Iterable<Client>>(clientService.findAll(), HttpStatus.OK);
    }

    @PutMapping("/update_client")
    public ResponseEntity<Client> updateClient(@RequestBody ClientDto clientDto){
        clientService.update(clientDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete_client/{id}")
    public ResponseEntity<Client> deleteClient(@PathVariable("id") Integer id){
        Client client = clientService.findById(id).get();

        clientService.delete(client);
        return new ResponseEntity<>(HttpStatus.OK);
    }






}
