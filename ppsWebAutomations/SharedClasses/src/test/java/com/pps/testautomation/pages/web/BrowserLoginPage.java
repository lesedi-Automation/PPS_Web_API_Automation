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
public class BrowserLoginPage 
{
	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserLoginPage(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	

	
	//Sign In Div
	@FindBy(xpath="//div[@class='container ddid-container']")
	private WebElement signInDiv;
	
	//Email Input
	@FindBy(xpath="//input[@id='Username']")
	private WebElement emailInput;

	//CRM
	@FindBy(xpath="//input[@id='userNameInput']")
	private WebElement emailInputCRM;

	//Password Input
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordInput;

	@FindBy(xpath="//input[@id='passwordInput']")
	private WebElement passwordInputCRM;
	
	//Login Button
	@FindBy(xpath="//button[@id='btnLogin']")
	private WebElement loginButton;


	@FindBy(xpath="//span[@id='submitButton']")
	private WebElement loginButtonCRMSubmit;

	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginButtonCRM;



	//Forgot Password
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	private WebElement forgotPasswordLink;
	
	//Register Button
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registerLink;
	

	//Cancel Button
	@FindBy(xpath="//button[@id='btnCancel']")
	private WebElement cancelButton;
	
	//Discovery Logo
	@FindBy(xpath="//a[@class='site-logo ddid-logo mb-2']")
	private WebElement discoveryLogo;
	
	//Login Text
	@FindBy(xpath="//h4[@id='heading']")
	private WebElement loginText;

	@FindBy(xpath="//h1[normalize-space()='CRM']")
	private WebElement loginTextRCM;



	@FindBy(xpath="//h2[normalize-space()='Welcome']")
	private WebElement loginTextRCMWelcomeText;

	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginButtonCRM_;



	
	//Forgot Username Link
	@FindBy(xpath="//a[contains(text(),'Forgot username?')]")
	private WebElement forgotUsernameLink;

	//Validates the login Page
	public void validateLoginPage()
	{
		try
		{
			verifyElement.waitForFullPageLoad();
			verifyElement.verifyBrowserElement(loginTextRCM,"CRM Text");
			verifyElement.verifyBrowserElement(loginTextRCMWelcomeText,"Welcome Text");
			verifyElement.verifyBrowserElement(loginButtonCRM,"Login Button");
			verifyElement.clickElement(loginButtonCRM,"Click login button");

		}
		catch(Exception e)
		{
			System.err.println("Login elements not displayed");
		}
	}
	

//	public void dismissPopUp()
//		{
//				verifyElement.dismissWebDialog();
//		}
	//Login Function
	public void loginUser(String Email, String Password)
	{

		verifyElement.waitForFullPageLoad();
		verifyElement.clickElement(emailInputCRM,"Email Input Box");
		verifyElement.sendKeys(emailInputCRM, "Email Input Box", Email);
		verifyElement.clickElement(passwordInputCRM,"Password Input Box");
		verifyElement.sendKeysPasswordHide(passwordInputCRM, "Password Input Box", Password);

	}
	
	
	//Click function for Login Button
	public void clickLoginButton()
	{
		verifyElement.waitForFullPageLoad();
			verifyElement.clickElement(loginButtonCRMSubmit,"Login Button");
		
	}
	
	//Click function for Cancel Button
	public void clickCancelButton()
	{	
			verifyElement.clickElement(cancelButton,"Cancel Button");
		
	}
	
	//Click function for Register Link
	public void clickRegisterLink()
	{	
			verifyElement.clickElement(registerLink,"Register Link");
		
	}
	
	//Click function for forgot Password Link
	public void clickForgotPassword()
	{	
			verifyElement.clickElement(forgotPasswordLink,"Forgot Password Link");
		
	}
	
	//Click function for forgot Username Link
	public void clickForgotUsername()
	{	
			verifyElement.clickElement(forgotUsernameLink,"Forgot Username Link");
		
	}
	
	
	//Close Browser
		public void closeBrowser()
		{
			try
			{
				BrowserDriver.quit();
				
			}
			catch(Exception e)
			{
				System.err.println("Browser cannot be closed");
			}
		}


	
}

