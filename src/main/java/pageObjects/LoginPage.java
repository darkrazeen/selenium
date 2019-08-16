package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By EMAIL = By.xpath("//input[@type='email']");
	By PASS = By.xpath("//input[@type='password']");
	By BUTT = By.xpath("//input[@type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
	}
	
			
public WebElement getLogin() {
		

		return driver.findElement(EMAIL);
		
	}

public WebElement getpass() {
	
	return driver.findElement(PASS);
}

public WebElement button() {
	
	return driver.findElement(BUTT);
}


}
