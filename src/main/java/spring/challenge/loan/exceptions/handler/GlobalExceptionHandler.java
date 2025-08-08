package spring.challenge.loan.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import spring.challenge.loan.exceptions.ErrorResponse;
import spring.challenge.loan.exceptions.LoanNotAvailableException;

import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LoanNotAvailableException.class)
    public ResponseEntity<ErrorResponse> handleLoanException(LoanNotAvailableException exception){
        return ResponseEntity
                .unprocessableEntity()
                .body(new ErrorResponse("Não foi possível: ", exception.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorResponse>> handleBlankOrNullField(MethodArgumentNotValidException exception){
        var errors = exception.getFieldErrors();
        return ResponseEntity.badRequest().body(errors.stream()
                .map(ErrorResponse::new)
                .toList());
    }
}
