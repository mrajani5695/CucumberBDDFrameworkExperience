package awsomecucumber.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static final ThreadLocal<WebDriver>  driver = new ThreadLocal<WebDriver>();
	
	 public static WebDriver initializeDriver(String browser) {
	 WebDriver driver;	 
		 switch (browser) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			
			// System.setProperty("webdriver.chrome.driver", "C:\\Users\\91999\\Downloads\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			// System.setProperty("webdriver.edge.driver", "C:\\Users\\91999\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
				break;

		default:
			throw new IllegalStateException("INVALID BROWSER" +browser);
		
		}
		 
		
			driver.manage().window().maximize();
			DriverFactory.driver.set(driver);
			driver.get("https://askomdch.com/store/");
			return driver;
	 }
	 
	 public static WebDriver getDriver() {
		 return driver.get();
	 }

}
