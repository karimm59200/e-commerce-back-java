package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findUserByLastName(String lastName);

   Client findUserByEmail(String email);


}
