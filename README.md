# 🧪 Saucedemo UI Automation

```
UI test automation project built using Java, Selenium WebDriver, Cucumber, and JUnit. 
It is configured as a Maven project and uses **WebDriverManager** to manage browser drivers automatically.
```

---

## 🛠 Tech Stack

```
Java 17 – Programming language
Maven – Dependency management and build tool
Selenium WebDriver – Browser automation
JUnit – Test execution framework
Cucumber – BDD (Behavior Driven Development) tool
WebDriverManager – Automatically manages browser drivers
```

---

## 📁 Project Structure

```
saucedemo-ui-automation/
├── pom.xml                     # Maven configuration file
├── README.md                   # Project documentation

└── src
    ├── main
    │   ├── java
    │   │   ├── config/         # ConfigReader class to read config.properties
    │   │   ├── pages/          # Page Object Model (POM) classes
    │   │   └── utils/          # Driver management and ScenarioContext classes
    │   └── resources
    │       └── config.properties  # Configuration file with environment settings
    │
    └── test
        ├── java
        │   ├── stepDefs/       # Step definition classes for Cucumber scenarios
        │   └── runners/        # Cucumber test runner classes (e.g., RunCucumberTest.java)
        └── resources
            └── features/       # Gherkin feature files describing test scenarios
```

To run tests:

Use IntelliJ: Right-click on RunCucumberTest.java → Run
Or use Maven CLI: mvn clean test -Dcucumber.filter.tags="@test"

