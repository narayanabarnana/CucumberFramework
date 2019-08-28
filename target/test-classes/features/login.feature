#Feature: Free CRM Login
#
##Scenario: Free login test scenario
#
##Given User is on Login Page
##When Title of the page is freeCRM
##Then User enter "naveenk" and "test@123"
##Then User clicks on Login button
##Then User is on Home page
#
#Scenario: User is able to create a new contact
#
#Given User is on HomePage
#When User MouseHover on Contacts link
#Then User Click on New Contact from the dropdown
#Then User enters Firstname and lastname
#Then User clicks on Save button
#Then Verify New Contact created
#
#Scenario Outline: Free login test scenario
#
#Given User is on Login Page
#When Title of the page is freeCRM
#Then User enter "<username>" and "<password>"
#Then User clicks on Login button
#Then User is on Home page
#Then Close the browser
#
#Examples:
#
#| username | password |
#| naveenk  | test@123 |
#| tom      | test456  |
#
#
#
