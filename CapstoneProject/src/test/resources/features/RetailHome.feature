@JenkinsTriggerTest
Feature: This feature is use for testing UI of Retail page
 
 Background:
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'capstonetest@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    
  @searchProduct
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed
  
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |
		
  Scenario Outline: Verify Department sidebar options
    Given User is on retail website
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

    @addItemToCart
     Scenario: Verify user can add an item to cart
    When User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on search icon
    And User click on item
    And User select quanity '2'
    And User click add to cart button
    Then The cart icon quantity should change to '2'
    
    @placeOrder
    Scenario: verify user can place an order without shipping address and payment method on file
       When User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on search icon
    And User click on item
    And User select quanity '2'
    And User click add to cart button
    And User click on Cart option
    
    And User click on proceed to checkout button
    And User clicks add a new address new link for shipping address
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    And User click add a credit card or debit card for payment method
      And User fills debit or credit card information
      | cardNumber       | nameOnCard   | securityCode |
      | 4916561869908727 | CucumberTest |          456 |
    And User clicks on add your card button
    And User click on place your order
    Then a message should be displayed 'Order Placed Successfully'
    
    @placeOrderWithAddressOnFile
    Scenario: verify user can place an order without shipping address and payment method on file
       When User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on search icon
    And User click add item to cart button
    And User select quanity '5'
    And User click add to cart button
    And User click on Cart option
    And User click on proceed to checkout button  
    And User click on place your order
    Then a message should be displayed 'Order Placed Successfully'
    
    
        