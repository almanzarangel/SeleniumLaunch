package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
	
	public static void main(String[] args) {
		
		
		String projectLocation = System.getProperty("user.dir"); //this method will help getting the project location
			
		System.setProperty("webdriver.chrome.driver", projectLocation+ "\\Lib\\chromedriver\\chromedriver.exe"); //Here i set the property to chrome web driver and specify where is located the chromedriver
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.quit();
	}

}
