package spring.challenge.loan.exceptions;

import org.springframework.validation.FieldError;

public class ErrorResponse{
    private final String error;
    private final String message;

    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }

    public ErrorResponse(FieldError error) {
        this.error = error.getField();
        this.message = error.getDefaultMessage();
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
