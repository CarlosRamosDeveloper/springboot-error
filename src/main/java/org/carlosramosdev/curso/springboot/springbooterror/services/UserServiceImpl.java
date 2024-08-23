package org.carlosramosdev.curso.springboot.springbooterror.services;

import org.carlosramosdev.curso.springboot.springbooterror.exceptions.UserNotFoundException;
import org.carlosramosdev.curso.springboot.springbooterror.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }

        if (user == null) {
            throw new UserNotFoundException("Error, el usuario no existe");
        }
        return Optional.of(user);
    }
}
