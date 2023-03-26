package com.treeleaf.gatewayservice.service;


import com.treeleaf.gatewayservice.model.Role;

public interface RoleService {
    Role findByName(String name);
}
