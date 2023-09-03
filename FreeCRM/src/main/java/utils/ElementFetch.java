package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {

	public WebElement getWebElement(String identifierType, String indentifierValue) {

		switch (identifierType) {

		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(indentifierValue));
		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(indentifierValue));
		case "ID":
			return BaseTest.driver.findElement(By.id(indentifierValue));
		case "CLASSNAME":
			return BaseTest.driver.findElement(By.className(indentifierValue));
		case "NAME":
			return BaseTest.driver.findElement(By.name(indentifierValue));
		case "LINKTEXT":
			return BaseTest.driver.findElement(By.linkText(indentifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(indentifierValue));
		case "PARTIALLINKTEXT":
			return BaseTest.driver.findElement(By.partialLinkText(indentifierValue));

		default:
			return null;
		}

	}

	public List<WebElement> getWebElements(String identifierType, String indentifierValue) {

		switch (identifierType) {

		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(indentifierValue));
		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(indentifierValue));
		case "ID":
			return BaseTest.driver.findElements(By.id(indentifierValue));
		case "CLASSNAME":
			return BaseTest.driver.findElements(By.className(indentifierValue));
		case "NAME":
			return BaseTest.driver.findElements(By.name(indentifierValue));
		case "LINKTEXT":
			return BaseTest.driver.findElements(By.linkText(indentifierValue));
		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(indentifierValue));
		case "PARTIALLINKTEXT":
			return BaseTest.driver.findElements(By.partialLinkText(indentifierValue));

		default:
			return null;
		}

	}

}
