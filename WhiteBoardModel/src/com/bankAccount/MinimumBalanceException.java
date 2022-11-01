package com.bankAccount;

public class MinimumBalanceException extends Exception{

    public MinimumBalanceException() {
    }

    public MinimumBalanceException(String message) {
        super(message);
    }

    public MinimumBalanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MinimumBalanceException(Throwable cause) {
        super(cause);
    }
}
