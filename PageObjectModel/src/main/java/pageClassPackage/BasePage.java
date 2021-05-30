package pageClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import locators.Variables;

public class BasePage {

	WebDriver driver ;

	
	WebElement MobileLink;
	WebElement TVLink;
	WebElement AccountLink;
	WebElement LoginLink;
	WebElement errorMessage;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	

	public WebElement findMobileLink() {
		
		MobileLink = driver.findElement(Variables.mobile_link);
		return MobileLink;
		
	}
	
	public WebElement findTVLink() {
		
		TVLink = driver.findElement(Variables.Tv_Link);
		return TVLink;
		
	}
	
	public WebElement findAccountLink() {
		
		AccountLink = driver.findElement(Variables.Account_Link);
		return AccountLink;
		
	}
	
	public WebElement findLoginLink() {
		
		LoginLink = driver.findElement(Variables.Login_Link);
		return LoginLink;
		
	}
	
	public WebElement findErrorMessgage() {
		
		errorMessage = driver.findElement(Variables.error_message);
		return errorMessage;
		
	}
	
	public String getCurrentPageTitle() {
		
		String title = driver.getTitle();
		return title;
	}
	

	
	public MobilePage clickOnMobileLink() {
		MobileLink.click();
		return new MobilePage(driver);
		
	}

	public TVPage clickOnTVLink() {
		TVLink.click();
		return new TVPage(driver);
	}
	
	public void clickOnAccountLink() {
		AccountLink.click();
	}
	
	public LoginPage clickOnLoginLink() {
		LoginLink.click();
		return new LoginPage(driver);
	}
	
}
