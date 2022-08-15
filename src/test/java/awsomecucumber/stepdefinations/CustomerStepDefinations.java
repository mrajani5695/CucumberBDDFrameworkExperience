package awsomecucumber.stepdefinations;

import org.openqa.selenium.WebDriver;

import awsomecucumber.constants.EndPoint;
import awsomecucumber.context.TestContext;
import awsomecucumber.domainobjects.BillingDetails;
import awsomecucumber.pages.PageFactoryManager;
import awsomecucumber.pages.StorePage;
import io.cucumber.java.en.Given;

public class CustomerStepDefinations {
	
	private final WebDriver driver;
	private final TestContext context;
	private final StorePage storePage;
	
	public CustomerStepDefinations(TestContext context) {
		this.context=context;
		driver=context.driver;
		storePage = PageFactoryManager.getStorePage(context.driver);
	}
	

	@Given("my billing details are")
	public void myBillingDetailsAre(BillingDetails billingdetails) {
		
		context.billingdetails=billingdetails;
		
	}
	
	@Given("I am a Guest Customer")
	public void i_am_a_Guest_Customer() {
	
		storePage.load(EndPoint.STORE.url);
	}
	

}
