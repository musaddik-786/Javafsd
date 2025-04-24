package com.example.demo.exception;


public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resource) {
        super("Resource not found: " + resource);
    }
}
