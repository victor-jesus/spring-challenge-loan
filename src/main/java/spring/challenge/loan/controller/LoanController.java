package spring.challenge.loan.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.challenge.loan.dto.CustomerLoanRequest;
import spring.challenge.loan.dto.CustomerLoanResponse;
import spring.challenge.loan.service.LoanService;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<CustomerLoanResponse> customerLoanRequest(@RequestBody @Valid CustomerLoanRequest request){
        var response = loanService.checkAvailability(request);

        return ResponseEntity.ok(response);
    }

}
