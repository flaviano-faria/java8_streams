# Java 8 Features Demo Project

This project demonstrates various features and concepts introduced in Java 8, with a focus on Streams API, CompletableFuture, and Functional Interfaces. The project is built using Maven and requires Java 21 for compilation.

## Project Structure

```
src/
├── main/java/com/
│   ├── java8/
│   │   ├── completablefuture/    # CompletableFuture examples and implementations
│   │   │   ├── CompletableFutureAsync.java
│   │   │   ├── CompletableFutureSupplyAsync.java
│   │   │   └── CompletableFutureTest.java
│   │   └── functionalinterface/   # Functional Interface demonstrations
│   │       └── service/          # Custom functional interface implementations
│   └── java8streams/
│       ├── service/              # Stream operations implementations
│       │   ├── FilterService.java
│       │   ├── FilterLimitService.java
│       │   ├── FindFirstService.java
│       │   ├── DistinctService.java
│       │   ├── MinMaxService.java
│       │   └── JoinStreamService.java
│       └── app/                  # Application main classes
└── test/                        # Test cases
```

## Features

The project covers the following Java 8 features:

1. **Streams API**
   - Located in the `java8streams.service` package
   - Demonstrates various stream operations:
     - Filtering operations (`FilterService.java`)
     - Filter with limit (`FilterLimitService.java`)
     - Find first element (`FindFirstService.java`)
     - Distinct elements (`DistinctService.java`)
     - Min/Max operations (`MinMaxService.java`)
     - Stream joining (`JoinStreamService.java`)

2. **CompletableFuture**
   - Located in the `java8.completablefuture` package
   - Demonstrates asynchronous programming:
     - Basic async operations (`CompletableFutureAsync.java`)
     - Supply async operations (`CompletableFutureSupplyAsync.java`)
     - Testing async operations (`CompletableFutureTest.java`)

3. **Functional Interfaces**
   - Located in the `java8.functionalinterface.service` package
   - Examples of custom functional interfaces
   - Demonstrates how to create and use custom functional interfaces

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

## Examples

### Stream Operations
The project includes various examples of Stream API operations:
- Filtering collections
- Finding first elements
- Getting distinct elements
- Calculating min/max values
- Joining stream elements

### CompletableFuture
Examples of asynchronous programming:
- Basic async operations
- Supply async operations
- Testing async operations

### Functional Interfaces
Demonstrations of:
- Custom functional interface creation
- Implementation of functional interfaces
- Usage of built-in functional interfaces


