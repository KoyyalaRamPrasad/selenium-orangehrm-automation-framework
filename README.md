# Selenium OrangeHRM Automation Framework

## Project Description
This project is a Selenium Automation Framework built using **Java, Selenium WebDriver, TestNG, and Maven**.  
The framework follows the **Page Object Model (POM)** design pattern to maintain reusable and maintainable test code.

Automation is performed on the **OrangeHRM Demo Application**.

---

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Git & GitHub

---
## Framework Features
- Page Object Model (POM) design pattern
- TestNG test execution
- Screenshot capture on test failure using TestNG Listeners
- Configurable environment using `config.properties`
- Reusable utility classes for waits and configuration
- Organized project structure for scalability

---

## Project Structure

```
qa-automation-framework
│
├── src
│   ├── main/java/com/ram
│   │   ├── base
│   │   │   └── BaseTest.java
│   │   ├── pages
│   │   │   ├── LoginPage.java
│   │   │   └── DashboardPage.java
│   │   └── utils
│   │       ├── ConfigReader.java
│   │       ├── ScreenshotUtils.java
│   │       └── WaitUtils.java
│
├── src/test/java/com/ram
│   ├── listeners
│   │   └── TestListener.java
│   │
│   └── tests
│       ├── LoginTest.java
│       └── LogoutTest.java
│
├── src/test/resources
│   └── config.properties
│
└── testng.xml
```
---
## Test Scenarios Covered

- Valid Login Test
- Invalid Login Test
- Logout Test

---

## How to Run the Tests

1. Clone the repository


git clone https://github.com/KoyyalaRamPrasad/selenium-orangehrm-automation-framework.git


2. Import the project into **Eclipse**

3. Run the TestNG suite


Right Click → testng.xml → Run As → TestNG Suite


---

## Author

Ramprasad Koyyala



