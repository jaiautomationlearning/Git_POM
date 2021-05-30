package testClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClassPackage.HomePage;
import pageClassPackage.LoginPage;
import pageClassPackage.MyAccountPage;

public class VerifyLoginTest extends BaseTest {
	
	@BeforeMethod(alwaysRun=true)
	public void launchBrowserAndGetURL() {
		
		super.navigateToURL();
		
	}
	
	@Test(groups = {"Smoke", "Regression"})
	public void verifyLoginForCorrectCredentials() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.findAccountLink();
		hp.clickOnAccountLink();
		hp.findLoginLink();
		LoginPage lp = hp.clickOnLoginLink();
		lp.findUserNameField();
		lp.enteruserName("firstname09052021.lastname09052021@test.com");
		lp.findPasswordField();
		lp.enterPassword("pass09052021");
		lp.findLoginButton();
		MyAccountPage ap = lp.clickOnLoginButton();
		String AccountPageTitle = ap.getCurrentPageTitle();
		Assert.assertEquals(AccountPageTitle, "My Account");
		//Writing Comments
		//Assert.assertEquals(AccountPageTitle, "My Account");
		Thread.sleep(4000);
		
	}
	
	@Test(groups = {"Regression"})
	public void verifyLoginForInCorrectCredentials() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.findAccountLink();
		hp.clickOnAccountLink();
		hp.findLoginLink();
		LoginPage lp = hp.clickOnLoginLink();
		lp.findUserNameField();
		lp.enteruserName("firstname09052021.lastname09052021@test.com");
		lp.findPasswordField();
		lp.enterPassword("password");
		lp.findLoginButton();
		MyAccountPage ap = lp.clickOnLoginButton();
		String AccountPageTitle = ap.getCurrentPageTitle();
		Assert.assertNotEquals(AccountPageTitle, "My Account");
		Thread.sleep(4000);
		
	}

	

}
