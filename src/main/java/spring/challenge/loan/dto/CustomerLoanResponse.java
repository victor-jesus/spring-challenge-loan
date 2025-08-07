package spring.challenge.loan.dto;

import java.util.List;

public record CustomerLoanResponse(
        String customer,
        List<LoanDTO> loans
){
}
