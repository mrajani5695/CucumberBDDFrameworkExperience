package awsomecucumber.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import awsomecucumber.context.TestContext;
import awsomecucumber.domainobjects.Product;
import awsomecucumber.pages.CartPage;
import awsomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CartStepDefinations {
	

	private final CartPage cartPage;
	
	
	public CartStepDefinations(TestContext context) {
		
	
		cartPage = PageFactoryManager.getCartPage(context.driver);
		
	}

	
	@SuppressWarnings("deprecation")
	@Then("I see {int} {product} in the cart")
	public void i_see_in_the_cart(int quantity, Product product) {
		// Write code here that turns the phrase above into concrete actions

		

		Assert.assertEquals(product.getName(), cartPage.getProductName());
		Assert.assertEquals(quantity, cartPage.getProductQuantity());

	}
	
	
}
