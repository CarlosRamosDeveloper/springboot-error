package org.carlosramosdev.curso.springboot.springbooterror.controllers;

import org.carlosramosdev.curso.springboot.springbooterror.models.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> dividedByZero(Exception e){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Error: No se puede dividir por cero!");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
        return ResponseEntity.internalServerError().body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFoundException(NoHandlerFoundException nhfe){

        Error error = new Error();
        error.setDate(new Date());
        error.setError("Api rest no encontrado!");
        error.setMessage(nhfe.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(404).body(error);
    }
}
