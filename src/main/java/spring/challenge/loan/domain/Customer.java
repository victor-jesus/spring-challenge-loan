package spring.challenge.loan.domain;

import java.math.BigDecimal;

public class Customer {
    private Integer age;
    private String cpf;
    private String name;
    private BigDecimal income;
    private Location location;

    public Customer(Integer age, String cpf, String name, BigDecimal income, Location location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public Location getLocation() {
        return location;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
