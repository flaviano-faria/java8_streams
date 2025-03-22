# Java 8 Features Demo Project

This project demonstrates various features and concepts introduced in Java 8, with a focus on Streams API, CompletableFuture, and Functional Interfaces. The project is built using Maven and requires Java 21 for compilation.

## Project Structure

```
src/
├── main/java/com/
│   ├── java8/
│   │   ├── completablefuture/    # CompletableFuture examples and implementations
│   │   └── functionalinterface/   # Functional Interface demonstrations
│   └── java8streams/
│       ├── service/              # Service layer implementations
│       └── app/                  # Application main classes
└── test/                        # Test cases
```

## Features

The project covers the following Java 8 features:

1. **Streams API**
   - Located in the `java8streams` package
   - Demonstrates stream operations, filtering, mapping, and reduction
   - Examples of working with collections using streams

2. **CompletableFuture**
   - Located in the `java8.completablefuture` package
   - Asynchronous programming examples
   - Parallel execution and composition of async operations

3. **Functional Interfaces**
   - Located in the `java8.functionalinterface` package
   - Examples of built-in functional interfaces
   - Custom functional interface implementations

## Prerequisites

- Java 21 or higher
- Maven 3.x

## Building the Project

To build the project, run:

```bash
mvn clean install
```

## Running Tests

The project uses JUnit Jupiter (JUnit 5) for testing. To run the tests:

```bash
mvn test
```

## Dependencies

- JUnit Jupiter 5.11.4 (for testing)

## Project Configuration

The project uses Maven for dependency management and build automation. Key configurations:

- Java version: 21
- Source directory: src/main/java
- Test framework: JUnit Jupiter
- Build tool: Maven
