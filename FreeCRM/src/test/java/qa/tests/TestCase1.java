package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest {
	
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
	
  @Test
  public void sampleMethodForEnteringCredentials() {
	  logger.info("SignIn into LoginPage");
	  homePage.signInButton();
	  logger.info("Verifing if Login text is Present or Not");
	  loginPage.verifyIfLoginPageIsLoaded();
	  logger.info("Lets Enter the Credentials");
	  loginPage.enterCredentials();
  }
}
