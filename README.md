🚀 Projeto de Estudos Web Service - Spring Boot

API REST desenvolvida com Java + Spring Boot, com o objetivo de praticar conceitos fundamentais de desenvolvimento backend, como arquitetura em camadas, persistência de dados e construção de endpoints RESTful e subir o nível do meu estudo.

---

📌 Sobre o projeto

Este projeto consiste em um web service REST que permite realizar operações básicas de CRUD (Create, Read, Update, Delete), seguindo boas práticas de organização em camadas:

- Controller (Resource)
- Service
- Repository
- Model (Entidades)

A aplicação utiliza banco de dados e segue o padrão comum de APIs com Spring Boot. Esse tipo de estrutura é usada no mercado para separar responsabilidades e facilitar manutenção .

---

🛠️ Tecnologias utilizadas:

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- Banco de dados (H2)

---

## 📂 Estrutura do projeto

```
src/main/java/com/seuprojeto
│
├── resources      # Controllers (endpoints da API)
├── services       # Regras de negócio
├── repositories   # Acesso ao banco de dados
├── entities       # Modelos/Entidades
├── config         # Configurações
└── Application.java # Classe principal
```
---

⚙️ Funcionalidades

- Cadastro de entidades

- Listagem de dados

- Atualização de registros

- Exclusão de dados

- Tratamento de exceções

---

📖 Conceitos aplicados

- Arquitetura em camadas

- API REST

- ORM com JPA/Hibernate

- Injeção de dependência

- Tratamento de exceções

---

👨‍💻 Autor

Desenvolvido por: Caio Lucas em conjunto ao Curso do Nelio Alves na Udemy
