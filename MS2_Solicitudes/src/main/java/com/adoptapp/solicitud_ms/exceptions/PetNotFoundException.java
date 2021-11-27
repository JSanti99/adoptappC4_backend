package com.adoptapp.solicitud_ms.exceptions;

public class PetNotFoundException extends RuntimeException {

    public PetNotFoundException (String message) {
        super(message);
    }

}
