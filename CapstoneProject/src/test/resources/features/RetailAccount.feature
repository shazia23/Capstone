#@CompleteTest
#Feature: Retail Application Account Feature
#
  #Background: 
    #Given User is on retail website
    #When User click on Sign in option
    #And User enter email 'capstonetest@gmail.com' and password 'Tek@12345'
    #And User click on login button
    #And User should be logged in into Account
#
  #Scenario: Verify User can update Profile Information
    #When User click on Account option
    #And User update Name 'transformers' and Phone '1012028855'
    #And User click on Update button
    #Then User profile information should be updated
#
  #@addAddress
  #Scenario: Verify User can add  an Address
    #When User click on Account option
    #And User click on  Add address option
    #And User fill new address form with below information
      #| country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    #And User click Add Your Address button
    #Then a message should be displayed 'Address Added Successfully'
#
  #@updatePassword
  #Scenario: Verify User updatePassword
    #When User click on Account option
    #And User enters previous password 'Tek@123456'
    #And User enters new password 'Tek@12345'
    #And User confirms new password 'Tek@12345'
    #And user clicks change password button
    #Then a success message should be displayed 'Password Updated Successfully'
#
  #@updateProfile
  #Scenario: Verify user can update profile information
    #When User click on Account option
    #And User update Name 'test' and Phone '2042342399'
    #And User click on Update button
    #Then User profile information should be updated
#
  #@addPayment
  #Scenario: Add a payment method
    #When User click on Account option
    #And User clicks on add a payment link
    #And User fills debit or credit card information
      #| cardNumber       | nameOnCard   | securityCode |
      #| 3216567868234867 | CucumberTest |          456 |
    #And User clicks on add your card button
    #Then a successful message should be displayed 'Payment Method added sucessfully'
#
  #@editCards
  #Scenario: Verify user can edit debit or credit card
    #When User click on Account option
    #And User clicks on the card
    #And User clicks on edit option of card section
    #And User edits information with below data
      #| cardNumber       | nameOnCard      | securityCode |
      #| 3216567868234870 | CucumberTestTwo |          436 |
    #And User clicks on update your card button
    #Then Edit success message should be displayed 'Payment Method updated Successfully'
#
  #@removeDebitCard
  #Scenario: Verify user can remove debit or credit card
    #When User click on Account option
    #And User clicks on the card
    #And User clicks on remove option of card section
#
  #@editAddress
  #Scenario: Verify user can edit an address added on account
    #When User click on Account option
    #And click on edit address option
    #And User edit new address form with below information
      #| country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    #And User click on update address option
    #Then Edit address message should be displayed 'Address Updated Successfully'
#
  #@removeAddress
  #Scenario: Verify user can remove address
    #When User click on Account option
    #And User click on remove button
