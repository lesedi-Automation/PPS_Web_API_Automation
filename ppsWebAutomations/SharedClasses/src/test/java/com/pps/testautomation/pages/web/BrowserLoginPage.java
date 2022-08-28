/**
 * 
 */
package com.pps.testautomation.pages.web;


import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Aneshen Govender
 *
 */
public class BrowserLoginPage {
	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement;
	public String Device;

	public BrowserLoginPage(WebDriver browserDriver, String Device) {
		BrowserDriver = browserDriver;
		this.Device = Device;
		verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}


	//Sign In Div
	@FindBy(xpath = "//div[@class='container ddid-container']")
	private WebElement signInDiv;

	//Email Input
	@FindBy(xpath = "//input[@id='Username']")
	private WebElement emailInput;


	//Validates the login Page
	public void validateLoginPage() {
		try {
//			verifyElement.waitForFullPageLoad();
//			verifyElement.verifyBrowserElement(loginTextRCM, "CRM Text");
//			verifyElement.verifyBrowserElement(loginTextRCMWelcomeText, "Welcome Text");
//			verifyElement.verifyBrowserElement(loginButtonCRM, "Login Button");
//			verifyElement.clickElement(loginButtonCRM, "Click login button");

		} catch (Exception e) {
			System.err.println("Login elements not displayed");
		}
	}
}