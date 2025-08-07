package spring.challenge.loan.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import spring.challenge.loan.exceptions.ErrorResponse;
import spring.challenge.loan.exceptions.LoanNotAvailableException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LoanNotAvailableException.class)
    public ResponseEntity<ErrorResponse> handleLoanException(LoanNotAvailableException exception){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorResponse("Erro: ", exception.getMessage()));
    }
}
