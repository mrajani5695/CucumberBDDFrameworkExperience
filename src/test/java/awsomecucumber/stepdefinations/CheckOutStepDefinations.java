package awsomecucumber.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import awsomecucumber.constants.EndPoint;
import awsomecucumber.context.TestContext;
import awsomecucumber.domainobjects.BillingDetails;
import awsomecucumber.pages.CartPage;
import awsomecucumber.pages.CheckoutPage;
import awsomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStepDefinations {
	
	private final WebDriver driver;
	private final TestContext context;
	private final CheckoutPage checkoutPage;
	
	
	public CheckOutStepDefinations(TestContext context) {
		this.context=context;
		
		driver=context.driver;
		checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
		
	}
	
	
	

	

	

	@When("I provide billing details")
	public void i_provide_billing_details() {

		
		checkoutPage.setBillingDetails(context.billingdetails);

	}

	@When("I place an order")
	public void i_place_an_order() throws InterruptedException {

		checkoutPage.placeOrder();

	}

	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {

		Assert.assertEquals("Thank you. Your order has been received.", checkoutPage.getNotice());
	}
	
	@Given("I am on the Checkout Page")
	public void i_am_on_the_Checkout_Page() {
		checkoutPage.load(EndPoint.CHECKOUT.url);

	}
	

}
