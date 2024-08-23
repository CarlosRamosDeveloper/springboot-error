package org.carlosramosdev.curso.springboot.springbooterror.services;

import org.carlosramosdev.curso.springboot.springbooterror.models.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);
}
