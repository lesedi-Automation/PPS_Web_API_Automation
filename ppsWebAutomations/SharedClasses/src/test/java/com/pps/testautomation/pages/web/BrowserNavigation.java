/**
 * 
 */
package com.pps.testautomation.pages.web;


import com.pps.testautomation.utilities.ElementFunctionality;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Aneshen Govender
 *
 */
public class BrowserNavigation 
{
	public WebDriver BrowserDriver;
	public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserNavigation(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}


	//CRM



	@FindBy(xpath="//div[@class='avatar-user mx-auto']")
	private WebElement logoutIconCRM;

	@FindBy(xpath="//a[contains(text(),'Log out CRM')]")
	private WebElement logoutCRM;




	//Main Navigation
	//Discovery Vitality Logo
	@FindBy(xpath="//div[@class='navbar-brand-discovery']/a[@href='/']")
	private WebElement discoveryLogo;



	@FindBy(xpath="//a[@class='logo']")
	private WebElement discoveryLogoCRM;

	
	//Discovery Vitality Logo Image Compare Test
	@FindBy(xpath="//a[contains(@class,'site-logo')]")
	private WebElement discoveryLogo1;
	
	//Navigation Div
	@FindBy(xpath="//div[@class='meganav-top-level hidden-md-down']")
	private WebElement navigationDiv;

	//Portfolio Link
	@FindBy(xpath="//div[@class='container top-level-nav-container']//a[contains(text(),'Portfolio')]")
	private WebElement portfolioLink;
		
	//Vitality Link
	@FindBy(xpath="//div[@class='container top-level-nav-container']//a[@id='topnav-vitality']")
	private WebElement vitalityLink;
	
	//Vitality Link
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[7]/android.view.View/android.view.View")
	private WebElement vitalityMobileLink;
	
	//Bank Link
	@FindBy(xpath="//*[@id='topnav-bank' or @resource-id='topnav-bank']")
	private WebElement bankLink;
	
	//Medical Aid Link
	@FindBy(xpath="//*[@id='topnav-medical-aid' or @resource-id='topnav-medical-aid']")
	private WebElement medicalAidLink;
	
	//Gap Cover Link
	@FindBy(xpath="//*[@id='topnav-gap' or @resource-id='topnav-gap']")
	private WebElement gapCoverLink;
	
	//Life Insurance Link
	@FindBy(xpath="//*[@id='topnav-life-insurance' or @resource-id='topnav-life-insurance']")
	private WebElement lifeInsuranceLink;
	
	//Investments Link
	@FindBy(xpath="//*[@id='topnav-investments' or @resource-id='topnav-investments']")
	private WebElement investmentsLink;
	
	//Car and Home Insurance Link
	@FindBy(xpath="//*[@id='topnav-car-and-home-insurance' or @resource-id='topnav-car-and-home-insurance']")
	private WebElement carAndHomeInsuranceLink;
	
	//Credit Card Link
	@FindBy(xpath="//*[@id='topnav-credit-card' or @resource-id='topnav-credit-card']")
	private WebElement creditCardLink;
	
	//Rewards Partner Link
	@FindBy(xpath="//*[@id='topnav-reward-partners' or @resource-id='topnav-reward-partners']")
	private WebElement rewardPartnersLink;
	
	//Mobile Menu
	@FindBy(id="js-mobile-nav-trigger")
	private WebElement mobileMenu;
	
	//For individuals link
	@FindBy(xpath="//a[contains(text(),'FOR INDIVIDUALS')]")
	private WebElement forIndividualsLink;
	
	//For business link
	@FindBy(xpath="//a[contains(text(),'FOR BUSINESS')]")
	private WebElement forBusinessLink;
	
	//Whats new Link
	@FindBy(xpath="//span[contains(@class,'hidden-lg-down')]")
	private WebElement whatsNewLink;
	
