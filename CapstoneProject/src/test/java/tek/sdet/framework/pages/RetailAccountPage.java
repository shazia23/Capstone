package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;

	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement profileUpdateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;

	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;

	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;

	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;

	@FindBy(id = "streetInput")
	public WebElement streetAddressField;

	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;

	@FindBy(id = "cityInput")
	public WebElement cityField;

	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;

	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;

	// the following is for updating password
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
	@FindBy(id = "newPasswordInput")
	public WebElement newPassword;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassword;
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordButton;
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyMessage;

	// the following is for Adding a payment method
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement addPaymentButton;
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberField;
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardField;
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeField;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardButton;
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSuccessfullyMessage;

	// The following is for editing debit/credit card
	@FindBy(xpath = "(//p[@class=\"account__payment-sub-title\"][1])")
	public WebElement clickOnTheCard;
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement clickEditButton;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement clickUpdateButton;
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement cardEditedSuccessfullyMessage;

	// The following is for removing debit/credit card
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement clickRemoveButton;

	// The following is for editing an address
	@FindBy(xpath = "(//button[@class='account__address-btn'][normalize-space()='Edit'])[1]")
	public WebElement clickEditAddressButton;
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressEditedSuccessfullyMessage;
	@FindBy(id = "addressBtn")
	public WebElement editYourAddressButton;

	// The following is for removing an address
	@FindBy(xpath = "(//button[@class='account__address-btn'][normalize-space()='Remove'])[1]")
	public WebElement removeAddressButton;
}
