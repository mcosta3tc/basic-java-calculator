# Basic Calculator in Java

This project implements a basic calculator in Java capable of performing simple arithmetic operations: addition, subtraction, multiplication, and division. The project also includes unit tests to verify the functionality of each operation.

## Features

- Addition
- Subtraction
- Multiplication
- Division (with error handling for division by zero)

## Technologies Used

- Java 22
- Maven
- JUnit 5

## Prerequisites

- JDK 22
- Maven

## Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/mcosta3tc/basic-java-calculator.git
   
2. Navigate to the project directory:

   ```sh
    cd your-repo

3. Build the project with Maven:

   ```sh
   mvn clean install
   
## Usage
  
1. Run the application:

        mvn exec:java -Dexec.mainClass="com.example.calculator.Calculator"

    Follow the console instructions to perform arithmetic operations.

## Unit Tests

To run the unit tests, use the following command:

    mvn test

## Project Structure

    src/main/java/com/example/calculator/Calculator.java : Main class implementing arithmetic operations.
    src/test/java/com/example/calculator/CalculatorTest.java : Unit test class to verify each operation.

Contribution

Contributions are welcome. Please submit a pull request for any improvements or corrections.
License

This project is licensed under the MIT License. See the LICENSE file for details.
