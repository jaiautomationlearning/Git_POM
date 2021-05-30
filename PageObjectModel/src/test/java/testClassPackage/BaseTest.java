package testClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	

	WebDriver driver;
	
	public void navigateToURL()  {
		
		//Setup Chrome Driver
		WebDriverManager.chromedriver().setup();
						
		//Launch Chrome Browser
		driver = new ChromeDriver();
						
		//Maximize the Window
		driver.manage().window().maximize();
						
		// Navigate to the Home Page of Test URL
		driver.get("http://live.demoguru99.com/");
		
	}


	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
	}

}
