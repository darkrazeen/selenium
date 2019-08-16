package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initilizeDriver() throws IOException{
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Zan\\workspace\\FullFrameWork\\src\\main\\java\\e2EProject\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		//System.out.println(browserName);
		
		
		if(browserName.equals("chrome")) {
		
			// chrome execute
			
			System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		else if (browserName.equals("firefox")) {
			
			// execute firefox
			
			
			System.setProperty("webdriver.chrome.driver", "C://work//geckodriver.exe");
			driver = new FirefoxDriver();
			
			
			// driver created only once as global variable on top
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}
		
	public void getScreenshot(String result) throws IOException
	
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://work//TestScreenShots//"+result+"screenshot.png"));
		
	}


}
