package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
	static String  browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
				
	}
	
		
	public static void setBrowser() {
		browser="GChrome";
	}

	public static void setBrowserConfig() {
		
		String projectLocation = System.getProperty("user.dir"); 
		
		if (browser.contains("Firefox")) {
		System.setProperty("webdriver.gecko.driver", projectLocation+"/Lib/gecko/geckodriver.exe");	
		driver = new FirefoxDriver();
		}
		
		if (browser.contains("GChrome")) {
		System.setProperty("webdriver.chrome.driver", projectLocation+ "\\Lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
}
	
	public static void runTest() {
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
}