	//Login Button
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	private WebElement loginButton;
	
	
	@FindBy(xpath="//ul[@class='list-inline list-inline-divided login-navigation d-flex align-items-center']//a[.='Log out']")
	private WebElement LogOutButton;
	//Search Icon
	@FindBy(xpath="//a[@id='js-search-trigger']")
	private WebElement searchIcon;
	
	//Register Link
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registerLink;
	
	// Link
	@FindBy(xpath="//div[@id='main-container']//a")
	private WebElement Link;
	
	
	//Covid-19 Track spread update 
	@FindBy(xpath="//body/div[@id='decoratedModal']/div/div/div/a[1]")
	private WebElement RemoveUpdate;
		
	// Vitality Tab
	@FindBy(xpath = "//div[@class='container-fluid container-wrapper top-level-nav-container']//a[@id='topnav-vitality']")
	private WebElement Vitality_Tab;
	
	
	//INSPECTIONS FOR HEALTH PROFETIONAL MEMBERS 
	
	@FindBy(xpath="//a[@id='topnav-health-professional-tools']")
	private WebElement ToolsOption;
	
	@FindBy(xpath="//div[@id='js-navigation-inner-container']//a[.='Flu vaccinations']")
	private WebElement Flu_Vaccination;
	
	@FindBy(xpath="//div[@id='js-navigation-inner-container']//a[.='VCT']")
	private WebElement VCT;
	
	
	@FindBy(xpath="//div[@id='js-navigation-inner-container']//a[.='Vitality Wellness Network']")
	private WebElement VWN;
	
	@FindBy(xpath="//div[@id='js-navigation-inner-container']//a[.='Vitality Fitness Assessments']")
	private WebElement VFA;
	
	@FindBy(xpath="//ul[@class='list-inline list-inline-divided login-navigation d-flex align-items-center']//a[@id='zone-switcher']")
	private WebElement EntityTypeDropdown;
	
	
	
	public void ClickToolsOption()
	{
		verifyElement.clickElement(ToolsOption, "ToolsOption");
	}
	
	public void ClickFlu_Vaccination() {
		verifyElement.clickElement(Flu_Vaccination, "Flu_Vaccination");
	}
	
	public void ClickVCT() {
		verifyElement.clickElement(VCT, "VCT");
	}
	
	public void ClickVNC() {
		verifyElement.clickElement(VWN, "VNC");
	}
	
	public void ClickVFA() {
		verifyElement.clickElement(VFA, "VFA");
	}
	
	public void clickLogOutButton() 
	{
//		JavascriptExecutor executor = (JavascriptExecutor) BrowserDriver;
//		executor.executeScript("arguments[0].scrollIntoView(true);", LogOutButton);
//		verifyElement.clickElement(LogOutButton, "LogOut Button");

		//Logout CRM



		verifyElement.clickElement(logoutIconCRM, "LogOut Icon");
		verifyElement.clickElement(logoutCRM, "logoutCRM Button");


	}
	
	//Validates the presence of the home page logo
	public void validateHomePageLogo()
	{
		try
		{

			verifyElement.verifyBrowserElement(discoveryLogoCRM,"Discovery Logo CRM");
		}
		catch(Exception e)
		{
			System.err.println("Discover Logo not displayed");
		}
	}
	
