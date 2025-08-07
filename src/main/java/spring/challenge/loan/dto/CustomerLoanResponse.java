package spring.challenge.loan.dto;

import spring.challenge.loan.domain.Customer;
import spring.challenge.loan.domain.Loan;

import java.util.List;

public record CustomerLoanResponse(
        Customer customer,
        List<Loan> loans
){
}
