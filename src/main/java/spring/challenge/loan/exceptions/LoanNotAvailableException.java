package spring.challenge.loan.exceptions;

public class LoanNotAvailableException extends RuntimeException {
    public LoanNotAvailableException(String message) {
        super(message);
    }
}
