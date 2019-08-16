package e2EProject;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


import Resources.base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base {
	
	
@BeforeTest 
	
	public void initilize() throws IOException {
		
		//driver = initilizeDriver();

		
	//	driver.get(prop.getProperty("url"));
		
		//driver.manage().window().maximize();
	}

	@Test(dataProvider = "getData")

	public void basePageLogin(String username, String password, String text ) throws IOException {

           driver = initilizeDriver();

		
		driver.get(prop.getProperty("url"));
		// can use inheritance (extends) to call other classes
		// can also create direct objects to call other classes

		LandingPage l = new LandingPage(driver);
		//System.out.println(l.getTitle().getText());
		l.noThanks().click();
		l.getLogin().click();

		LoginPage p = new LoginPage(driver);
		p.getLogin().sendKeys(username);
		p.getpass().sendKeys(password);
		System.out.println(text);
		p.button().click();
		

	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "darkrazeen@gmail.com";
		data[0][1] = "plmokn";
		data[0][2] = "NON-Restricted User";
		
		data[1][0] = "cannotlogin@gmail.com";
		data[1][1] = "qwertyuiop";
		data[1][2] = "Restricted User";
		
		return data;
				
		
				
				
	}

	@AfterMethod
	public void TearDown() {
	driver.close();
	}
	
	@AfterTest
	public void shutdown() {
	driver=null;
	}
	
}