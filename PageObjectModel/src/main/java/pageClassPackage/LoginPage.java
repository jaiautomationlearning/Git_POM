package pageClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Variables;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}

	WebElement userNameField;
	WebElement passwordField;
	WebElement loginButton;
	
	public WebElement findUserNameField() {
		
		userNameField = driver.findElement(Variables.user_name_field);
		return userNameField;
		
	}
	
	public WebElement findPasswordField() {
		
		passwordField = driver.findElement(Variables.password_field);
		return passwordField;
		
	}
	
	public WebElement findLoginButton() {
		
		loginButton = driver.findElement(Variables.Login_Button);
		return loginButton;
		
	}
	
	
	
	public void enteruserName(String uname) {
		
		userNameField.sendKeys(uname);
		
	}
	
	public void enterPassword(String pass) {
		
		passwordField.sendKeys(pass);
		
	}
	
	public MyAccountPage clickOnLoginButton()  {
		
		loginButton.click();
		return new MyAccountPage(driver);
	}

}
