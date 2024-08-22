package org.carlosramosdev.curso.springboot.springbooterror.controllers;

import org.carlosramosdev.curso.springboot.springbooterror.models.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> dividedByZero(Exception e){

        return ResponseEntity.internalServerError().body("Error 500");
    }
}
