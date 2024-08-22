package org.carlosramosdev.curso.springboot.springbooterror.services;

import org.carlosramosdev.curso.springboot.springbooterror.models.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
}
