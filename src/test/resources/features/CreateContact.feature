#Feature: Free CRM Contact Creation
#
#
#Scenario Outline: New Contact Creation
#
#
#Given User is on CRMHomePage
#When User Navigates to New Contacts Page
#
#Given User is on Login Page
#When Title of the page is freeCRM
#Then User enter "<username>" and "<password>"
#Then User clicks on Login button
#Then User is on Home page
#Then User move to New Contact Page
#
#Then User enters "<FirstName>" and "<LastName>" and "<Position>"
#Then Close the browser
#
#Examples:
#
#
#| FirstName | LastName | Position |
#| Test123   | Test456  | Manager  |
#| David     |  John    | Director |
#
#
