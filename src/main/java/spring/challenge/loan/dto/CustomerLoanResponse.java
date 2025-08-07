package spring.challenge.loan.dto;

import jakarta.validation.constraints.NotBlank;
import spring.challenge.loan.domain.Loan;

import java.util.List;

public record CustomerLoanResponse(
        String customer,
        List<LoanDTO> loans
){
}
