package awsomecucumber.context;

import org.openqa.selenium.WebDriver;

import awsomecucumber.domainobjects.BillingDetails;
import awsomecucumber.domainobjects.Cookies;

public class TestContext {
	
	public WebDriver driver;
	public BillingDetails billingdetails;
	public Cookies cookies;
	
	public TestContext() {
		cookies = new Cookies();
		cookies.setCookies(new io.restassured.http.Cookies());
	}
	

}
