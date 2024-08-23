package org.carlosramosdev.curso.springboot.springbooterror.controllers;

import org.carlosramosdev.curso.springboot.springbooterror.models.domain.User;
import org.carlosramosdev.curso.springboot.springbooterror.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping()
    public String index() {
//        int value = 100 / 0;
        int value = Integer.parseInt("1x0");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public Optional<User> showUser(@PathVariable(name = "id") Long id){
        return service.findById(id);
    }
}
