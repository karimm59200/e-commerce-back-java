package com.example.ecommerce.service;

import com.example.ecommerce.entity.User;

public interface UserService {

    User create(User user);

    User update(User user);

    User delete(User user);

    User findById(Integer id);

    User findByUsername(String username);

    User findByEmail(String email);


}
