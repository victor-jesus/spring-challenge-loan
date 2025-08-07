package spring.challenge.loan.domain;

public class Loan {
    private String customer;
    private LoanType type;

    public Loan(String customer, LoanType type) {
        this.customer = customer;
        this.type = type;
    }

    public String getCustomer() {
        return customer;
    }

    public LoanType getEnumType() {
        return type;
    }


}
