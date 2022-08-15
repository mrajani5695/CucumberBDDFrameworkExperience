package awsomecucumber.hooks;

import org.openqa.selenium.WebDriver;

import awsomecucumber.context.TestContext;
import awsomecucumber.factory.DriverFactory;
import io.cucumber.core.internal.gherkin.ast.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	private WebDriver driver;
	
	private final TestContext context;
	
	

	
	
	
	public MyHooks(TestContext context) {
	
		this.context = context;
	}

	@Before
	public void before() {
		
		
		driver = DriverFactory.initializeDriver(System.getProperty("browser", "chrome"));
		context.driver = driver;
	}	
	
	@After
	public void after() {
		driver.quit();
	}

}
