//package tek.sdet.framework.steps;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebElement;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import tek.sdet.framework.pages.POMFactory;
//import tek.sdet.framework.utilities.CommonUtility;
//import tek.sdet.framework.utilities.DataGeneratorUtility;
//
//public class RetailSteps extends CommonUtility {
//
//	private POMFactory factory = new POMFactory();
//	// create object Retailapage
//	// creat
//
//	@Given("User is on retail website")
//	public void userIsOnRetailWebsite() {
//		String actualTitle = getTitle();
//		String expectedTitle = "React App";
//		Assert.assertEquals(actualTitle, expectedTitle);
//		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
//		logger.info("user is on retail website");
//		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
//
//	}
//
//	@When("User search for {string} product")
//	public void userSearchForProduct(String productValue) {
//		sendText(factory.homePage().searchBar, productValue);
//		click(factory.homePage().searchButton);
//		logger.info("user searched for product " + productValue);
//	}
//
//	@Then("The product should be displayed")
//	public void theProductShouldBeDisplayed() {
//		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
//		logger.info("the Product is displayed on home page");
//
//	}
//
//	@When("User click on All section")
//	public void userClickOnAllSection() {
//		click(factory.homePage().allIcon);
//		logger.info("user clicked on All section");
//
//	}
//
//	@Then("below options are present in shop by department sidebar")
//	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
//		List<List<String>> expectedSideBar = dataTable.asLists(String.class);
//
//		List<WebElement> actualSideBar = factory.homePage().sideBarElements;
//
//		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
//			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
//			logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
//		}
////		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
////		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
////		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
////		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
////		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
////		logger.info("actual is equal to expected");
//
//	}
//
//	@When("User on {string}")
//	public void userOnElectronics(String department) {
//		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
//		for (WebElement option : sideBarOptions) {
//			if (option.getText().equals(department)) {
//				click(option);
//				try {
//					logger.info(option.getText() + " is present ");
//				} catch (StaleElementReferenceException e) {
//
//				}
//				break;
//			}
//		}
//
//	}
//
//	@Then("below options are present in department")
//	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
//
//		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
//		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;
//
//		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
//			for (WebElement dept : actualDepartmentOptions) {
//				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
//					Assert.assertTrue(isElementDisplayed(dept));
//					logger.info(dept.getText() + " is present ");
//				}
//			}
//		}
//			}
//		
//			@When("User change the category to {string}")
//			public void userChangeTheCategoryTo(String category) {
//				selectByVisibleText(factory.homePage().searchMenu,category);
//			}
//
//			@When("User search for an item {string}")
//			public void userSearchForAnItem(String item) {
//				sendText(factory.homePage().searchBar, item);
//			}
//			@When("User click on search icon")
//			public void userClickOnSearchIcon() {
//			click(factory.homePage().searchButton);
//
//			}
//			@When("User click on item")
//			public void userClickOnItem() {
//				click(factory.homePage().itemSearch);
//
//			}
//			@When("User select quanity {string}")
//			public void userSelectQuanity(String quantity) {
//				selectByVisibleText(factory.homePage().productQuantity,quantity);
//
//			}
//			@When("User click add to cart button")
//			public void userClickAddToCartButton() {
//				click(factory.homePage().addToCartButton);
//
//			}
//			@Then("The cart icon quantity should change to {string}")
//			public void theCartIconQuantityShouldChangeTo(String quantity) {
//				Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
//
//			}
//			// The following is for placeOrder test
//			@When("User click on Cart option")
//			public void userClickOnCartOption() {
//				click(factory.homePage().cartQuantity);
//			
//			}
//			@When("User click on proceed to checkout button")
//			public void userClickOnProceedToCheckout() {
//				click(factory.homePage().proceedButton);
//			
//}
//			@When("User click add a new address new link for shipping address")
//			public void userClickOnAddNewAddressButton() {
//				click(factory.homePage().addNewAddressButton);
//}
//		
//			
//			@When("User clicks add a new address new link for shipping address")
//			public void userClickOnNewAddressButton() {
//				click(factory.homePage().addNewAddressButton);
//}
//			@When("User fill new address form with below information")
//			public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
//				List<List<String>> addressInfo = dataTable.asLists(String.class);
//				selectByVisibleText(factory.homePage().country, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
//				sendText(factory.homePage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
//				sendText(factory.homePage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
//				sendText(factory.homePage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
//				sendText(factory.homePage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
//				sendText(factory.homePage().cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
//				selectByVisibleText(factory.homePage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
//				sendText(factory.homePage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
//}
//			@When("User click Add Your Address button")
//			public void userClickAddYourAddressButton() {
//				click(factory.homePage().addYourAddressButton);
//}
//			@When("User click add a credit card or debit card for payment method")
//			public void userClicksOnAddPaymentMethod() {
//				click(factory.homePage().addPaymentButton);
//}
//			@And("User fills debit or credit card information")
//			public void userClicksOnAddPaymentLink(DataTable dataTable) {
//				List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
//				sendText(factory.homePage().cardNumberField, cardInfo.get(0).get("cardNumber"));
//				sendText(factory.homePage().nameOnCardField, cardInfo.get(0).get("nameOnCard"));
//				sendText(factory.homePage().securityCodeField, cardInfo.get(0).get("securityCode"));
//}
//			@When("User clicks on add your card button")
//			public void userClicksOnAddYourCardButton() {
//				click(factory.homePage().addYourCardButton);
//}
//			@When("User click on place your order")
//			public void userClicksOnPlaceYourOrder() {
//				click(factory.homePage().placeOrderButton);
//}
//			@Then("a message should be displayed {string}")
//	public void aMessageShouldBeDisplayed(String expectedMessage) {
//		waitTillPresence(factory.homePage().orderPlacedSuccessfullyMessage);
//		Assert.assertEquals(expectedMessage, factory.homePage().orderPlacedSuccessfullyMessage.getText());
//}
//			@When("User click add item to cart button")
//			public void userClickAddItemToCartButton() {
//				click(factory.homePage().addItemToCartButton);
//}
//}
