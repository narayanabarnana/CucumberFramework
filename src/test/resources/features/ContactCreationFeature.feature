Feature: Contact Creation in FreeCRM

@FunctionalTests
Scenario: This scenario is to create a contact in FreeCRM Application

Given User is on CRMHomePage
When User Navigates to New Contacts Page
Then User enters FirstName and LastName and Position details

| FirstName | LastName | Position |
| Test123   | Test456  | Manager  |

Then User clicks on Save button
Then Contact Created


