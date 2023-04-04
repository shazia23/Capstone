package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class OrderSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

	}

	@When("User clicks on orders section")
	public void clickOrderSection() {
		click(factory.orderPage().orderLink);
	}

	@When("User clicks on Cancel The Order button")
	public void clickOnCancelOrder() {
		click(factory.orderPage().cancelButton);

	}

	@When("User selects the cancellation reason {string}")
	public void userSelectsReason(String reason) {
		selectByVisibleText(factory.orderPage().reasonDropdwon,reason);


	}
	@When("User clicks on Cancel Order button")
	public void clickOnCancelButtonr() {
		click(factory.orderPage().cancelOrderButton);

	}
			@Then("A cancellation message should be displayed")
	public void aMessageShouldBeDisplayed() {
		isElementDisplayed(factory.orderPage().orderCancellationSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().orderCancellationSuccessfullyMessage));
}
			//The following is for returning items test
			@When("User clicks on Return Irem button")
			public void clickOnReturnItemButton() {
				click(factory.orderPage().returnItemButton);	
			}
				@When("User selects the return reason {string}")
				public void userSelectsReturnReason(String service) {
					selectByVisibleText(factory.orderPage().reasonDropdwon,service);	
}
			@When("User selects the dropoff service {string}")
			public void userSelectsDropOffService(String service) {
				selectByVisibleText(factory.orderPage().dropOffService,service);	
			}	
				@When("User clicks on Return Order button")
				public void userClicksOnReturnOrderButton() {
					click(factory.orderPage().cancelOrderButton);		
}
				@Then("A return message should be displayed")
				public void returnSuccessMessageShouldBeDisplayed() {
					isElementDisplayed(factory.orderPage().orderReturnSuccessfullyMessage);
					Assert.assertTrue(isElementDisplayed(factory.orderPage().orderReturnSuccessfullyMessage));
}
				//The following is for reviewing an item test
				@When("User clicks on review button")
				public void clickOnReviewButton() {
					click(factory.orderPage().reviewButton);
}
				@And("User writes review headline {string} and {string}")
				public void userEntersHeadlineText(String headline, String review) {
					sendText(factory.orderPage().headlineField,headline);
					sendText(factory.orderPage().reviewField,review);

}
				@When("User clicks Add your Review button")
				public void ClickOnSubmitReviewButton() {
					click(factory.orderPage().reviewSubmitButton);
				}
				@Then("Review message should be displayed {string}")
				public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String expectedMessage) {
					waitTillPresence(factory.orderPage().reviewSuccessfullyMessage);
					Assert.assertEquals(expectedMessage, factory.orderPage().reviewSuccessfullyMessage.getText());
}
}
				
