package com.epam.airplaneservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "airplane not found")
public class NoAirplaneException extends RuntimeException{
    public NoAirplaneException(String message){
        super(message);
    }
}
