package com.devsuperior.desafio.service.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {
    private static final long SerialVersionUID = 1L;

    public ResourceNotFoundExceptions(String msg) {
        super(msg);
    }
}
