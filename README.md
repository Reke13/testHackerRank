# Zara Challenge project

This is an application for Zara that searches for product similarities.

## Prerequisites

- Java 8 or higher
- Maven

## Configuration

1. Clone the repository:

> git clone https://github.com/Reke13/testHackerRank.git

2. Change to the project directory:

> cd testHackerRank

The database is of type H2 and is embedded within the project. You can review its structure and data in the data.sql and schema.sql files located in the resources folder.

## Usage

Once the application is up and running, you can access the REST API at http://localhost:8080/api. Here are some examples of available operations:

GET /product/{productId}/similar: Endpoint will return a list of products similar to the ones initially requested.

## Project Structure

The project structure follows the standard convention for a Spring Boot project. Key packages and files include:

- `src/main/java/com/inditex/zarachallenge`: Contains Java classes for the application.
- `src/main/resources`: Contains configuration files and static resources.
- `src/test`: Contains unit tests.

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2
- Lombock
- MapStruct

## Author

- Victor Requena Alfaro (victorrequena92@gmail.com)
