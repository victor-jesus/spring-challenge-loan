package spring.challenge.loan.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import spring.challenge.loan.domain.Location;

import java.math.BigDecimal;

public record CustomerLoanRequest(
        @NotNull(message = "Idade não pode ser nulo")
        Integer age,
        @CPF(message = "CPF precisa ser vlidoi")
        @NotBlank
        String cpf,
        @NotBlank(message = "Nome não pode estar vazio")
        String name,
        @NotNull(message = "Salário não pode estar vazio")
        BigDecimal income,
        @NotNull(message = "Localização não pode estar vazia")
        Location location
) {

}
