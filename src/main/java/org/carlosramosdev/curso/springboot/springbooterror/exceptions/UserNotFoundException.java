package org.carlosramosdev.curso.springboot.springbooterror.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
