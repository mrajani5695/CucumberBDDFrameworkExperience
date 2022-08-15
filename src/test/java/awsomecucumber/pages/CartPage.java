package awsomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
	
	
	@FindBy (css = "td[class='product-name'] a") private WebElement productnameFld;
	@FindBy (css = "input[type=\"number\"]") private WebElement productQuantityFld;
	@FindBy (css = ".checkout-button") private WebElement proceedToCheckOutButton;

	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
	public String getProductName() {
	
		return wait.until(ExpectedConditions.visibilityOf(productnameFld)).getText();
	}
	
	public int getProductQuantity() {
		return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQuantityFld)).getAttribute("value"));
	}
	
	
	public void checkOut() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckOutButton)).click();
	}
	
	

}
