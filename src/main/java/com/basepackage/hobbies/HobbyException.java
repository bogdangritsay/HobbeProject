package com.basepackage.hobbies;

public class HobbyException extends Exception {
    public HobbyException() {

    }

    public HobbyException(final String message) {
        super(message);
    }

    public HobbyException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public HobbyException(final Throwable cause) {
        super(cause);
    }

    public HobbyException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
