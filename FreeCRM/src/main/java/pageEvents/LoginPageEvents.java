package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

	ElementFetch ele = new ElementFetch();

	public void verifyIfLoginPageIsLoaded() {

		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element not found");

	}

	public void enterEmailID() {

		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size() > 0, "Element not found");

	}

	public void enterCredentials() {

		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("antinolabs.raj@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("Antino@123");
	}

}
