/**
 * 
 */
package com.pps.testautomation.pages.web;


import com.relevantcodes.extentreports.LogStatus;
import com.pps.testautomation.extentReports.ExtentTestManager;
import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Aneshen Govender
 *
 */
public class BrowserDashboardFitness 
{
	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserDashboardFitness(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
		    
	}
	
	//////////Iframes and Page Header Title
	//Vitality Status Frame
		@FindBy(xpath="//iframe[@id='vitalityStatusIframe']")
		private WebElement vitalityStatusFrame;
		
		//Vitality App Frame
		@FindBy(xpath="//iframe[@id='appIFrameObj']")
		private WebElement vitalityAppFrame;
		
		//Vitality Title
		@FindBy(xpath="//h1[contains(text(),'Vitality Dashboard')]")
		private WebElement vitalityDashBoardTitle;
	
	
	/**********************************1.23 Fitness Partner Block Virgin Active***************************************************/
	//Step 1 Navigate to PHP page Test link https://newtestwww.discsrv.co.za/ Vitality->Dashboard
	//Step 2 Fitness Block Should be displayed
	@FindBy(xpath="//div[@class='vertical-divider no-border']//div[@class='span12']")
	private WebElement vitalityFitnessBlock;
	
	//Fitness block should be displayed
	public void verifyVirginActiveFitnessBlockIsDisplayed() {
		try {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(vitalityFitnessBlock, "vitality Fitness Block");
		verifyElement.switchOutOfBrowserFrame();
		}
		catch(Exception e)
		{
			System.err.println("Virgin Active Fitness Block Is Not Displayed");
		}
	}
	
	//"Your" should be displaying in grey
	@FindBy(xpath="//div[@id='090040be80682a73']//img")
	private WebElement vitalityFitnessYourText;
	
	//"Fitness" should be in multicolour typography
	@FindBy(xpath="//div[@id='090040be80682a73']//img")
	private WebElement vitalityFitnessTitle;
	
	//Step 3 Verify Fitness Block Heading
	public void verifyVirginActiveFitnessBlockHeading() {
		try {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(vitalityFitnessYourText, "vitality Fitness Your Text");
		verifyElement.verifyBrowserElement(vitalityFitnessTitle, "vitality Fitness Title");
		verifyElement.switchOutOfBrowserFrame();
		}
		catch(Exception e)
		{
			System.err.println("Virgin Active Fitness Block Heading Is Not Displayed");
		}
	}
	
	//The Gym Section should contain Subheading "Your fitness benefit"
	//This should be displayed in grey font with a grey dumbbell icon to the left of it.
	//1. Your Fitness benefit
	@FindBy(xpath="//div[@id='090040be8042d01e']//div[@class='media']")
	private WebElement vitalityFitnessYourFitnessBenefit;
	
	//2. Virgin Active Logo
	@FindBy(xpath="//img[@class='img-center-mobile']")
	private WebElement vitalityFitnessVirginActiveLogo;
	
	//3. You�ve visited the gym XX times between YYYYMM-DD and YYYY-MM-DD.
	@FindBy(xpath="//div[@class='row-fluid clearfix equalizeContentParent']//p[2]")
	private WebElement vitalityFitnessDateGymVisited;
	
	//4. The no. of Gym visists is as expected displaying in Red (5b)
	@FindBy(xpath="//h1[@class='text-center-mobile large virgin-active-brand push-half-bottom']")
	private WebElement vitalityFitnessNumberOfGymVisits;
	
	//5 Remember: Always visit the gym 36 times in a rolling 12-month period for the maximum saving."
	//rolling 12-month period for the maximum saving.a. 
	@FindBy(xpath="//p[@class='text-left']")
	private WebElement vitalityFitnessRememberText;
	
	//5 a The above wording must be displayed in a blue information alert block
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement vitalityFitnessRememberBlock;
	
	//5 c The words "visit the gym 36 times in a rolling 12-month period" must be hyperlinked.
	@FindBy(xpath="//a[contains(text(),'visit the gym 36 times in a rolling 12-month perio')]")
	private WebElement vitalityFitnessRememberHyperLink;
	
	//6 A horizontal divider line should be underneath the blue alert block
	@FindBy(xpath="//div[@class='vertical-divider no-border']//hr")
	private WebElement vitalityFitnessBlueHorizonalLine;
	
