package org.carlosramosdev.curso.springboot.springbooterror.services;

import org.carlosramosdev.curso.springboot.springbooterror.models.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> users;
    public UserServiceImpl() {
        users = new ArrayList<>();
        users.add(new User(1L,"Pepe","González"));
        users.add(new User(2L,"Eduardo","Tronco"));
        users.add(new User(3L,"Manuela","Nuñez"));
        users.add(new User(4L,"Federico","Constantino"));
        users.add(new User(5L,"María","Hervás"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }
}
