# Desafio Modulo 1 - DevSuperior Spring Boot ⚡

---
### **Tecnologias Utilizadas** 💻

- Java 11
- Spring Web
- Spring Data JPA
- Banco H2

---

###  **Desafio:** 🏋️‍♂️

#### CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso
- Carga base de dados inicial

#### **Testes com Postman:**

###### Busca paginada de clientes:

``curl --location --request GET 'http://localhost:8080/clients?page=1&linesPerPage=5&direction=ASC&orderBy=name'``

###### Busca de recurso por id:

``curl --location --request GET 'http://localhost:8080/clients/11'``

###### Inserir novo recurso:
``curl --location --request POST 'http://localhost:8080/clients' \
--header 'Content-Type: application/json' \
--data-raw '{
"name": "Maria Silva",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20T10:30:00Z",
"children": 2
}
'``

###### Atualizar recurso:

``curl --location --request PUT 'http://localhost:8080/clients/10' \
--header 'Content-Type: application/json' \
--data-raw '{
"name": "Maria Silvaaa",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20T10:30:00Z",
"children": 2
}
'``

###### Deletar recurso:

``curl --location --request DELETE 'http://localhost:8080/clients/9' \
--data-raw '``

