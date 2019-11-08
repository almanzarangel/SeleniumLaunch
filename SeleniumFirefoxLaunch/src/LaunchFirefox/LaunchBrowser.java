package LaunchFirefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", projectLocation + "\\Jar\\gecko\\geckodriver.exe");
		
				
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);
		driver.get("https://facebook.com");
		//driver.quit();
	}

}
