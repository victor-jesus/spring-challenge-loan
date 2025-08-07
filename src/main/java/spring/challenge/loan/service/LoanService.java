package spring.challenge.loan.service;

import org.springframework.stereotype.Service;
import spring.challenge.loan.domain.Loan;
import spring.challenge.loan.domain.LoanType;
import spring.challenge.loan.domain.Location;
import spring.challenge.loan.dto.CustomerLoanRequest;
import spring.challenge.loan.dto.CustomerLoanResponse;
import spring.challenge.loan.dto.LoanDTO;
import spring.challenge.loan.utils.LoanRulesUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponse checkAvailability(CustomerLoanRequest customerData){
        List<LoanDTO> loans = new ArrayList<>();
        
        if(isPersonalLoanAvailable(customerData)){
            loans.add(new LoanDTO(LoanType.PERSONAL.name(), LoanType.PERSONAL.getInterestRate()));
        }

        if(isGuaranteedLoanAvailable(customerData)){
            loans.add(new LoanDTO(LoanType.GUARANTEED.name(), LoanType.GUARANTEED.getInterestRate()));
        }

        if(isConsigmentLoanAvailable(customerData)){
            loans.add(new LoanDTO(LoanType.CONSIGMENT.name(), LoanType.CONSIGMENT.getInterestRate()));
        }

        return new CustomerLoanResponse(customerData.name(), loans);
    }

    private boolean isPersonalLoanAvailable(CustomerLoanRequest customerData) {
        return LoanRulesUtils.isValueEqualOrLessThan(customerData.income(), 3000.0)
                || LoanRulesUtils.isValueBetween(customerData.income(), 3000.0, 5000.0)
                && LoanRulesUtils.isValueLessThan(customerData.age(), 30)
                && LoanRulesUtils.isFrom(Location.SP, customerData.location());
    }

    private boolean isConsigmentLoanAvailable(CustomerLoanRequest customerData) {
        return LoanRulesUtils.isValueEqualOrGreaterThan(customerData.income(), 5000.0);
    }

    private boolean isGuaranteedLoanAvailable(CustomerLoanRequest customerData) {
        return LoanRulesUtils.isValueEqualOrLessThan(customerData.income(), 3000.0)
                || LoanRulesUtils.isValueBetween(customerData.income(), 3000.0, 5000.0)
                && LoanRulesUtils.isValueLessThan(customerData.age(), 30)
                && LoanRulesUtils.isFrom(Location.SP, customerData.location());
    }
}
