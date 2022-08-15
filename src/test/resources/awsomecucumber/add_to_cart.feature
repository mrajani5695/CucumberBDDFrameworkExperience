Feature: Add to Cart

  Scenario Outline: Add one quantity from Store
    Given I am in the Store page
   When I add a "<product_name>" to the Cart
   Then I see 1 "<product_name>" in the cart
   Examples:
   |product_name|
   |Blue Shoes|
 
   