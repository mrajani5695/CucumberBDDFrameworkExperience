Feature: Place an Order

Scenario: using default payment option
Given I am a Guest Customer
And my billing details are
| firstname | lastname | country             | address_line1 | City      | state   | zip    | email                 |
| Miten			| Rajani	 | United States (US)	 | palm greens	 | Plano     | Texas 	 | 75024 		| mrajani5695@gmail.com |
And I have a product in the cart
And I am on the Checkout Page
When I provide billing details
And I place an order
Then the order should be placed successfully