	//Step 4 Validate gym visit content
	public void ValidateVirginActiveGymVisitContent() {
		try {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(vitalityFitnessYourFitnessBenefit, "vitality Fitness Your Fitness Benefit");
		verifyElement.verifyBrowserElement(vitalityFitnessVirginActiveLogo, "vitality Fitness Virgin Active Logo");
		verifyElement.verifyBrowserElement(vitalityFitnessDateGymVisited, "vitality Fitness Date Gym Visited");
		verifyElement.verifyBrowserElement(vitalityFitnessNumberOfGymVisits, "vitality Fitness Number Of Gym Visits");
		verifyElement.verifyBrowserElement(vitalityFitnessRememberText, "vitality Fitness Remember Text");
		verifyElement.verifyBrowserElement(vitalityFitnessRememberBlock, "vitality Fitness Remember Block");
		verifyElement.verifyBrowserElement(vitalityFitnessRememberHyperLink, "vitality Fitness Remembe rHyper Link");
		verifyElement.verifyBrowserElement(vitalityFitnessBlueHorizonalLine, "vitality Fitness Blue Horizonal Line");
		verifyElement.switchOutOfBrowserFrame();
		}
		catch(Exception e){
			System.err.println("Virgin Active Fitness Gym Visit Content does not display");
		}
	}
	
	//Step 5 Click on "visit the gym 36 times in a rolling 12-month period"
	public void clickVitalityFitnessRememberHyperLink() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.clickElement(vitalityFitnessRememberHyperLink, "visit the gym 36 times in a rolling 12-month period");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Story 2: Gym Benefits Activations
	

	/**********************************1.23 Fitness Partner Block Virgin Active End***************************************************/
	
	/**********************************1.26 Fitness Partner Block Planet Fitness***************************************************/
	//Step 1 Navigate to PHP page Test link https://newtestwww.discsrv.co.za/ Vitality->Dashboard
	//The Running man does not Appear on this page. this is a defect.
	
	//Fitness Block should be displayed
	@FindBy(xpath="//div[@class='vertical-divider no-border']")
	private WebElement vitalityPlanetFitnessBlock;
	
	//Step 2 Verify Fitness block is displayed
	public void verifyFitnessBlockIsDisplayed() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		verifyElement.verifyBrowserElement(vitalityPlanetFitnessBlock, "vitality Planet Fitness Block");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//"Your" should be display in a grey standard font
	@FindBy(xpath="//div[@id='090040be80682a73']//h5[@class='flush-bottom text-left'][contains(text(),'Your')]")
	private WebElement vitalityPlanetFitnessYour;
	
	//"Fitness" should be in multicolour typography
	@FindBy(xpath="//div[@id='090040be80682a73']//img")
	private WebElement vitalityFitnessColourText;
	
	//Step 3 Verify Fitness block heading
	public void verifyFitnessBlockHeading() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(vitalityPlanetFitnessYour, "vitality Planet Fitness 'Your'");
		verifyElement.verifyBrowserElement(vitalityFitnessColourText, "vitality Fitness Colour Text");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Subheading "Your Fitness Benefit". SHould be grey font with dumbell icon to the left of it
	@FindBy(xpath="//div[@id='090040be8042d01e']//h6[1]")
	private WebElement vitalityPlanetFitnessYourFitness;
	
	//Planet Fitness Logo
	@FindBy(xpath="//img[@class='img-center-mobile']")
	private WebElement vitalityPlanetFitnessLogo;
	
	//You've visited the gym XX times between YYY-MM-DD and YYY-MM-DD
	@FindBy(xpath="//div[@class='span9 text-center-mobile']")
	private WebElement vitalityPlanetFitnessGymVisitText;
	
	//The no. Of Gym Visits is as expected and in blue
	@FindBy(xpath="//h1[@class='large planet-fitness-brand push-half-bottom']")
	private WebElement vitalityPlanetFitnessGymVisitsNumber;
	
	//Remember: Always visit the gym 36 times in a rolling 12-month period for the maximum saving."
	@FindBy(xpath="//body//div[@class='panel-section-gray']//div[@class='row-fluid']//div[@class='row-fluid']//p[1]")
	private WebElement vitalityPlanetFitnessRememberText;
	
	//Remember Text must display in a blue information alert block
	@FindBy(xpath="//div[@id='090040be8064401a']//div[@class='alert alert-info']")
	private WebElement vitalityPlanetFitnessRememberBlock;
	
	//The words "visit the gym 36 times in a rolling 12- month period" must be hyperlinked.
	//This is a defect, there is no hyperlink.
	
