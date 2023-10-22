# Kotlin Spring Boot GraphQL Project

Welcome to the Kotlin Spring Boot GraphQL project! This project is built using Kotlin, Spring Boot, GraphQL, and utilizes a PostgreSQL database. It allows you to perform various GraphQL operations on your data.

## Getting Started

To get this project up and running, follow these simple steps:

### Prerequisites

- Docker Desktop

### Installation

1. Clone the repository:

   ```bash
   git clone git@github.com:adam-ky/kotlin-demo.git
   cd kotlin-demo
   ```

2. Build the Docker image:
   ```bash
   docker build .
   ```
   
3. Start the application:
   ```bash
   docker-compose up
   ```
   
## Usage
After following the installation steps, your Kotlin Spring Boot GraphQL project will be up and running. You can interact with the GraphQL API using GraphiQL:

- Open your web browser and visit: [http://localhost:8080/graphiql?path=/graphql](http://localhost:8080/graphiql?path=/graphql)

From there, you can explore and query your GraphQL API to interact with your data.

## Tech Stack

| Tech        | Description                                                                                          |
|-------------|------------------------------------------------------------------------------------------------------|
| Kotlin      | A modern, statically-typed programming language known for its conciseness and expressiveness.        |
| Spring Boot | An open-source framework for building scalable and secure Java applications with ease.               |
| GraphQL     | A powerful query language for your API, providing a more efficient and flexible alternative to REST. |
| PostgreSQL  | A powerful, open-source relational database system known for its robustness and extensibility.       |
