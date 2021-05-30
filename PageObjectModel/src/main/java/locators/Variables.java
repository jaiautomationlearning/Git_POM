package locators;

import org.openqa.selenium.By;

public class Variables {

	public static final By mobile_link = By.linkText("MOBILE");
	public static final By Tv_Link = By.linkText("TV");
	public static final By Account_Link = By.linkText("ACCOUNT");
	public static final By Login_Link = By.linkText("Log In");
	public static final By user_name_field = By.name("login[username]");
	public static final By password_field = By.name("login[password]");
	public static final By Login_Button = By.xpath("//button[@title='Login']");
	public static final By error_message = By.xpath("//div[@class=’account-login’]/ul/li/ul/li/span");

}