	//A horizontal divider line should be underneath the blue alert block
	@FindBy(xpath="//div[@class='vertical-divider no-border']//hr")
	private WebElement vitalityPlanetFitnessHorizontalDivider;
	
	//Step 4 Validate Gym Visit Content
	public void validateGymVisitContent() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		if(verifyElement.verifyBrowserElementValue(vitalityPlanetFitnessLogo, "vitality Planet Fitness Logo") == 0 ) {
			verifyElement.verifyBrowserElement(vitalityPlanetFitnessYourFitness, "vitality Planet Fitness Your Fitness");
			verifyElement.verifyBrowserElement(vitalityPlanetFitnessLogo, "vitality Planet Fitness Logo");
			verifyElement.verifyBrowserElement(vitalityPlanetFitnessGymVisitText, "vitality Planet Fitness Gym Visit Text");
			verifyElement.verifyBrowserElement(vitalityPlanetFitnessGymVisitsNumber, "vitality Planet Fitness Gym Visits Number");
			verifyElement.verifyBrowserElement(vitalityPlanetFitnessRememberText, "vitality Planet Fitness Remember Text");
			verifyElement.verifyBrowserElement(vitalityPlanetFitnessRememberBlock, "vitality Planet Fitness Remember Block");
			verifyElement.verifyBrowserElement(vitalityPlanetFitnessHorizontalDivider, "vitality Planet Fitness Horizontal Divider");
		}else{
			System.out.println("Cannot find the Planet fitness elements");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Cannot find the Planet fitness elements");
		}
		
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Gym Tracker 
	@FindBy(xpath="//a[@class='btn btn-primary btn-block-phone']")
	private WebElement vitalityPlanetFitnessGymTrackerButton;
	
	//Step 5 Click on Gym tracker
	public void clickGymTracker() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(vitalityPlanetFitnessGymTrackerButton, "vitality Planet Fitness Gym Tracker Button");
		verifyElement.clickElement(vitalityPlanetFitnessGymTrackerButton, "vitality Planet Fitness Gym Tracker Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	/**********************************1.26 Fitness Partner Block Planet Fitness End***************************************************/
	
	/**********************************1.25 Fitness Partner block No Gym***************************************************/
	//Step 1. Navigate to PHP pageTest link https://newtestwww.discsrv.co.za/Vitality->Dashboard
	//Fitness block should be displayed
	@FindBy(xpath="//div[@id='090040be80682a73']")
	private WebElement vitalityNoGymFitnessBlock;
	
	//Step 2. Verify Fitness block is displayed
	public void verifyFitnessNoGymBlockIsDisplayed() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		if(verifyElement.verifyBrowserElementValue(vitalityNoGymFitnessBlock, "vitality No Gym Fitness Block") == 0) {
			verifyElement.verifyBrowserElement(vitalityNoGymFitnessBlock, "vitality No Gym Fitness Block");
		}else {
			ExtentTestManager.getTest().log(LogStatus.FAIL, " vitality No Gym Fitness Block could not be hovered on ");
		}
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Your Fitness should be the heading
	//"Your"
	@FindBy(xpath="//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/img[1]")
	private WebElement fitnessTitle;
	
	@FindBy(xpath="//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h6[1]")
	private WebElement fitnessSubTitle;
	
	@FindBy(xpath="//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]")
	private WebElement pointsStatusSubBlock;
	
	@FindBy(xpath="//a[contains(text(),'Vitality Active Rewards')]")
	private WebElement vitalityActiveRewardsLink;
	
	@FindBy(xpath="//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/h6[1]")
	private WebElement yourFitnessLevelText;
	
	@FindBy(xpath="//body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/span[1]")
	private WebElement yourFitnessLevelSubText;
	
	@FindBy(xpath="//body/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/span[1]/img[1]")
	private WebElement yourFitnessLevelImage;
	
	@FindBy(xpath="//a[contains(text(),'Take your fitness further')]")
	private WebElement takeYourFitnessFurtherLink;
	
	@FindBy(xpath="//h5[@class='flush-bottom text-left']")
	private WebElement vitalityNoGymYourText;
	//"Fitness"
	@FindBy(xpath="//h1[@class='text-left']//img")
	private WebElement vitalityNoGymFitness;
	
	//Step 3. Verify Fitness block Heading
	public void verifyFitnessBlockElements() 
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(fitnessTitle, "fitness Title");
		verifyElement.verifyBrowserElement(fitnessSubTitle, "fitness Sub Title");
		verifyElement.verifyBrowserElement(pointsStatusSubBlock, "points Status Sub Block");
		verifyElement.verifyBrowserElement(vitalityActiveRewardsLink, "vitality Active Rewards Link");
		verifyElement.verifyBrowserElement(yourFitnessLevelText, "your Fitness Level Text");
		verifyElement.verifyBrowserElement(yourFitnessLevelSubText, "your Fitness Level Sub Text");
		verifyElement.verifyBrowserElement(yourFitnessLevelImage, "your Fitness Level Image");
		verifyElement.verifyBrowserElement(takeYourFitnessFurtherLink, "take Your Fitness Further Link");
		
		verifyElement.switchOutOfBrowserFrame();
	}
		