	//Validates the main Navigation
	public void validateTopNavigation()
	{
		try
		{
			verifyElement.verifyBrowserElement(navigationDiv,"Navigation Bar");
			//verifyElement.verifyBrowserElement(discoveryLogo,"Discovery Logo");
			//verifyElement.verifyBrowserElement(forIndividualsLink,"For Individual Link");
			//verifyElement.verifyBrowserElement(forBusinessLink,"For Business Link");
			//verifyElement.verifyBrowserElement(loginButton,"Login Button");
			//verifyElement.verifyBrowserElement(whatsNewLink,"Whats New Link");
			//verifyElement.verifyBrowserElement(registerLink,"Register Link");
			verifyElement.verifyBrowserElement(searchIcon,"Search Icon");
			verifyElement.verifyBrowserElement(portfolioLink,"Portfolio Link");
			verifyElement.verifyBrowserElement(bankLink,"Bank Link");
			verifyElement.verifyBrowserElement(medicalAidLink,"Medical Aid Link");
			verifyElement.verifyBrowserElement(gapCoverLink,"Gap Cover Link");
			verifyElement.verifyBrowserElement(lifeInsuranceLink,"Life Insurance Link");
			verifyElement.verifyBrowserElement(investmentsLink,"Investments Link");
			verifyElement.verifyBrowserElement(carAndHomeInsuranceLink,"Car and Home Insurance Link");
			verifyElement.verifyBrowserElement(vitalityLink,"Vitality Link");
			verifyElement.verifyBrowserElement(creditCardLink,"Credit Card Link");
			verifyElement.verifyBrowserElement(rewardPartnersLink,"Reward Partners Link");
			verifyElement.verifyBrowserElement(EntityTypeDropdown, "Entity Type Dropdown");
			verifyElement.PageLinksValidation("//nav[@id='js-site-header']//a");
			
			
			
			
		}
		catch(Exception e)
		{
			System.err.println("Navigation not displayed");
		}
	}
	

	//Validates the main Navigation
	public void validateFooterNavigation()
	{
	
			verifyElement.PageLinksValidation("//div[@class='footer-container']//a");
	}
	
	
	
	//Click function for Individuals Link
	public void clickForIndividualsLink()
	{	
		
		verifyElement.clickElement(forIndividualsLink,"For Individual Link");
		
		
	}
	//Click function for Business Link
	public void clickForBusinessLink()
	{	
		verifyElement.clickElement(forBusinessLink,"For Business Link");
		
		
	}
	
	
	//Email Input
	@FindBy(xpath="//input[@id='Username']")
	private WebElement emailInput;
	//Click function for Get Healthy Link
	public void clickLoginButton()
	{	
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

		verifyElement.waitForFullPageLoad();
		verifyElement.clickElement(loginButton,"Login Button");

	}
	//Click function Whats New Link
	public void clickWhatsNewLink()
	{	
		verifyElement.clickElement(whatsNewLink,"Whats New Link");
		
		
	}
		
		//Click function for Bank Link
		public void clickBankLink()
		{	
				verifyElement.clickElement(bankLink,"Bank Link");
			
		}
		
		//Click function for mobile browser menu
		public void clickMobileMenu()
		{	
				verifyElement.clickElement(mobileMenu,"Mobile Menu Button");
			
		}
		
		//Click function for Medical Aid Link
		public void clickMedicalAidLink()
		{
				verifyElement.clickElement(medicalAidLink,"Medical Aid Link");
			
		}
		
		//Click function for Gap Cover Link
		public void clickGapCoverLink()
		{
			
				verifyElement.clickElement(gapCoverLink,"Gap Cover Link");
				
			
		}
		
		//Click function for Life Insurance Link
		public void clickLifeInsuranceLink()
		{
		
				verifyElement.clickElement(lifeInsuranceLink,"Life Insurance Link");
	
			
		}
		
		//Click function for Investment Link
		public void clickInvestmentLink()
		{
			
				verifyElement.clickElement(investmentsLink,"Investments Link");
		
			
		}
		
		//Click function for Car And Home Insurance Link
		public void clickCarAndHomeInsuranceLink()
		{
			
				verifyElement.clickElement(carAndHomeInsuranceLink,"Car and Home Insurance Link");
			
			
		}
		
		@FindBy(xpath="//a[@id='topnav-vitality']")
		private WebElement vitalityLink2;
		
