package spring.challenge.loan.domain;

public enum LoanType {
    PERSONAL(4),
    GUARANTEED(3),
    CONSIGMENT(2);

    private final Integer interestRate;

    LoanType(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getInterestRate() {
        return interestRate;
    }
}