	//Step 3. Verify Fitness block Heading
	public void verifyNoGymFitnessBlockHeading() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
		verifyElement.verifyBrowserElement(vitalityNoGymYourText, "vitality No Gym Your Text");
		verifyElement.verifyBrowserElement(vitalityNoGymFitness, "vitality No Gym Fitness");
		verifyElement.switchOutOfBrowserFrame();
	}
	//Subheading "Your Fitness Benefit". This should be displayed in grey font with a grey dumbell icon to the left of iy
	// This is a defect, the Subheading does not appear
	
	/**********************************1.25 Fitness Partner block No Gym End***************************************************/
	/**********************************1.25 Fitness Partner block ParkRun******************************************************/
	//Step 1 Navigate to PHP page Test link https://newtestwww.discsrv.co.za/ Vitality->Dashboard
		//The Running man does not Appear on this page. this is a defect.
		
		//ParkRun Block should be displayed
		@FindBy(xpath="//body/div[@class='body-wrapper']/div[@id='main-content-structure-row']/div[@id='main-container']/div[@class='row-fluid']/div[@id='standard-member-dashboard']/div[@id='widgets']/div[@class='panel-section-gray']/div[@class='panel-body']/div[@class='row-fluid clearfix equalizeContentParent']/div[@class='span12 clearfix']/div[@class='vertical-divider no-border']/div[@class='equalizeContent']/div[@class='row-fluid']/div[1]")
		private WebElement vitalityParkRunBlock;
		
		//Step 2 Verify ParkRun block is displayed
		public void verifyParkRunIsDisplayed() {
			verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
			verifyElement.verifyBrowserElement(vitalityParkRunBlock, "vitality ParkRun Block");
			verifyElement.switchOutOfBrowserFrame();
		}
		
		//"Your" should be display in a grey standard font
		@FindBy(xpath="//h5[@class='flush-bottom text-left']")
		private WebElement vitalityParkRunYour;
		
		//"Fitness" should be in multicolour typography
		@FindBy(xpath="//h1[@class='text-left']//img")
		private WebElement vitalityParkRunFitnessColourText;
		
		//Subheading "Your Fitness Benefit". SHould be grey font with dumbell icon to the left of it
		@FindBy(xpath="//div[@id='090040be8042d01e']//h6[1]")
		private WebElement vitalityParkRunYourFitness;
		
		//Step 3 Verify ParkRun block heading
		public void verifyParkRunBlockHeading() {
			verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
			verifyElement.verifyBrowserElement(vitalityParkRunYour, "vitality ParkRun 'Your'");
			verifyElement.verifyBrowserElement(vitalityParkRunFitnessColourText, "vitality ParkRun Fitness Colour Text");
			verifyElement.verifyBrowserElement(vitalityParkRunYourFitness, "vitality ParkRun Your Fitness text with dumbell");
			verifyElement.switchOutOfBrowserFrame();
		}
		
		
		//Planet ParkRun Logo
		@FindBy(xpath="//img[@class='img-center-mobile']")
		private WebElement vitalityParkRunLogo;
		
		//You've visited the gym XX times between YYY-MM-DD and YYY-MM-DD
		@FindBy(xpath="//p[@class='flush-bottom']")
		private WebElement vitalityParkRunGymVisitText;
		
	
		
		//Step 4 Validate ParkRun Content
		public void validateParkRunContent() {
			verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality Page frame");
			verifyElement.verifyBrowserElement(vitalityParkRunLogo, "vitality ParkRun Logo");
			verifyElement.verifyBrowserElement(vitalityParkRunGymVisitText, "vitality ParkRun Gym Visit Text");
		}
		
		
	
	/**********************************1.25 Fitness Partner block ParkRun End******************************************************/

	
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

