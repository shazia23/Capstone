@JenkinsTriggerTest
Feature: This feature is use for testing UI of Order page
 
 Background:
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'capstonetest@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    
  @cancelOrder
  Scenario: Verify user can cancel an order
    Given User clicks on orders section
    And User clicks on Cancel The Order button
    And User selects the cancellation reason 'Bought wrong item'
    And User clicks on Cancel Order button
    Then A cancellation message should be displayed
    
    @returnOrder
  Scenario: Verify user can retun an order
    Given User clicks on orders section
    And User clicks on Return Irem button
    And User selects the return reason 'Item damaged'
    And User selects the dropoff service 'FedEx'
    And User clicks on Return Order button
    Then A return message should be displayed
    
    @addReview
    Scenario: Verify user can write a review on order placed
    Given User clicks on orders section
    And User clicks on review button
    And User writes review headline 'headline value' and 'review text'
    And User clicks Add your Review button
    Then Review message should be displayed 'Your review was added successfully'
         