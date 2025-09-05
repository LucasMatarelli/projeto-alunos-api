# API de Gerenciamento de Alunos

## 🎯 Objetivo do Projeto

Meu nome é **Lucas Matarelli**, sou aluno do curso de Análise e Desenvolvimento de Sistemas (ADS). Desenvolvi esta API RESTful simples com **Spring Boot** para demonstrar, na prática, as operações de **CRUD** (Criar, Ler, Atualizar, Deletar) em uma lista de alunos. O projeto foi feito para cumprir os requisitos da disciplina e mostrar minha compreensão da arquitetura MVC.

## 🚀 Como Rodar a Aplicação

Para executar o projeto, siga os passos abaixo:

1.  **Pré-requisitos:** Certifique-se de ter o **Java Development Kit (JDK) 17 ou superior** e o **Apache Maven** instalados.
2.  **Navegue até a pasta do projeto:**
    ```bash
    cd /caminho/do/seu/projeto/alunos
    ```
3.  **Execute a aplicação:**
    Eu usei o Maven Wrapper para rodar o projeto. Você pode executar o seguinte comando no terminal:
    ```bash
    ./mvnw spring-boot:run
    ```
    Alternativamente, você pode usar o VS Code com a extensão "Spring Boot Tools" e clicar no botão "Run" na classe `AlunosApplication.java`.

## 🧪 Endpoints da API

A API ficará disponível em `http://localhost:8080/alunos` e suporta as seguintes requisições:

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/alunos` | Lista todos os alunos. |
| `GET` | `/alunos/{id}` | Busca um aluno por ID. |
| `POST` | `/alunos` | Cria um novo aluno. |
| `PUT` | `/alunos/{id}` | Atualiza um aluno existente. |
| `DELETE` | `/alunos/{id}` | Remove um aluno por ID. |

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3.5.5**
* **Apache Maven**
* **VS Code**
