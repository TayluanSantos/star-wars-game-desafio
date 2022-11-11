package com.tayluan.starwargame.exception.response;

public class ValidationErrorMessage {
    private String field;
    private String message;

    public ValidationErrorMessage(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }
}
