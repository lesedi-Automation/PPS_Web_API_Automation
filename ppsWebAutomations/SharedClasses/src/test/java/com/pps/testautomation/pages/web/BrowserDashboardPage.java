/**
 * 
 */
package com.pps.testautomation.pages.web;


import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Aneshen Govender
 *
 */
public class BrowserDashboardPage 
{
	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserDashboardPage(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	
	
	public void ClickViewMyPointsTrackerLink() {
		
	}

	//Vitality Status Frame
	@FindBy(xpath="//iframe[@id='vitalityStatusIframe']")
	private WebElement vitalityStatusFrame;
	
	//Vitality App Frame
	               //iframe[@id='appIFrameObj']
	@FindBy(xpath="//iframe[@id='appIFrameObj']")
	private WebElement vitalityAppFrame;
	
	//Vitality Title
	@FindBy(xpath="//h1[contains(text(),'Vitality Dashboard')]")
	private WebElement vitalityDashBoardTitle;
	

	public void verifyElement_Exists(WebElement el, String elDescription) {
		if (verifyElement.verifyBrowserElementValue(el, elDescription) == 0) {
			verifyElement.verifyBrowserElement(el, elDescription);
		} else {
			System.err.println(elDescription + " Couldn't Be Found");
		}
	}

	@FindBy(xpath="//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']")
	private WebElement cookiePoilicyCloseButton;
	
	@FindBy(xpath="//h5[contains(text(),'Recent')]")
	private WebElement recentText;


	//Validate Dashboard Page
	public void validateDashboardPage()
	{
		try
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			verifyElement.clickElement(cookiePoilicyCloseButton, "cookiePoilicyCloseButton");
			verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");

				
			verifyElement.verifyBrowserElement(vitalityDashBoardTitle, "Vitality Dashboard Title");
			//verifyElement.PageLinksValidation("//div[@class='body-wrapper']//a");

			verifyElement.ImageValidation("//img");
			verifyElement.switchOutOfBrowserFrame();
		}
		catch(Exception e)
		{
			System.err.println("Page link elements not displayed");
		}
	}
	
	
	/////----------------------------------LET'S START HERE---------------------------------------//
	//Runner Man Div
	@FindBy(xpath = "//div[@class='span12']/div[@id='runningManMainDiv']")
	private WebElement runnerManDiv;
	
	//Runner Man Div Frame
	@FindBy(xpath = "//iframe[@id='vitalityStatusIframe']")
	private WebElement runnerManDivFrame;
	
	//Runner Man Exclamation Image
	@FindBy(xpath = "//img[@class='img left']")
	private WebElement runnerManExcalamation;
	
	//Runner Man Title
	@FindBy(xpath = "//p[contains(text(),'The Vitality Running man is currently unavailable,')]")
	private WebElement runnerManTitle;
	
	
	//Dashboard Main Div
	@FindBy(xpath = "//body/div[@id='main-container']/div[@class='container']/div[@class='row']/div[1]")
	private WebElement dashboardMainDiv;
	
	//Dashboard Title
	@FindBy(xpath = "//h1[@class='brand-label']")
	private WebElement dashboardTitle;
	
