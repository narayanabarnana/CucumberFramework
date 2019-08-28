#Feature: This feature file contains scenarios for Contact creation and Deals creation
#
#Scenario: This scenario is to create Contact in CRM Application
#
#Given User is on CRMHomePage
#When User Navigates to New Contacts Page
#Then User enters FirstName and LastName and Position details
#
#| FirstName | LastName | Position |
#| Test123   | Test456  | Manager  |
#
#Then Contact Created
#
#Scenario: This scenario is to create Deal in CRM Application
#
#Given User is on CRMHomePage
#Then User move to New Deal Page
#Then User enters deals details
#
#| title     | Amount | Probability | Commission |
#| test deal | 1000   | 50          | 10         |
#
#Then Deal Created Succesfully
#
#Scenario: This scenario is to create Case in CRM Application
#
#Given User is on CRMHomePage
#Then User Navigate to New CaseCreation Page
#And User enters Case creation details
#
#| title              | description        | version | 
#| test case creation | case description   | 01      |