package spring.challenge.loan.dto;

import spring.challenge.loan.domain.Loan;

public record LoanDTO(
        String typeName,
        Integer interest_rate
) {
    public LoanDTO(Loan loan){
        this(loan.getEnumType().name(), loan.getEnumType().getInterestRate());
    }
}