	//Dashboard help
	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]")
	private WebElement dashboardHelpLink;
	
	//eatHealthyBlock
	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/img[1]/../../../../../../..")
	private WebElement fitnessBlock;
		
	//eatHealthyBlock
	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/img[1]/../../../../../../..")
	private WebElement eatHealthyBlock;
	
	//eatHealthyBlock
	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/p[1]/img[1]/../../..")
	private WebElement pointsAndStatusBlock;
	
	//benefitsBlock
	@FindBy(xpath = "	//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]/img[1]/../../../../../..")
	private WebElement benefitsBlock;
		
	//sterkenikorBlock
	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]")
	private WebElement sterkenikorBlock;
		
		
	
	
	//Dashboard Frame
	@FindBy(xpath = "//iframe[@id='appIFrameObj']")
	private WebElement dashboardFrame;
	
	//Eat Healthy & Fitness Div
	@FindBy(xpath = "//body/div[@class='body-wrapper']/div[@id='main-content-structure-row']/div[@id='main-container']/div[@class='row-fluid']/div[@id='standard-member-dashboard']/div[@id='widgets']/div[1]/div[1]")
	private WebElement eatHealthyFitnessDiv;
	
	//Eat Healthy & Fitness Title
	@FindBy(xpath = "//div[@id='090040be806da1db']//img")
	private WebElement eatHealthyFitnessImage;
	
		@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/img[1]")
		private WebElement eatHealthyTitle;
		
		@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h6[1]")
		private WebElement eatHealthySubTitle;
			
		@FindBy(xpath = "//div[@class='vertical-divider flush-bottom']")
		private WebElement pnPNutritionBlock;
		
		@FindBy(xpath = "//div[@class='span6 clearfix flush-bottom']")
		private WebElement woolworthsNutritionBlock;
		
		@FindBy(xpath = "//span[contains(text(),'Link Smart Shopper card')]")
		private WebElement smartShopperCardLink;
			
		@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/p[1]")
		private WebElement increaseYourHealthyFoodRewardText;
		
		@FindBy(xpath = "//a[contains(text(),'How to take your nutrition further')]")
		private WebElement howToTakeYourNutritionFurtherLink;
	
	//Validate Running Man section if  it is available
	public void verifyVitalityDashBoardRuningManDiv()
	{
		if(verifyElement.verifyBrowserElementValue(runnerManDiv, "Runner Man Div") == 0)
		{
			verifyElement.verifyBrowserElement(runnerManDiv,"Runner Man Div");
			verifyElement.verifyBrowserElement(runnerManDivFrame,"Runner Man Div Frame");
			verifyElement.verifyBrowserElement(runnerManExcalamation,"Runner Man Exclamation");
			verifyElement.verifyBrowserElement(runnerManTitle,"Runner Man Title");
		}
		else
		{
			verifyElement.failTest("The Runner man section is currently unavailable");
		}
		
	}
	

	public void clickHelpLink() 
	{
		verifyElement.verifyBrowserElement(dashboardMainDiv,"Dashboard Main Div");
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.clickElement(dashboardHelpLink,"dashboard Help Link");
			
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void verifyNutritionBlockElements() 
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(eatHealthyTitle, "eat Healthy Title");
		verifyElement.verifyBrowserElement(eatHealthySubTitle, "eat Healthy Sub Title");
		verifyElement.verifyBrowserElement(pnPNutritionBlock, "pnP Nutrition Block");
		verifyElement.verifyBrowserElement(woolworthsNutritionBlock, "woolworths Nutrition Block");
		verifyElement.verifyBrowserElement(smartShopperCardLink, "smart Shopper Card Link");
		verifyElement.verifyBrowserElement(increaseYourHealthyFoodRewardText, "increase Your Healthy Food Reward Text");
		verifyElement.verifyBrowserElement(howToTakeYourNutritionFurtherLink, "how To Take Your Nutrition Further Link");
		
		
		verifyElement.switchOutOfBrowserFrame();
	}


	public void verifyVitalityDashboard() 
	{
		verifyElement.verifyBrowserElement(dashboardMainDiv,"Dashboard Main Div");
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(dashboardTitle,"Dashboard Title");
		verifyElement.verifyBrowserElement(eatHealthyFitnessDiv,"Eat Healthy & Fitness Div");
		verifyElement.verifyBrowserElement(eatHealthyFitnessImage,"Eat Healthy & Fitness Image");

		verifyElement.verifyBrowserElement(fitnessBlock, "fitness Block");
		verifyElement.verifyBrowserElement(eatHealthyBlock,"eat Healthy Block");
		verifyElement.verifyBrowserElement(pointsAndStatusBlock,"points And Status Block");
		verifyElement.verifyBrowserElement(benefitsBlock,"benefits Block");
		verifyElement.verifyBrowserElement(sterkenikorBlock, "sterkenikor Block");
			
		verifyElement.switchOutOfBrowserFrame();
	}	
	
	
	//-------Vitality Active Rewards--------------->
	
	//Vitality Active rewards Title
	@FindBy(xpath="//div[@id='090040be8054a63f']//h6[1]")
	private WebElement VitalityActiveRewardTitle;
	
	//Vitality Active rewards Title
	@FindBy(xpath="//*[name()='path' and contains(@class,'progress')]")
	private WebElement VitalityPrgress;
	
	@FindBy(xpath="//*[@id='activerewardschart-svg']")//*[name()='path' and contains(@class,'bg')]
	private WebElement ProgressColor;
	
	//Vitality Active rewards Title
	@FindBy(xpath="//*[name()='text' and contains(@class,'completed')]")
	private WebElement PointCompleted;
	
	//Vitality Active rewards Title
	@FindBy(xpath="//div[@id='090040be806cb456']//h6[1]")
	private WebElement PointsGoal;
	
	//Vitality Active rewards Title
	@FindBy(xpath="//div[@id='090040be806cb456']//h6[1]//span")
	private WebElement PointsGoalNumber;
	
	//Vitality Active rewards Title
	@FindBy(xpath="//div[@id='090040be806cb456']//h6[2]")
	private WebElement TimeLeft;
	
	//Vitality Vitality Active Rewards Link
	@FindBy(xpath="//div[@class='more-info-link push-top']//a")
	private WebElement VARLink;
	
	//Recent on recent points
	@FindBy(xpath="//h5[@class='flush-bottom text-center']")
	private WebElement recent;
	
	// Validate Vitality Active rewards on dashboard
	public void ValidateVitalityActiveRewards()
	{	
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(recent, "recent title");
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verifyElement.verifyBrowserElement(VitalityActiveRewardTitle, "Vitaility Active Rewards Title");
		
		JavascriptExecutor executor = (JavascriptExecutor) BrowserDriver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", ProgressColor);    
	    //verifyElement.verifyBrowserElement(ProgressColor, "Progress Color");
	    
		System.out.println("Ring Progress color : " + ProgressColor.getAttribute("style").toString());
		verifyElement.verifyBrowserElement(PointCompleted, "Ring Points Completed :" + PointCompleted.getText());
		verifyElement.verifyBrowserElement(PointsGoal, "Points Goal");
		verifyElement.verifyBrowserElement(PointsGoalNumber, "Points Goal Number: " + PointsGoalNumber.getText());
		verifyElement.verifyBrowserElement(TimeLeft, "Time Left ");
		verifyElement.verifyBrowserElement(VARLink,"Vitality Active Rewards Link");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	//click Vitality active rewards link
	public void ClickVitalityActivaRewards()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		
		JavascriptExecutor executor = (JavascriptExecutor) BrowserDriver;
		executor.executeScript("arguments[0].scrollIntoView(true);", VARLink);
		verifyElement.clickElement(VARLink,"Vitality Active Rewards Link");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	// Validate Vitality Active rewards on dashboard
	public void ValidateVitalityActiveRewardsForNonActiveMember() 
	{
		
	}
	
	
	@FindBy(xpath="//div[@class='managed-content']//h5[@class='flush-bottom text-center']")
	private WebElement Recent;
	
	@FindBy(xpath="//p[@class='text-center flush soft-half-top soft-bottom']//img")
	private WebElement PointsTitle;
	
	@FindBy(xpath="//div[@class='panel panel-nutrition']//div[@class='panel-body']")
	private WebElement StartEarningPointsPanel;
	
	@FindBy(xpath="//h5[@class='soft-half-bottom flush-bottom brand-label']")
	private WebElement StartEarningVitalityPointsTitle;
	
	@FindBy(xpath="//p[@class='flush-top hard-top push-half-bottom soft-sides']//img")
	private WebElement PointTrophy;
	
	@FindBy(xpath="//p[@class='flush-bottom soft-sides']//a")
	private WebElement HowToEarnLink;
	
	@FindBy(xpath="//div[@class='span6 text-right']//a")
	private WebElement ViewMyPointTreckerLink;
	
	@FindBy(xpath="//h5[@class='text-center']")
	private WebElement YouCanActivate;
	
	
	public void ValidateVitalityPaointsAndStatus()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");

		verifyElement.verifyBrowserElement(YouCanActivate,"You can activate Tile");
		verifyElement.verifyBrowserElement(Recent, "Recent Titlle");
		verifyElement.verifyBrowserElement(PointsTitle,"Points Title");
		
		if(verifyElement.verifyBrowserElementValue(StartEarningPointsPanel, "Start earning points") == 0) 
		{
			verifyElement.verifyBrowserElement(StartEarningPointsPanel, "Start Earning Points Panel");
			verifyElement.verifyBrowserElement(StartEarningVitalityPointsTitle, "Start Earning Vitality Points Title");
		}
		
		verifyElement.verifyBrowserElement(PointTrophy,"Point Trophy");
		verifyElement.verifyBrowserElement(HowToEarnLink, "How To Earn Link");
		verifyElement.verifyBrowserElement(ViewMyPointTreckerLink, "View MyPoint Trecker Link");

		verifyElement.switchOutOfBrowserFrame();
	}
	
	/*
	 * Member has done more then 3 point earnings 
	 */
	
	@FindBy(xpath="//body/div[@class='body-wrapper']/div[@id='main-content-structure-row']/div[@id='main-container']/div[@class='row-fluid']/div[@id='standard-member-dashboard']/div[@id='widgets']/div[@class='panel-body']/div[2]/div[1]")
	private WebElement PointSections;
	
	@FindBy(xpath="//a[@id='points_event_1']//span[@class='muted']")
	private WebElement FirstPointDate;
	
	@FindBy(xpath="//a[@id='points_event_2']//span[@class='muted']")
	private WebElement SecondPointsDate;
	

	@FindBy(xpath="//a[@id='points_event_3']//span[@class='muted']")
	private WebElement ThirdPointsDate;
	
	@FindBy(xpath="//div[@class='list-group text-left text-center-mobile']//a[@id='points_event_1']//div[@class='span6']")
	private WebElement FirstEarnedPointName;
	
	@FindBy(xpath="//div[@class='list-group text-left text-center-mobile']//a[@id='points_event_2']//div[@class='span6']")
	private WebElement SecondEarnedPointName;
	
	@FindBy(xpath="//div[@class='list-group text-left text-center-mobile']//a[@id='points_event_3']//div[@class='span6']")
	private WebElement thirdEarnedPointName;
	
	
	@FindBy(xpath = "//div[@class='list-group text-left text-center-mobile']//a[@id='points_event_1']//span[@class='brand-label']")
	private WebElement FirstPointAmount;
	
	
	@FindBy(xpath = "//div[@class='list-group text-left text-center-mobile']//a[@id='points_event_2']//span[@class='brand-label']")
	private WebElement SecondPointAmount;
	
	@FindBy(xpath = "//div[@class='list-group text-left text-center-mobile']//a[@id='points_event_3']//span[@class='brand-label']")
	private WebElement ThirdPointAmount;
	
	@FindBy(xpath = "//div[@id='090040be80644074']//p//a")
	private WebElement HowPointsReflectLink;
	
	@FindBy(xpath = "//div[@class='span6 text-left text-center-mobile']//div")
	private WebElement VitalityStatus;
	
	@FindBy(xpath = "//div[@class='span6 text-left text-center-mobile']//div//span//strong")
	private WebElement StatusValue; 
	
	@FindBy(xpath="//div[@class='container top-level-nav-container']//ul")
	private WebElement TopNav;
	
	public void clickTopNav()
	{
		verifyElement.clickElement(TopNav, "To navigation Clicked");
	}
	
	
	public void validatePointsWithMemberWithPointsEarnings()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		
            verifyElement.verifyBrowserElement(PointSections, "Vitality points section");
        if(verifyElement.verifyBrowserElementValue(FirstPointDate, "First point Date") == 0) {
			verifyElement.verifyBrowserElement(FirstPointDate, "First point Earning Date");
			verifyElement.verifyBrowserElement(SecondPointsDate, "Second point Earning Date");
			verifyElement.verifyBrowserElement(ThirdPointsDate, "Third point Earning Date");
			verifyElement.verifyBrowserElement(FirstEarnedPointName, FirstEarnedPointName.getText());
			verifyElement.verifyBrowserElement(SecondEarnedPointName,SecondEarnedPointName.getText());
			verifyElement.verifyBrowserElement(thirdEarnedPointName, thirdEarnedPointName.getText());
			verifyElement.verifyBrowserElement(FirstPointAmount, "First Point Earning Amount");
			verifyElement.verifyBrowserElement(SecondPointAmount, "Second Earning Point Amount");
			verifyElement.verifyBrowserElement(ThirdPointAmount,"Third Earning Point Amount");
			verifyElement.verifyBrowserElement(HowPointsReflectLink, "How Points Reflect Link");
		}
		verifyElement.verifyBrowserElement(VitalityStatus, "Current Vitality status ");
		verifyElement.verifyBrowserElement(StatusValue, "Status Value " + StatusValue.getText());
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	//-------------------BENEFITS SECTION---------------------------------------------------------
	
	//Health care title
	@FindBy(xpath="//h6[contains(text(),'HealthyCare')]")
	private WebElement HelathCaretitle;
	
	//Click Logo
	@FindBy(xpath="//img[@src='/discovery_coza/web/linked_content/images/vitality/dashboard/clicks_small_logo.png']")
	private WebElement Clicks;
	
	//DisChem logo
	@FindBy(xpath="//img[@src='/discovery_coza/web/linked_content/images/vitality/dashboard/dischem_logo_rewards.png']")
	private WebElement DisChem;
	
	//25% Discount benefit
	@FindBy(xpath="//h1[contains(text(),'25%')]")
	private WebElement ElemPercentage;
	
	//Health care Activate Button
	@FindBy(xpath="//a[contains(text(),'Activate')]")
	private WebElement ActivateButton;
	
	//back on thousands of HealthyCare items
	@FindBy(xpath="//p[contains(text(),'back on thousands of HealthyCare items.')]")
	private WebElement backonthousandsofHealthyCareitems;
	
	//Terms And conditions Heading
	@FindBy(xpath="//h5[contains(text(),'Terms and conditions:')]")
	private WebElement TermsAndConditionsHeading;
	
	@FindBy(xpath="//div[@class='modal hide pre-activation-consent-modal in']//button[@class='btn btn-default deny-consent-button']")
	private WebElement NoOption;
	
	@FindBy(xpath="//div[@class='modal hide pre-activation-consent-modal in']//button[@class='btn btn-primary grant-consent-button']")
	private WebElement YesOption;
	
	public void ClickToScroll() {
		try {Thread.sleep(6000);} catch (InterruptedException e) {e.printStackTrace();}
	    verifyElement.switchToBrowserFrame(vitalityAppFrame, "Page iFrame");
		verifyElement.clickElement(backonthousandsofHealthyCareitems, "back on thousands of Healthy Care items");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void ValidateHealthCareTabOnBenefits() {
		try {Thread.sleep(6000);} catch (InterruptedException e) {e.printStackTrace();}
	    verifyElement.switchToBrowserFrame(vitalityAppFrame, "Page iFrame");
		verifyElement.verifyBrowserElement(HelathCaretitle, "HelathCaretitle");
		verifyElement.verifyBrowserElement(Clicks, "Clicks Logo");
		verifyElement.verifyBrowserElement(DisChem, "DisChem Logo");
		verifyElement.verifyBrowserElement(ElemPercentage, "25 %");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void ClickActivateButton() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Page iFrame");
		while(verifyElement.verifyBrowserElementValue(TermsAndConditionsHeading, "Terms And Conditions Heading") != 0) {
			verifyElement.clickElement(ActivateButton, "ActivateButton");	
		}
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	public void AcceptTermsAndConditions() {
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	    verifyElement.switchToBrowserFrame(vitalityAppFrame, "Page iFrame");
	    verifyElement.verifyBrowserElement(TermsAndConditionsHeading, "Terms And Conditions Heading");
	    verifyElement.verifyBrowserElement(NoOption, "No Option");
	    verifyElement.clickElement(YesOption, "Yes Option");
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	//-------ERROR PAGE-------->

	//Error Main Div
	@FindBy(xpath = "//div[@class='content-main']")
	private WebElement errorMainDiv;
	
	//Background Image
	@FindBy(xpath = "//body/div/div[@id='main-container']/div/div/div/div/div[@id='main-content-structure-row']/div/div/div/div[@id='included_content']/div[@id='090040be802b73e0']/div/div/div[1]")
	private WebElement errorBackgroundImage;

	//Error 500 Box Div
	@FindBy(xpath = "//div[@class='box-content']")
	private WebElement error500BoxDiv;
	
	//Error 500 Title
	@FindBy(xpath = "//div[@id='090040be802b73e0']//div//div//div//div//div//h1")
	private WebElement error500Title;
	
	//Error 500 Text
	@FindBy(xpath = "//div[@id='090040be802b73e0']//div//div//div//div//div//div//p")
	private WebElement error500Text;
	
	//Go Back Home Button
	@FindBy(xpath = "//div[@id='main-content-structure-row']//a[1]")
	private WebElement goBackButton;

	//Contact Us Button
	@FindBy(xpath = "//div[@id='main-content-structure-row']//a[2]")
	private WebElement contactUsButton;
	
	/*---------(U.M)-------*/
	
	@FindBy(xpath = "//div[@id='js-navigation-inner-container']//a[@id='topnav-sl-vitality-device-and-apps']")
	private WebElement lnk_Devices_And_Apps;
	
	public void clickLnk_Devices_And_Apps() {
		if (verifyElement.verifyBrowserElementValue(lnk_Devices_And_Apps, "Devices And Apps Link") == 0) {
				verifyElement.clickElement(lnk_Devices_And_Apps, "Devices And Apps Link");
		} else {
			System.err.println("Devices And Apps Link Couldn't Be Found");
		}
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


	/*----------Verify Main Dashboard------------*/
	public void verifyMainDashboard() {
		verifyElement.verifyBrowserElement(dashboardMainDiv,"Dashboard Main Div");
	}
	
	@FindBy(xpath = "//ul[@class='list-inline list-inline-divided login-navigation d-flex align-items-center']//a[.='Log out']")
	private WebElement btn_Logout;
	
	public void clickBtn_Logout() {
		if (verifyElement.verifyBrowserElementValue(btn_Logout, "Logout Button") == 0) {
			verifyElement.clickElement(btn_Logout, "Logout Button");
		} else {
			System.err.println("Logout Button Couldn't Be Found");
		}
	}
}