		//Click function for Vitality Link
		public void clickVitalityLink()
		{
			
			JavascriptExecutor executor = (JavascriptExecutor) BrowserDriver;
			
			if (verifyElement.verifyBrowserElementValue(vitalityLink,"Vitality Link") == 0)
			{
			    executor.executeScript("arguments[0].scrollIntoView(true);", vitalityLink);
			    
				while(verifyElement.verifyBrowserElementValue(vitalityLink,"Vitality Link") != 0) {}
				verifyElement.clickElement(vitalityLink,"Vitality Link");
			}
			else if(verifyElement.verifyBrowserElementValue(vitalityLink2, "Vitality Link 2") == 0)
			{
			    executor.executeScript("arguments[0].scrollIntoView(true);", vitalityLink2);
			    
				while(verifyElement.verifyBrowserElementValue(vitalityLink2,"Vitality Link 2") != 0) {}
				verifyElement.clickElement(vitalityLink2,"Vitality Link 2");
			}
		}
		
		//Click function for contine button
		public void clickContinueButton()
		{
			if (verifyElement.verifyBrowserElementValue(btn_Continue,"btn_Continue") == 0)
			{
				while(verifyElement.verifyBrowserElementValue(btn_Continue,"btn_Continue") != 0) {}
				verifyElement.clickElement(btn_Continue,"btn_Continue");
			}
			else
			{
				System.out.println("Continue button not found");
			}
		}

		
		//Click function for Credit Card Link
		public void clickCreditCardLink()
		{
			
				verifyElement.clickElement(creditCardLink,"Credit Card Link");
			
		}
		
		//Click function for Reward Partneers Link
		public void clickRewardPartnersLink()
		{
	
				verifyElement.clickElement(rewardPartnersLink,"Reward Partners Link");
			
		}
		
		//Click function for Register Link
		public void clickRegisterLink()
		{	
			verifyElement.clickElement(registerLink,"Register Link");
			
			
		}
		
		//Click function for Portfolio Link
		public void clickPortfolioLink()
		{	
			verifyElement.clickElement(portfolioLink,"Portfolio Link");
			
			
		}
		
		//Click function for search Icon
		public void clickSearchIcon()
		{	
	
			verifyElement.clickElement(searchIcon,"Search Icon");	
			
		}
		
	
	
		public void PageLinksValidation()
		
		{
			verifyElement.PageLinksValidation("//a");
			 
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

		public void captureDiscoveryLogo() {
			verifyElement.verifyBrowserElement(discoveryLogo1,"discoveryLogo");
			verifyElement.captureImageScreenshot(discoveryLogo1,"discoveryLogo");
		}
		
		public void compareDiscoveryLogo() {  
			System.out.println("Starting Image Comparison");
	        BufferedImage expectedImage;
			try {
				expectedImage = ImageIO.read(new File(System.getProperty("user.dir") +"\\Images\\discoveryLogo.png"));
		        Screenshot logoImageScreenshot = new AShot().takeScreenshot(BrowserDriver, investmentsLink);
		        BufferedImage actualImage = logoImageScreenshot.getImage();
		                 
		        ImageDiffer imgDiff = new ImageDiffer();
		        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
		        Assert.assertFalse("Images are Different",diff.hasDiff());
		        System.out.println("Image Comparison Completed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		public void clickVitality_Tab() {
			if (verifyElement.verifyBrowserElementValue(Vitality_Tab, "Vitality Tab") == 0) {
				verifyElement.clickElement(Vitality_Tab, "Vitality Tab");
			} else {
				System.err.println("Vitality Tab Element Couldn't Be Found");
			}
		}
		

		public void selectEntityType(String EntityType) {
			verifyElement.verifyBrowserElement(EntityTypeDropdown, "Entity Type Dropdown");
			verifyElement.selectorOptionPicker(EntityTypeDropdown, "Entity Type Dropdown", EntityType);
		}

	
		// Pop-up Continue button
		@FindBy(xpath = "//*[@id='btnContinue']")
		private WebElement btn_Continue;
		
		public void clickBtn_Continue() {
			if (verifyElement.verifyBrowserElementValue(btn_Continue, "Continue Button") == 0) {
				verifyElement.clickElement(btn_Continue, "Continue Button");
			} else {
				System.err.println("Continue Button Couldn't Be Found");
			}
		}
}

