package org.carlosramosdev.curso.springboot.springbooterror;

import org.carlosramosdev.curso.springboot.springbooterror.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataConfig {
    private List<User> users;

    @Bean("CreateUsers")
    public List<User> createUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"Pepe","González"));
        users.add(new User(2L,"Eduardo","Tronco"));
        users.add(new User(3L,"Manuela","Nuñez"));
        users.add(new User(4L,"Federico","Constantino"));
        users.add(new User(5L,"María","Hervás"));
        return users;
    }
}
