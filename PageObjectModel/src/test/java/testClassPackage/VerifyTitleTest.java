package testClassPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClassPackage.HomePage;
import pageClassPackage.MobilePage;
import pageClassPackage.TVPage;

public class VerifyTitleTest extends BaseTest {
	
	
	@BeforeMethod(alwaysRun=true)
	public void launchBrowserAndGetURL() {
		
		super.navigateToURL();
		
	}
	
	
	@Test(groups = {"Smoke", "Regression"})
	public void verifyHomePageTitleForCorrectTitle() {
		
		HomePage hp = new HomePage(driver);
		String HomePageTitle = hp.getCurrentPageTitle();
		Assert.assertEquals(HomePageTitle, "Home page");
		
	}

	@Test(groups = {"Regression"})
	public void verifyHomePageTitleForIncorrectTitle() {
		
		HomePage hp = new HomePage(driver);
		String HomePageTitle = hp.getCurrentPageTitle();
		Assert.assertNotEquals(HomePageTitle, "Home Page");
		
	}
	
	@Test(groups = {"Regression"})
	public void verifyMobilePageTitleForCorrectTitle() {
		
		HomePage hp = new HomePage(driver);
		hp.findMobileLink();
		MobilePage mp = hp.clickOnMobileLink();
		String MobilePageTitle = mp.getCurrentPageTitle();
		Assert.assertEquals(MobilePageTitle, "Mobile");
		
	}
	
	@Test(groups = {"Regression"})
	public void verifyMobilePageTitleForIncorrectTitle() {
		
		HomePage hp = new HomePage(driver);
		hp.findMobileLink();
		MobilePage mp = hp.clickOnMobileLink();
		String MobilePageTitle = mp.getCurrentPageTitle();
		Assert.assertNotEquals(MobilePageTitle, "mobile");
		
	}
	
	@Test(groups = {"Smoke", "Regression"})
	public void verifyTVPageTitleForCorrectTitle() {
		
		HomePage hp = new HomePage(driver);
		hp.findTVLink();
		TVPage tp = hp.clickOnTVLink();
		String TVPageTitle = tp.getCurrentPageTitle();
		Assert.assertEquals(TVPageTitle, "TV");
	}

	@Test(groups = {"Regression"})
	public void verifyTVPageTitleForIncorrectTitle() {
		
		HomePage hp = new HomePage(driver);
		hp.findTVLink();
		TVPage tp = hp.clickOnTVLink();
		String TVPageTitle = tp.getCurrentPageTitle();
		Assert.assertNotEquals(TVPageTitle, "tv");
	}
	
}
