Feature: This feature file contains scenarios for Call in Free CRM

Scenario: This scenario is to create call in CRM Application

Given User is on CRMHomePage
When User Navigates to New Call Page
Then User enters the call details

| CallScript | AssignedTo | SearchContact |
| test       | Narayana B | Narayana      |

And Extract the Task id
And Extract the Case id
And Extract the Deal id
And Click on Submit button