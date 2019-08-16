package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// extends AbstractTestNGCucumberTests - will run test as TESTNG

// below line will run test as junit
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/",
		glue = "Steps")



public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
