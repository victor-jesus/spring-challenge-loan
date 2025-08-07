package spring.challenge.loan.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import spring.challenge.loan.domain.Location;

import java.math.BigDecimal;

public record CustomerLoanRequest(
        @NotNull
        Integer age,
        @CPF
        @NotBlank
        String cpf,
        @NotBlank
        String name,
        @NotNull
        BigDecimal income,
        @NotNull
        Location location
) {

}
