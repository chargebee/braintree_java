package com.braintreegateway.exceptions;

// Primarily to pass the IOException during Http connection to the App layer
public class BraintreeConnException extends BraintreeException {
    private static final long serialVersionUID = 1L;

    public BraintreeConnException(Throwable cause) {
        super(cause);
    }
    
}
