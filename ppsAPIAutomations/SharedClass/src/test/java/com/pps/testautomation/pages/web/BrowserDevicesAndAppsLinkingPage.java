package com.pps.testautomation.pages.web;

import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserDevicesAndAppsLinkingPage {
	
	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserDevicesAndAppsLinkingPage(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	
	
	/*
	 * ***************************Fitbit Linking *******************************************
	 */
	
	
	//Select all option
	@FindBy(xpath="//input[@id='selectAllScope']")
	private WebElement SelectOpt;
	
	//Allow button
	@FindBy(xpath="//button[@id='allow-button']")
	private WebElement AllowButton;
	
	//Email Input
	@FindBy(xpath="//input[@id='ember653']")
	private WebElement EmailTextBox;
	
	//Password Input 
	@FindBy(xpath="//input[@id='ember654']")
	private WebElement PassworInput;
	
	//Login Buttton
	@FindBy(xpath="//button[@id='ember694']")
	private WebElement Login;
	
	
	public void FitBitLinking() {
		verifyElement.clickElement(EmailTextBox, "Email TextBox");
		verifyElement.sendKeysToApplication(EmailTextBox, "User Email", "ststechnocenter@gmail.com");
		verifyElement.clickElement(PassworInput, "Password textBox");
		verifyElement.sendKeysToApplication(PassworInput, "User Password", "sts@2020");
		verifyElement.clickElement(Login, "LogIn Button");
	}
	
	public void ConfrimLink() {
		verifyElement.clickElement(SelectOpt, "All option tickbox");
		verifyElement.clickElement(AllowButton, "Allow Button");
	}
	
	
	
	//------------------------------Huawei Linking ------------------------------------------
	
	//Huawei Email TextBox
	@FindBy(xpath="//body/div/div/div/div/div/div/span/div/span/div/div/div/input[1]")
	private WebElement HuaweiEmailText;
	
	//Huawei password Text
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement HuaweiPassText;
	
	//Huawei LogIn
	@FindBy(xpath="//div[@class='hwid-btn hwid-btn-primary hwid-login-btn']")
	private WebElement Element3;
	
	//Optain code 
	@FindBy(xpath="//span[contains(text(),'Obtain code')]")
	private WebElement OptaiCode;
	
	//OkButton
	@FindBy(xpath="//div[@class='dialog-btn btn-next']")
	private WebElement OhkButton;
	
	
	
	
	//-------------------------------------Sunnto-----------------------------------------------

	//User Name Text Box
	@FindBy(xpath="//input[@id='username']")
	private WebElement UsernameText;
	
	//User password TextBox
	@FindBy(xpath="//input[@id='password']")
	private WebElement PasswordText;
	
	//Login button
	@FindBy(xpath="//button[@class='btn btn-md btn-block']")
	private WebElement LoginBut;
	
	//Authorise Button
	@FindBy(xpath="//button[contains(text(),'Authorize')]")
	private WebElement AuthorizeButton;
	
	
	
	public void SunntoConfirmLink() {
		verifyElement.clickElement(UsernameText, "Email TextBox");
		verifyElement.sendKeysToApplication(UsernameText, "User Email", "ststechnocenter@gmail.com");
		verifyElement.clickElement(PasswordText, "Password textBox");
		verifyElement.sendKeysToApplication(PasswordText, "User Password", "sts@2020%");
		verifyElement.clickElement(LoginBut, "LogIn Button");
	}
	
	public void ConfrimLinkSunnto() {
		verifyElement.clickElement(AuthorizeButton, "Authorize Button");
	}
	
	
	//-------------------------------------Withings-----------------------------------------------
	
	
	//Withings UserName TextBox
	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement WithingLogIn;
	
	//Withings passwordTextBox
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement WithingsPasswordText;
	
	//Login Button
	@FindBy(xpath="//button[@class='btn btn-main dark-blue btn-lg center-block btn-block']")
	private WebElement WithingsLogInButton;
	
	//Allow app button
	@FindBy(xpath="//button[contains(text(),'Allow this app')]")
	private WebElement AllowAppButton;
	
	
	public void WithingsConfirmLink() {
		verifyElement.clickElement(WithingLogIn, "Email TextBox");
		verifyElement.sendKeysToApplication(WithingLogIn, "User Email", "ststechnocenter@gmail.com");
		verifyElement.clickElement(WithingsPasswordText, "Password textBox");
		verifyElement.sendKeysToApplication(WithingsPasswordText, "User Password", "sts@2020");
		verifyElement.clickElement(WithingsLogInButton, "LogIn Button");
	}
	
	public void ConfrimLinkWithings() {
		verifyElement.clickElement(AllowAppButton, "Allow App Button");
	}
	
	
	//-------------------------------------Technogy-----------------------------------------------
	
	
	//Withings UserName TextBox
	@FindBy(xpath="//input[@id='UserBinder_Username']")
	private WebElement TechnoLogInText;
	
	//Withings passwordTextBox
	@FindBy(xpath="//input[@id='UserBinder_Password']")
	private WebElement TechnoPasswordText;
	
	//Login Button
	@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block')]")
	private WebElement TechnoAllowButton;
	
	//Allow app button
	@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block')]")
	private WebElement TechnoAllowAppButton;
	
	
	public void TechnogymConfirmLink() {
		verifyElement.clickElement(TechnoLogInText, "Email TextBox");
		verifyElement.sendKeysToApplication(TechnoLogInText, "User Email", "ststechnocenter@gmail.com");
		verifyElement.clickElement(TechnoPasswordText, "Password textBox");
		verifyElement.sendKeysToApplication(TechnoPasswordText, "User Password", "ststechno123");
		verifyElement.clickElement(TechnoAllowAppButton, "LogIn Button");
	}
	
	//Accepting cookies
	@FindBy(xpath="//button[contains(text(),'Accept all and close')]")
	private WebElement AcceptAllAndClose;
	
	//Accepting cookies
	@FindBy(xpath="//span[contains(text(),'Before you continue')]")
	private WebElement BeforeYouContinueText;
	public void AcceptingCookies() {
		if(verifyElement.verifyBrowserElementValue(BeforeYouContinueText, "BeforeYouContinueText") == 0) {
			verifyElement.clickElement(AcceptAllAndClose,"Accept All And Close");
		}else{
			System.out.println("There is no accept cookies");
		}
	}
}
