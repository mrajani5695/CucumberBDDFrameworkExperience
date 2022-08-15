package awsomecucumber.stepdefinations;

import org.openqa.selenium.WebDriver;

import awsomecucumber.apis.CartApi;
import awsomecucumber.constants.EndPoint;
import awsomecucumber.context.TestContext;
import awsomecucumber.domainobjects.Product;
import awsomecucumber.pages.PageFactoryManager;
import awsomecucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

//Miten

public class StoreStepDefination {
	
	private final WebDriver driver;
	private final StorePage storePage;
	private TestContext context;
	
	public StoreStepDefination(TestContext context) {
		this.context=context;
		driver = context.driver;
		storePage = PageFactoryManager.getStorePage(context.driver);
	}
	
	@Given("I am in the Store page")
	public void i_am_in_the_Store_page() {

		storePage.load(EndPoint.STORE.url);
	}

	@When("I add a {product} to the Cart")
	public void i_add_a_to_the_Cart(Product product) throws InterruptedException {
		storePage.addToCart(product.getName());
	}
	
	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() throws InterruptedException {
		// storePage.addToCart("Blue Shoes");
		 CartApi cartApi = new CartApi(context.cookies.getCookies());
		 cartApi.addToCart(1215, 1);
		 context.cookies.setCookies(cartApi.getCookies());
		 context.cookies.injectCookiesToBrowser(context.driver);
	}

}
