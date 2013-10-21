package com.braintreegateway.exceptions;

public class BraintreeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BraintreeException(String message) {
        super(message);
    }

    public BraintreeException() {
        super();
    }

    public BraintreeException(Throwable cause) {
        super(cause);
    }
}
