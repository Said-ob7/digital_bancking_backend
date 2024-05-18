package com.emsi.digital_bancking_backend.exceptions;

public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String customerNotFound) {
        super(customerNotFound);
    }
}
