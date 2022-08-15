package awsomecucumber.pages;

import java.nio.charset.StandardCharsets;

import java.nio.charset.StandardCharsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

	@FindBy(css = "a[title='View cart']")
	private WebElement viewCartLink;

	public StorePage(WebDriver driver) {
		super(driver);

	}
	
	public void addToCart(String productName) {
		
		/*
		 * String raw = "a[aria-label='Add “" + productName + "” to your cart']"; byte[]
		 * bytes = raw.getBytes(StandardCharsets.UTF_8); String utf8Encoded = new
		 * String(bytes,StandardCharsets.UTF_8); By addToCartButton =
		 * By.cssSelector(utf8Encoded);
		 * wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
		 * wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
		 */
		
		  String raw = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/ul[1]/li[5]/div[2]/a[2]";
	        byte[] bytes = raw.getBytes(StandardCharsets.UTF_8);
	        String utf8Encoded = new String(bytes, StandardCharsets.UTF_8);
	        
	        //a[aria-label='Add “"+productName+"” to your cart']
	        By addToCartBtn = By.xpath(utf8Encoded);
	      //  wait.until(ExpectedConditions.visibilityOf(titleTxt));
//	        wait.until(ExpectedConditions.visibilityOfAllElements(images));
	        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
	
		
	}

}
