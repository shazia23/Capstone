package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class OrderPage extends BaseSetup {
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="orderLink")
	public WebElement orderLink;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelButton;

	@FindBy(name = "reason")
	public WebElement reasonDropdwon;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrderButton;
	
	@FindBy(css = "div[class='cancel__confirm-message'] p")
	public WebElement orderCancellationSuccessfullyMessage;
	
	
	//The following is for returning items test
	@FindBy(id = "returnBtn")
	public WebElement returnItemButton;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffService;

	@FindBy(css = "div[class='return__confirm-message'] p")
	public WebElement orderReturnSuccessfullyMessage;
	
	//The following is for reviewing an item test

	
	@FindBy(id = "reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineField;
	
	@FindBy(id = "descriptionInput")
	public WebElement reviewField;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitButton;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewSuccessfullyMessage;
}
