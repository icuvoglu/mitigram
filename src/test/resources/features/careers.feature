@careers
Feature: Careers Page Regression TestCases


  Scenario: Apply for a position

    Given user clicks "Careers" button
    And user clicks "Open positions" button
    And user clicks "QA Automation Engineer" button
    And user clicks "Apply for this position" button for selected position
    When user fills the application form
    And User click Contact Us button
    Then verify success message is displayed
