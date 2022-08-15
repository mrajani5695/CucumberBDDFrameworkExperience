package awsomecucumber.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		plugin = {"html:target/ReportMiten/cucumber.html"},
		glue = { "awsomecucumber" }, 
		features = "src/test/resources/awsomecucumber"

)

public class MyTestNgRunnerTest extends AbstractTestNGCucumberTests {
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }

}
