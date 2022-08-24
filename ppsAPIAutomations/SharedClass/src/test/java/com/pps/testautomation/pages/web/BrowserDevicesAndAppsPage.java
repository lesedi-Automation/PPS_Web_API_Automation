package com.pps.testautomation.pages.web;

import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class BrowserDevicesAndAppsPage {

	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserDevicesAndAppsPage(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	
	@FindBy(xpath = "//h2[contains(text(),'Devices and apps')]")
	private WebElement h2_DevicesAndApps_Header;
	
	@FindBy(xpath = "//p[contains(.,'Learn more about the devices and apps that you can link to Vitality and earn Vit')]")
	private WebElement p_DevicesAndApps_Header;
	
	@FindBy(xpath = "//h2[contains(text(),'Your linked devices and apps')]")
	private WebElement div_YourLinkedDevicesAndApps;
	
	@FindBy(xpath = "(//p[@class='intro font-weight-light'])[2]")
	private WebElement p1_YourLinkedDevicesAndApps;
	
	@FindBy(xpath = "(//div[@class='row justify-content-center test-center'])")
	private WebElement p2_YourLinkedDevicesAndApps;
	
	@FindBy(xpath = "//h2[contains(text(),'Why do you need devices and apps')]")
	private WebElement div_WhyDoYouNeedDevicesAndApps;
	
	@FindBy(xpath = "//p[contains(text(),'You can earn Vitality points and rewards when you ')]")
	private WebElement p1_WhyDoYouNeedDevicesAndApps;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[21]/div[1]/p[2]")
	private WebElement p2_WhyDoYouNeedDevicesAndApps;
	
	@FindBy(xpath = "(//div[@class='row text-center justify-content-center mb-2'])[1]")
	private WebElement p3_WhyDoYouNeedDevicesAndApps;
	
	@FindBy(xpath = "//h2[contains(text(),'Vitality devices and apps')]")
	private WebElement div_VitalityDevicesAndApps;
	
	@FindBy(xpath = "//p[contains(text(),'Install any of the below Vitality appointed apps a')]")
	private WebElement p1_VitalityDevicesAndApps;
	
	@FindBy(xpath = "(//div[@class='row text-center justify-content-center mb-2'])[2]")
	private WebElement p2_VitalityDevicesAndApps;
	
	@FindBy(xpath = "(//div[@class='row justify-content-left text-center'])")
	private WebElement p3_VitalityDevicesAndApps;
	
	@FindBy(xpath = "(//div[@class='row text-center justify-content-center my-2'])")
	private WebElement p4_VitalityDevicesAndApps;
	
	@FindBy(xpath = "(//div[@class='row justify-content-left text-center'])")
	private WebElement p5_VitalityDevicesAndApps;
	
	@FindBy(xpath = "(//div[@class='row justify-content-center text-center pt-2'])")
	private WebElement appleWatchSection;
	
	@FindBy(xpath = "//div[@class='row justify-content-center text-center']")
	private WebElement div_Devices_Collection;
	
	@FindBy(xpath = "//div[@class='row text-center justify-content-center my-2']/div[@class='col-12']")
	private WebElement div_Apps;
	
	@FindBy(xpath = "//*[@id='appIFrameObj']")
	private WebElement appFrame;
	
	@FindBy(xpath = "//a[@data-gtm-click='device_apps_landing_page_zwift-app9']")
	private WebElement zwiftLearnMoreLink;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[20]/div[1]/div[2]/div[11]/div[1]/div[1]/div[1]/div[1]/img[1]")
	private WebElement zwiftImage;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[20]/div[1]/div[2]/div[11]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]")
	private WebElement zwiftActiveStatus;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[20]/div[1]/div[2]/div[11]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/img[1]")
	private WebElement heartImage;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[20]/div[1]/div[2]/div[11]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement runningImage;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[20]/div[1]/div[2]/div[11]/div[1]/div[1]/div[2]/div[1]/p[1]")
	private WebElement lastSyncStatus;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[20]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/a[1]")
	private WebElement deviceInfoLink;
	
	@FindBy(xpath = "//a[@id='delink_Zwift']")
	private WebElement deLinkButton;
	
	@FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[19]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/a[1]")
	private WebElement deLinkButton2;
	
	public void click_DeLinkZwiftAccountButton()
	{	
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
		verifyElement.clickElement(deLinkButton, "deLink Button");
		try
		{
			Thread.sleep(1500);
		}
		catch(Exception e)
		{
			
		}
		verifyElement.clickElement(deLinkButton2, "deLink Button2");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	public void validateLinkedZwiftAccount()
	{
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
		
		JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
		js.executeScript("arguments[0].scrollIntoView();", zwiftImage);
		verifyElement.verifyBrowserElement(zwiftImage, "zwift Image");
		verifyElement.verifyBrowserElement(zwiftActiveStatus, "zwift Active Status");
		verifyElement.verifyBrowserElement(heartImage, "heart Image");
		verifyElement.verifyBrowserElement(runningImage, "running Image");
		verifyElement.verifyBrowserElement(lastSyncStatus, "last Sync Status");
		verifyElement.verifyBrowserElement(deLinkButton, "deLink Button");
		verifyElement.verifyBrowserElement(deviceInfoLink, "device Info Link");
		
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	public void verifyDevicesAndAppsPage() 
	{
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
		try{Thread.sleep(1000);}catch(Exception e){}
		JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
		js.executeScript("arguments[0].scrollIntoView();", h2_DevicesAndApps_Header);
		verifyElement.verifyBrowserElement(h2_DevicesAndApps_Header, "Devices And Header ");
		verifyElement.verifyBrowserElement(p_DevicesAndApps_Header, "Devices And Apps Header Paragraph");
		
		verifyElement.verifyBrowserElement(div_WhyDoYouNeedDevicesAndApps, "Why Do You Need Devices And Apps Heading");
		verifyElement.verifyBrowserElement(p1_WhyDoYouNeedDevicesAndApps, "Why Do You Need Devices And Apps header paragraph");
		verifyElement.verifyBrowserElement(p2_WhyDoYouNeedDevicesAndApps, "Why Do You Need Devices And Apps subheader paragraph");
		try{Thread.sleep(1000);}catch(Exception e){}
		verifyElement.verifyBrowserElement(p3_WhyDoYouNeedDevicesAndApps, "Why Do You Need Devices And Apps images");

		js.executeScript("arguments[0].scrollIntoView();", div_VitalityDevicesAndApps);
		verifyElement.verifyBrowserElement(div_VitalityDevicesAndApps, "Vitality Devices And Apps Heading");
		verifyElement.verifyBrowserElement(p1_VitalityDevicesAndApps, "Vitality Devices And Apps Sub Heading");
		verifyElement.verifyBrowserElement(p2_VitalityDevicesAndApps, "Vitality Devices And Apps Device's Body");
		
		verifyElement.verifyBrowserElement(p3_VitalityDevicesAndApps, "Vitality Devices And Apps Device's Images");
		verifyElement.verifyBrowserElement(p4_VitalityDevicesAndApps, "Vitality Devices And Apps Apps's Body");
		
		js.executeScript("arguments[0].scrollIntoView();", p5_VitalityDevicesAndApps);
		verifyElement.verifyBrowserElement(p5_VitalityDevicesAndApps, "Vitality Devices And Apps App's Images");

		js.executeScript("arguments[0].scrollIntoView();", appleWatchSection);
		verifyElement.verifyBrowserElement(appleWatchSection, "Get Apple Watch, Get Rewarded, Get Active Section");
		
		if (verifyElement.verifyBrowserElementValue(div_YourLinkedDevicesAndApps, "div_YourLinkedDevicesAndApps") == 0) 
		{
			js.executeScript("arguments[0].scrollIntoView();", div_YourLinkedDevicesAndApps);
			verifyElement.verifyBrowserElement(div_YourLinkedDevicesAndApps, "Your Linked devices Heading");
			verifyElement.verifyBrowserElement(p1_YourLinkedDevicesAndApps, "Your Linked devices Header paragraph");
			verifyElement.verifyBrowserElement(p2_YourLinkedDevicesAndApps, "Your Linked devices TechnoGym block");
			
		} 
		else 
		{
			System.err.println("Your linked Device's section couldn't be found");
		}
		
		verifyElement.switchOutOfBrowserFrame();
	}
	
	// Dynamically clicks the learn more link of the selected device
	public void clickDevice_LearnMoreLink(String deviceName) {
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
		WebElement lnk_Device_LearnMore = BrowserDriver.findElement(By.xpath("//div[@class='row justify-content-center text-center']/div/div/div/div[2]/a[@href=/vitality/"+deviceName+"]"));
		if (verifyElement.verifyBrowserElementValue(lnk_Device_LearnMore, "Device Learn More Link") == 0) {
			verifyElement.clickElement(lnk_Device_LearnMore, "Device Learn More Link");
		} else {
			System.err.println("Device Learn More Link Couldn't Be Found");
		}
	}
	
	public void clickZwiftLearnMoreLink()
	{
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
		
		JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
		js.executeScript("arguments[0].scrollIntoView();", zwiftLearnMoreLink);
		js.executeScript("arguments[0].click();", zwiftLearnMoreLink);

		verifyElement.switchOutOfBrowserFrame();
		
		BrowserDriver.manage().window().maximize();
		ArrayList tabs = new ArrayList<>();
		//tabs.add(0, BrowserDriver.getWindowHandle());
		tabs.addAll(BrowserDriver.getWindowHandles());
		waitTime(1000);	
		BrowserDriver.switchTo().window(tabs.get(tabs.size()-2)+"");
		
		System.out.println("Switched to child window");
	}
	
	@FindBy(xpath = "//html/body/div[12]/div/div/div[38]/div[4]/div/div[2]/div[2]/a")
	private WebElement lnk_Fitbit_LearnMore;
	
	public void clickLnk_Fitbit_LearnMore() {
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
//		verifyElement.switchToBrowserFrame(inner, "App Frame");
		waitTime(2000);
		if (verifyElement.verifyBrowserElementValue(lnk_Fitbit_LearnMore, "Fitbit Learn More Link") == 0) {
			waitTime(2000);
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].scrollIntoView();", lnk_Fitbit_LearnMore);
			js.executeScript("arguments[0].click();", lnk_Fitbit_LearnMore);
//			verifyElement.clickElement(lnk_Fitbit_LearnMore, "Fitbit Learn More Link");
		} else {
			System.err.println("Fitbit Learn More Link Couldn't Be Found");
		}
		verifyElement.switchOutOfBrowserFrame();
	}

	private void waitTime(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
