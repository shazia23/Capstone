//package tek.sdet.framework.steps;
//
//import java.util.List;
//import java.util.Map;
//import org.junit.Assert;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import tek.sdet.framework.pages.POMFactory;
//import tek.sdet.framework.utilities.CommonUtility;
//import tek.sdet.framework.utilities.DataGeneratorUtility;
//
//public class RetailAccountSteps extends CommonUtility {
//
//	POMFactory factory = new POMFactory();
//
//	@When("User click on Account option")
//	public void userClickOnAccountOption() {
//		click(factory.homePage().accountOption);
//		logger.info("user clicked on Account option");
//	}
//
//	@When("User update Name {string} and Phone {string}")
//	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
//		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
//		sendText(factory.accountPage().profileNameInputField, nameValue);
//		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
//		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
//		logger.info("user updated Name and Phone values ");
//	}
//
//	@When("User click on Update button")
//	public void userClickOnUpdateButton() {
//		click(factory.accountPage().profileUpdateButton);
//		logger.info("user clicked on Update button");
//	}
//
//	@Then("User profile information should be updated")
//	public void userProfileInformationShouldBeUpdated() {
//		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
//		logger.info("user profile information updated");
//	}
//
//	@When("User click on  Add address option")
//	public void userClickOnAddAddressOption() {
//		click(factory.accountPage().addAddressOption);
//		logger.info("user clicked on Add address option");
//
//	}
//
//	@When("User fill new address form with below information")
//	public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
//		List<List<String>> addressInfo = dataTable.asLists(String.class);
//		selectByVisibleText(factory.accountPage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
//		sendText(factory.accountPage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
//		sendText(factory.accountPage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
//		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
//		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
//		sendText(factory.accountPage().cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
//		selectByVisibleText(factory.accountPage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
//		sendText(factory.accountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
//		logger.info("user filled the new address form with information provided in data table");
//
//	}
//
//	@When("User click Add Your Address button")
//	public void userClickAddYourAddressButton() {
//		click(factory.accountPage().addYourAddressButton);
//		logger.info("user clicked on Add your Address button");
//	}
//
//	@Then("a message should be displayed {string}")
//	public void aMessageShouldBeDisplayed(String expectedMessage) {
//		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
//		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
//
//	}
//	// the following is for updatePassword test
//
//	@When("User enters previous password {string}")
//	public void userEntersPreviousPassword(String prevPassword) {
//		sendText(factory.accountPage().previousPassword, prevPassword);
//	}
//
//	@When("User enters new password {string}")
//	public void userEntersNewPassword(String newPassword) {
//		sendText(factory.accountPage().newPassword, newPassword);
//	}
//
//	@When("User confirms new password {string}")
//	public void userConfirmsNewPassword(String confirmPassword) {
//		sendText(factory.accountPage().confirmPassword, confirmPassword);
//
//	}
//
//	@When("user clicks change password button")
//	public void userClicksChangePasswordButton() {
//		click(factory.accountPage().changePasswordButton);
//	}
//
//	@Then("a success message should be displayed {string}")
//	public void SuccessMessageShouldBeDisplayed(String expectedMessage) {
//		waitTillPresence(factory.accountPage().passwordUpdatedSuccessfullyMessage);
//		Assert.assertEquals(expectedMessage, factory.accountPage().passwordUpdatedSuccessfullyMessage.getText());
//	}
//
//	// the following is for Adding a payment method
//	@And("User clicks on add a payment link")
//	public void userClicksOnAddPaymentLink() {
//		click(factory.accountPage().addPaymentButton);
//	}
//
//	@And("User fills debit or credit card information")
//	public void userClicksOnAddPaymentLink(DataTable dataTable) {
//		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
//		sendText(factory.accountPage().cardNumberField, cardInfo.get(0).get("cardNumber"));
//		sendText(factory.accountPage().nameOnCardField, cardInfo.get(0).get("nameOnCard"));
//		sendText(factory.accountPage().securityCodeField, cardInfo.get(0).get("securityCode"));
//	}
//
//	@And("User clicks on add your card button")
//	public void userClicksOnAddYourCardButton() {
//		click(factory.accountPage().addYourCardButton);
//	}
//
//	@Then("a successful message should be displayed {string}")
//	public void AddCardSuccessMessageShouldBeDisplayed(String expectedMessage) {
//		waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfullyMessage);
//		Assert.assertEquals(expectedMessage, factory.accountPage().paymentMethodAddedSuccessfullyMessage.getText());
//	}
//
//	// The following is for editing debit/credit card
//	@When("User clicks on the card")
//	public void userClicksOnTheCard() {
//		click(factory.accountPage().clickOnTheCard);
//	}
//
//	@When("User clicks on edit option of card section")
//	public void userClicksOnEditOptionOfCardSection() {
//		click(factory.accountPage().clickEditButton);
//	}
//
//	@When("User edits information with below data")
//	public void userEditsInformationWithBelowData(DataTable dataTable) {
//		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
//		clearTextUsingSendKeys(factory.accountPage().cardNumberField);
//		sendText(factory.accountPage().cardNumberField, cardInfo.get(0).get("cardNumber"));
//		clearTextUsingSendKeys(factory.accountPage().nameOnCardField);
//		sendText(factory.accountPage().nameOnCardField, cardInfo.get(0).get("nameOnCard"));
//		clearTextUsingSendKeys(factory.accountPage().securityCodeField);
//		sendText(factory.accountPage().securityCodeField, cardInfo.get(0).get("securityCode"));
//	}
//
//	@When("User clicks on update your card button")
//	public void userClicksOnUpdateYourCardButton() {
//		click(factory.accountPage().clickUpdateButton);
//	}
//
//	@Then("Edit success message should be displayed {string}")
//	public void editSuccessMessageShouldBeDisplayed(String expectedMessage) {
//		waitTillPresence(factory.accountPage().cardEditedSuccessfullyMessage);
//		Assert.assertEquals(expectedMessage, factory.accountPage().cardEditedSuccessfullyMessage.getText());
//	}
//
//	// The following is for removing debit/credit card
//	@When("User clicks on remove option of card section")
//	public void userClicksOnRemoveOptionTheCard() {
//		click(factory.accountPage().clickRemoveButton);
//	}
//
//	// The following is for editing an address
//	@When("click on edit address option")
//	public void clickOnEditAddressOption() {
//		click(factory.accountPage().clickEditAddressButton);
//	}
//
//	@When("User edit new address form with below information")
//	public void userEditNewAddressFormWithBelowInformation(DataTable dataTable) {
//		List<List<String>> addressInfo = dataTable.asLists(String.class);
//		clearTextUsingSendKeys(factory.accountPage().country);
//		selectByVisibleText(factory.accountPage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
//		clearTextUsingSendKeys(factory.accountPage().fullNameField);
//		sendText(factory.accountPage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
//		clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
//		sendText(factory.accountPage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
//		clearTextUsingSendKeys(factory.accountPage().streetAddressField);
//		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
//		clearTextUsingSendKeys(factory.accountPage().apartmentNumber);
//		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
//		clearTextUsingSendKeys(factory.accountPage().cityField);
//		sendText(factory.accountPage().cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
//		clearTextUsingSendKeys(factory.accountPage().stateDropDown);
//		selectByVisibleText(factory.accountPage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
//		clearTextUsingSendKeys(factory.accountPage().zipCodeField);
//		sendText(factory.accountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
//		logger.info("user filled the new address form with information provided in data table");
//	}
//
//	@Then("Edit address message should be displayed {string}")
//	public void editAddressSuccessMessageShouldBeDisplayed(String expectedMessage) {
//		waitTillPresence(factory.accountPage().addressEditedSuccessfullyMessage);
//		Assert.assertEquals(expectedMessage, factory.accountPage().addressEditedSuccessfullyMessage.getText());
//	}
//
//	@When("User click on update address option")
//	public void clickOnUpdateAddressOption() {
//		click(factory.accountPage().editYourAddressButton);
//	}
//
//	// The following is for removing an address
//	@When("User click on remove button")
//	public void clickOnRemoveOption() {
//		click(factory.accountPage().removeAddressButton);
//	}
//}
