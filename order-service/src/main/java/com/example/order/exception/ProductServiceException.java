package com.example.order.exception;

import org.springframework.http.HttpStatus;

public class ProductServiceException extends RuntimeException {

    private final HttpStatus status;

    public ProductServiceException(String message) {
        this(message, null, HttpStatus.BAD_GATEWAY);
    }

    public ProductServiceException(String message, Throwable cause) {
        this(message, cause, HttpStatus.BAD_GATEWAY);
    }

    public ProductServiceException(String message, HttpStatus status) {
        this(message, null, status);
    }

    public ProductServiceException(String message, Throwable cause, HttpStatus status) {
        super(message, cause);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
