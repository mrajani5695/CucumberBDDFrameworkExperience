package awsomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import awsomecucumber.domainobjects.BillingDetails;

public class CheckoutPage extends BasePage {

	@FindBy(id = "billing_first_name")
	private WebElement billingFirstNameFld;
	@FindBy(id = "billing_last_name")
	private WebElement billingLastNameFld;
	@FindBy(id = "billing_address_1")
	private WebElement billingAddressOneFld;
	@FindBy(id = "billing_city")
	private WebElement billingcityFld;
	@FindBy(id = "billing_state")
	private WebElement billingStateFld;
	@FindBy(id = "billing_postcode")
	private WebElement billingpostCodesFld;
	@FindBy(id = "billing_email")
	private WebElement billingEmailFld;
	@FindBy(id = "place_order")
	private WebElement placeOrderBtn;
	@FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']")
	private WebElement noticeTxt;

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	public CheckoutPage enterBillingFirstName(String billingFirstName) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingFirstNameFld));
		e.clear();
		e.sendKeys(billingFirstName);
		return this;
	}
	
	public CheckoutPage enterBillingLastName(String billingLastName) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingLastNameFld));
		e.clear();
		e.sendKeys(billingLastName);
		return this;
	}
	
	public CheckoutPage enterBillingAddressLineOne(String billingAddressLineOne) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingAddressOneFld));
		e.clear();
		e.sendKeys(billingAddressLineOne);
		return this;
	}
	
	public CheckoutPage enterBillingCity(String billingCity) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingcityFld));
		e.clear();
		e.sendKeys(billingCity);
		return this;
	}
	
	public CheckoutPage enterBillingState(String billingStateName) {
		Select select = new Select(wait.until(ExpectedConditions.visibilityOf(billingStateFld)));
		select.selectByVisibleText(billingStateName);
		return this;
	}
	
	public CheckoutPage enterBillingZip(String billingZip) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingpostCodesFld));
		e.clear();
		e.sendKeys(billingZip);
		return this;
	}
	
	public CheckoutPage enterBillingEmail(String billingEmail) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingEmailFld));
		e.clear();
		e.sendKeys(billingEmail);
		return this;
	}
	
	public CheckoutPage 
	setBillingDetails(BillingDetails billingdetails) {
		
		return enterBillingFirstName(billingdetails.getBillingFirstName())
				.enterBillingLastName(billingdetails.getBillingLastName())
				.enterBillingAddressLineOne(billingdetails.getBillingAddressOne())
				.enterBillingCity(billingdetails.getBillingCity())
				.enterBillingState(billingdetails.getBillingStateName())
				.enterBillingZip(billingdetails.getBillingZip())
				.enterBillingEmail(billingdetails.getBillingEmail());
		
	}
	
	public CheckoutPage placeOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
		return this;
	}
	
	public String getNotice() {
		return wait.until(ExpectedConditions.visibilityOf(noticeTxt)).getText();
	}
	
	
	
	
}
