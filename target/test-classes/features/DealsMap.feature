Feature: Deals Data creation 

@RegressionTest
Scenario: Create a new deal data creation 

	Given User is on CRMHomePage 
	Then User move to New Deal Page 
	Then User enters deals details 
	
		| title      | Amount | Probability | Commission |
		| test deal1 | 1000   | 50          | 10         |
		| test deal2 | 2000   | 40          | 20         |
		| test deal3 | 3000   | 30          | 30         |
@SmokeTest
Scenario: Creating a New Product using Deals
	
	Given User is on CRMHomePage
	When User moves to New Product Page
	And User enters Product details
	| ProductName      | Cost | RetailValue | WholeSalePrice | SKU      | InventoryAmount | ProductDescription |
	| test product1    | 1000 | 5000        | 1500           | TestSKU  | 1000            | TestProductDesc    |
	Then Clicked on Save button
	Then Product created Succesfully
