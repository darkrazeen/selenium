package e2EProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import java.io.IOException;

import Resources.base;
import pageObjects.LandingPage;

public class ValidateTitle extends base {
	
	private static Logger log = LogManager.getLogger(ValidateTitle.class.getName());
	
	@BeforeTest 
	
	public void initilize() throws IOException {
		
		driver = initilizeDriver();
        log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("HomePage Has been Opened");
		
		//driver.manage().window().maximize();
	}
	
	

@Test
public void basePageCourses() throws IOException {
		
		

		// can use inheritance (extends) to call other classes
		// can also create direct objects to call other classes

		LandingPage l = new LandingPage(driver);
		l.noThanks().click();
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES" );
		log.info("Successfully Validated Title Featured Courses");
		
		Assert.assertTrue(l.getBar().isDisplayed());
		
		
				
	
	}

@AfterTest
public void TearDown() {
	driver.close();
	driver=null;
}
	
	
}