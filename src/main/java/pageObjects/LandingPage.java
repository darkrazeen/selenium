package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By button = By.xpath("//button[contains(text(),'NO THANKS')]");
	By text = By.xpath("//div[@class='text-center']/h2");
	By title = By.xpath("/html[1]/body[1]/header[1]/div[2]");
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver; 
	}
	
			
public WebElement getLogin() {
		

		return driver.findElement(signin);
		
	}
	
	public WebElement noThanks() {
		
	
		
		return driver.findElement(button);
	}
	
	public WebElement getTitle(){
		
		return driver.findElement(text);
	}
	
	public WebElement getBar() {
		
		return driver.findElement(title);
	}
	
}

