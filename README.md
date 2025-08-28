# Restful-Booker API Test Automation Framework

A BDD test automation framework for the `restful-booker` API using Java, RestAssured, and Cucumber.

## 📜 About The Project

This project is a test automation framework designed to verify the core functionalities of the [restful-booker](https://restful-booker.herokuapp.com/) API. It follows the BDD (Behavior-Driven Development) approach with Cucumber to create readable and maintainable test scenarios that mimic real user interactions.

The primary goal is to demonstrate a clean and scalable architecture for API testing, covering authentication, payload creation, request execution, and response validation.

## 🛠️ Tech Stack

* **Java 21**: Core programming language.
* **Maven**: Dependency management and build tool.
* **RestAssured**: Library for testing and validating REST APIs.
* **Cucumber**: BDD framework for writing tests in Gherkin syntax.
* **JUnit 5**: Test execution engine.
* **Jackson**: For JSON serialization and deserialization (POJOs).
* **Java Faker**: For generating realistic test data.

## 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

Make sure you have the following installed on your machine:
* Java JDK 21 or higher
* Apache Maven
* Git

### Installation

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/your-username/RestFullBookingProjectAutomation.git](https://github.com/your-username/RestFullBookingProjectAutomation.git)
    ```
2.  **Navigate to the project directory:**
    ```sh
    cd RestFullBookingProjectAutomation
    ```
3.  **Install dependencies:**
    Maven will automatically download all the necessary libraries defined in the `pom.xml` file.
    ```sh
    mvn clean install
    ```

## ✅ Running the Tests

You can run the automated tests in two ways:

### 1. Using an IDE

The simplest way is to run the tests directly from your IDE (e.g., IntelliJ IDEA, Eclipse).
* Navigate to the Test Runner class located at `src/test/java/com/hotelreservations/RunCucumberTest.java`.
* Right-click on the file and select `Run`.

### 2. Using the Command Line

You can also execute all tests from the project's root directory using the following Maven command:
```sh
mvn test