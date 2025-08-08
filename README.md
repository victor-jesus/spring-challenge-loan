# Backend Challenge - Loan Eligibility API

Este projeto é uma API REST desenvolvida com **Spring Boot** que determina quais modalidades de empréstimo uma pessoa tem acesso, com base em regras de negócio específicas relacionadas a **salário, idade e localização**. 
Todo o desafio foi feito de acordo com [repositório do Backend Brasil](https://github.com/backend-br/desafios/tree/master)

---

## 📌 Funcionalidades

- Recebe os dados de um cliente (nome, CPF, idade, renda e localização)
- Retorna uma lista de empréstimos elegíveis, com tipo e taxa de juros
- Regras de elegibilidade bem definidas por tipo de empréstimo

---

## 🚀 Tecnologias e ferramentas

- Java 17
- Spring Boot
- Spring Docs
- JUnit 5 (testes unitários)
- Postman
- Maven
- Git

---

## 🔍 Regras de Negócio

### Modalidades de Empréstimo:

| Tipo         | Juros |
|--------------|-------|
| Pessoal      | 4%    |
| Consignado   | 2%    |
| Com Garantia | 3%    |

### Critérios de concessão:

- **Pessoal**
  - Renda ≤ R$ 3000
  - Renda entre R$ 3000 e R$ 5000, idade < 30 e localização em **SP**
- **Consignado**
  - Renda ≥ R$ 5000
- **Com Garantia**
  - Renda ≤ R$ 3000
  - Renda entre R$ 3000 e R$ 5000, idade < 30 e localização em **SP**

---

## ✅ Requisição/Endpoints

🔸 [POST] /customer-loans

- Request Body

```json
{
  "name": "Vuxaywua Zukiagou",
  "cpf": "275.484.389-23",
  "age": 26,
  "income": 7000.00,
  "location": "SP"
}
```

### 🔁 Response

- Response Body
  
```json
{
  "customer": "Vuxaywua Zukiagou",
  "loans": [
    {
      "type": "PERSONAL",
      "interest_rate": 4
    },
    {
      "type": "GUARANTEED",
      "interest_rate": 3
    },
    {
      "type": "CONSIGNMENT",
      "interest_rate": 2
    }
  ]
}
```

---

## 🧪 Testes

Os testes foram implementados com **JUnit 5**, cobrindo:

* Regras para concessão de empréstimos.

---

## 🛠️ Como rodar localmente

Com Java 17 na sua máquina:

```bash
git clone https://github.com/victor-jesus/backend-challenge-loans.git
cd backend-challenge-loans

## Rodar a aplicação
./mvnw spring-boot:run

## Rodar os testes automatizados
./mvnw test

## Gerar o pacote (build)
./mvnw clean package

## Após isso, o .jar estará disponível na pasta target/, podendo ser executado com:
java -jar target/loan-0.0.1-SNAPSHOT.jar
```

A API está localizada na porta 8080
- Acesse: [http://localhost:8080](http://localhost:8080)

Documentação da API:
- Acesse: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## 📂 Organização do projeto

* `controller/` – Camada de entrada da API
* `service/` – Lógica de negócio
* `domain/` – Modelos e enums
* `dto/` – Transferência de dados (request/response)
* `util/` – Regras utilitárias 

---

## ✍️ Autor

Victor Gustavo
[GitHub: @victor-jesus](https://github.com/victor-jesus)
