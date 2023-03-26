package com.treeleaf.gatewayservice.service;


import com.treeleaf.gatewayservice.model.User;
import com.treeleaf.gatewayservice.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
