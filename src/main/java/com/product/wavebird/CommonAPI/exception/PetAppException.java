package com.product.wavebird.CommonAPI.exception;

import org.springframework.http.HttpStatus;

public class PetAppException extends RuntimeException {


    private static final long serialVersionUID = -5295235692274246795L;
    private final HttpStatus status;

    public PetAppException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return this.status;
    }

}