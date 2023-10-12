# Desafio Spring Api Dio
Desafio de projeto do curso Fullstack(Angular + Java) da Dio. O Objetivo do projeto é criar e fazer o deploy de uma API utilizando Spring Boot, Java e Railway.

## Diagrama de Classes

![image](https://github.com/kemps-medeiros/desafio-spring-api-dio/assets/75223837/e62ca171-b135-4ef6-8f0b-12ba938f993d)

## Como Inicializar a Aplicação

### Pré-requisitos:

- Certifique-se de ter o Java 17 instalado na sua máquina.
- Clone este repositório para o seu ambiente local.

### Configuração do Banco de Dados H2:

- A aplicação utiliza o H2 Database. A configuração padrão já está incluída no arquivo `application.properties`.

### Execução da Aplicação:

- Abra o projeto na sua IDE favorita.
- Execute a classe principal `DesafioSpringApiDioApplication` 

### Verificação:

- A aplicação estará disponível em `http://localhost:8080`.
- Você pode acessar o console do H2 Database em `http://localhost:8080/h2-console` (verifique as configurações no arquivo `application.properties`).

## Rotas da API

| Método | Rota                     | Descrição                               |
|--------|--------------------------|-----------------------------------------|
| GET    | `/api/players`           | Retorna todos os jogadores.              |
| GET    | `/api/players/{id}`      | Retorna um jogador pelo ID.              |
| POST   | `/api/players`           | Cria um novo jogador.                    |
| DELETE | `/api/players/{id}`      | Deleta um jogador pelo ID.               |
| PUT    | `/api/players/{id}`      | Atualiza as informações de um jogador.  |

## Exemplo de Criação de Jogador (Requisição HTTP POST)

```http
POST http://localhost:8080/api/players

{
  "name": "Neymar",
  "positions": ["atacante", "meia-armador"],
  "rate": 97,
  "team": "PSG"
}
Lembre-se de adaptar as URLs e portas conforme necessário, dependendo das configurações do seu ambiente. Essas são diretrizes básicas para começar a usar a aplicação.





