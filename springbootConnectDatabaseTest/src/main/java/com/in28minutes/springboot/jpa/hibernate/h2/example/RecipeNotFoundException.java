package com.in28minutes.springboot.jpa.hibernate.h2.example;

public class RecipeNotFoundException extends RuntimeException {
    public RecipeNotFoundException(Long id) {
    }

    public RecipeNotFoundException() {
    }

    public RecipeNotFoundException(String message) {
        super(message);
    }

    public RecipeNotFoundException(String message, Throwable cause) {
        super("500", cause);
    }
}
