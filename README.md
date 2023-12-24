# Mitigram Assignment for QA Automation Engineer

## How to Run the Tests

There are three packages in the test.java.com.mitigram package

### 1. Pages
   - BasePage ==> to initialize the WebDriver to all project. It also contains all WebElements related to Home Page in the UI
   - CareersPage ==> contains all WebElements related to Careers Page in the UI
   - LoginPage ==> contains all WebElements related to Login Page in the UI

### 2. Runners
   - CukesRunner.java ==> CukesRunner is to run specified testCases with the requested tags. 
  ![image](https://github.com/icuvoglu/mitigram/assets/93586200/d6458152-8869-44f7-8700-a3e8c15290dc)
If you want to run all the TC's in login.feature file; you need to write "@login" for tags in Runner class.
But if you want to run specific TC's such as "Login with valid credentials, Login with invalid credentials etc."; then you need to write the tagName for the TC's that you want to run.

   - FailedRunner.java
  ![image](https://github.com/icuvoglu/mitigram/assets/93586200/d5b5912c-da79-4edf-8ceb-a4be61ba8bed)
If there is/are any TC/s failed, the TC's wil be marked in the "rerun.txt" file at target folder. 
![image](https://github.com/icuvoglu/mitigram/assets/93586200/2fb2367e-1eb3-4595-9e3d-bb8085744b86)
To re-run the failed tests, you need to run FailedRunner class.

### stepdefinitions
This package is to implement your code for running the TC's. Runner classes will read the code from this package and run the execution.

## Utilities
There is three utilities classes in test.java.com package.utilities
- BrowserUtils  ==> contains usefull methods such as takeScreenShot, ExplicitWaits, ExecuteJSCommand, some actions like doubleClick, etc.
- ConfigurationReader  ==> this class is to read testData from configurations.properties file.
- Driver  ==> We aimed to use single driver during the execution. Therefore we use "singleton driver" in the project. It means if there is no driver during the execution, Driver class will create a WebDriver and return. If there is a driver during the execution, Driver class will return the existing WebDriver. There is also driver installation for different types of browsers in this class.

## Resources
There is a features package in java.resources package. Features package contains our TestCases. We write our TC's in Gherkin language.

## configurations.properties
This file is to store our testData for the project such as URL, username, password, etc. 

## pom.xml
This file contains our dependencies for testing tools and plugins for the project. 




