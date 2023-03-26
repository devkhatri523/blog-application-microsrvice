package com.treeleaf.gatewayservice.service.impl;


import com.treeleaf.gatewayservice.dao.RoleDao;
import com.treeleaf.gatewayservice.model.Role;
import com.treeleaf.gatewayservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByName(String name) {
        Role role = roleDao.findRoleByName(name);
        return role;
    }
}
