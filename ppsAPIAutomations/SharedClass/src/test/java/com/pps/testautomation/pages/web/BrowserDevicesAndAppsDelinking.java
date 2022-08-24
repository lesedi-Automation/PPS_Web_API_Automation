package com.pps.testautomation.pages.web;

import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserDevicesAndAppsDelinking {
	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserDevicesAndAppsDelinking(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	
	//Vitality App Frame
	@FindBy(xpath="//iframe[@id='appIFrameObj']")
	private WebElement vitalityAppFrame;
	
	//Linked Devices container
	@FindBy(xpath="//div[@class='row text-center justify-content-center']")
	private WebElement LinkedDeviceContainer;
	
	//Earn Points Headig
	@FindBy(xpath="//*[@id='090040be8074f6dd']/div/div/div[1]/div/h2")
	private WebElement EarnPointsHeading; 
	
	//FitBit Delink Link
	@FindBy(xpath="//a[@id='delink_Fitbit']")
	private WebElement FitBitDelink;
	
	//FitBit Delink Confirm
	@FindBy(xpath="//div[@id='fitbit']//a[@class='btn btn-action btn-block'][contains(text(),'De-Link')]")
	private WebElement FitBitConfirm;
	
	
	//Polar Delink Link
	@FindBy(xpath="//a[@id='delink_Polar']")
	private WebElement PolarDelink;
	
	//Polar Delink Confirm
	@FindBy(xpath="//div[@id='polar_device']//button[@class='btn btn-action btn-block'][contains(text(),'De-Link')]")
	private WebElement PolarConfirm;
	
	//Sunnto Delink
	@FindBy(xpath="//a[@id='delink_Suunto']")
	private WebElement SunntoDelink;
	
	//Sunnto Delink Confirm
	@FindBy(xpath="//div[@id='suunto']//button[@class='btn btn-action btn-block'][contains(text(),'De-Link')]")
	private WebElement SunntoConfirm;
	
	//Withings Delinking
	@FindBy(xpath="//a[@id='delink_Withings']")
	private WebElement WithingsDelinking;
	
	//Wiithings Delink Confirm
	@FindBy(xpath="//div[@id='withings']//button[@class='btn btn-action btn-block'][contains(text(),'De-Link')]")
	private WebElement WithingsConfirm;
	
	//Garmin Delinking 
	@FindBy(xpath="//a[@id='delink_GarminDevice']")
	private WebElement GarminDelinking;
	
	//Garmin Delink Confirm
	@FindBy(xpath="//*[@id='Garmin_device']/div/div/div[3]/div/div/span/a")
	private WebElement GarminConfirm;
	
	//Technogym Delinking
	@FindBy(xpath="//a[@id='delink_TechnogymDevice']")
	private WebElement TechNogymDelink;
	
	//Technogym Delink Confirm
	@FindBy(xpath="//*[@id='Technogym_device']/div/div/div[3]/div/div/span/a")
	private WebElement TechnogymConfirm;
	
	//Huawei Delinking
	@FindBy(xpath="//a[@id='delink_HuaweiDevice']")
	private WebElement HuaweiDelinkings;
	
	//Huawei Delink Confirm
	@FindBy(xpath="//div[@id='huawei_device']//a[@class='btn btn-action btn-block'][contains(text(),'De-Link')]")
	private WebElement HuaweiConfirm;
	
	
	//Validate Available linked Devices
	public void ValidateLinkedDevices()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(EarnPointsHeading, "Earn Points Headig") == 0)
		{
			verifyElement.clickElement(EarnPointsHeading, "Earn Points Headig");
		} else {
			System.err.println("Earn Points Headig Couldn't Be Found");
		}
		if(verifyElement.verifyBrowserElementValue(LinkedDeviceContainer, "Linked Device Container") == 0)
		{
			verifyElement.verifyBrowserElement(LinkedDeviceContainer, "Linked Device Container, THERE ARE DEVICES LINKED");
		}
		else
		{
			System.out.println("Linked Device Container is not available, there might be no devices Linked");
		}
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Delink FitBit
	public void DelinkFitBit()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(FitBitDelink, "Fit Bit Delink Link") == 0)
		{
//			verifyElement.verifyBrowserElement(FitBitDelink, "Fit Bit Delink Link");
//			verifyElement.clickElement(FitBitDelink, "Fit Bit Delink Link");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].click();", FitBitDelink);
			verifyElement.clickElement(FitBitConfirm, "FitBit Delink Confirm");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, FitBit App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	//Delink Polar
	public void DelinkPolar()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(PolarDelink, "Polar Delink Link") == 0)
		{
//			verifyElement.verifyBrowserElement(PolarDelink, "Fit Bit Delink Link");
//			verifyElement.clickElement(PolarDelink, "Fit Bit Delink Link");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].click();", PolarDelink);
			verifyElement.clickElement(PolarConfirm, "Polar Delink Confirm");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Polar App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	//Delink Sunnto
	public void DelinkSunnto()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(SunntoDelink, "Sunnto Delink Link") == 0)
		{
//			verifyElement.verifyBrowserElement(SunntoDelink, "Sunnto Delink Link");
//			verifyElement.clickElement(SunntoDelink, "Sunnto Delink Link");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].click();", PolarDelink);
			verifyElement.clickElement(SunntoConfirm, "Sunnto Delink Confirm");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Sunnto App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	//Withings Delinking
	public void WithingsDelinking()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(WithingsDelinking, "Withings Delinking Link") == 0)
		{
//			verifyElement.verifyBrowserElement(WithingsDelinking, "Withings Delinking Link");
//			verifyElement.clickElement(WithingsDelinking, "Withings Delinking Link");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].click();", WithingsConfirm);
			verifyElement.clickElement(WithingsConfirm, "Withings Delink Confirm");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Withings App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	//Garmin Delinking
	public void GarminDelinking()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(GarminDelinking, "Garmin Delinking Link") == 0)
		{
//			verifyElement.verifyBrowserElement(GarminDelinking, "Garmin Delinking Link");
//			verifyElement.clickElement(GarminDelinking, "Garmin Delinking Link");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].click();", GarminDelinking);
			verifyElement.clickElement(GarminConfirm, "Garmin Delink Confirm");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Garmin App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	//TechNogym Delink
	public void TechNogymDelink()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(TechNogymDelink, "TechNogym Delink Link") == 0)
		{
//			verifyElement.verifyBrowserElement(TechNogymDelink, "TechNogym Delink Link");
//			verifyElement.clickElement(TechNogymDelink, "TechNogym Delink Link");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].click();", TechNogymDelink);
			verifyElement.clickElement(TechnogymConfirm, "Technogym Delink Confirm");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, TechNogym App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	//Huawei Delinkings
	public void HuaweiDelinking()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(HuaweiDelinkings, "Huawei Delinking Link") == 0)
		{
//			verifyElement.verifyBrowserElement(HuaweiDelinkings, "Huawei Delinking Link");
//			verifyElement.clickElement(HuaweiDelinkings, "Huawei Delinking Link");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].click();", HuaweiConfirm);
			verifyElement.clickElement(HuaweiConfirm,"Huawei Confirm");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Huawei App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	
	
	
	
	
	/*
	 * ***************************VALIDATE lINKED DEVICES **************************************
	 */
	
	
	
	//Validate linked FitBit
	public void LinkedFitBit()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(FitBitDelink, "Fit Bit Delink Link") == 0)
		{
			verifyElement.verifyBrowserElement(FitBitDelink, "Fit Bit Delink Link");
			System.out.println("FITBIT APP IS LINKED");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, FITBIT APP MIGHT NOT BE LINKED");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	//linked Polar
	public void LinkedPolar()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(PolarDelink, "Polar Delink Link") == 0)
		{
			verifyElement.verifyBrowserElement(PolarDelink, "Fit Bit Delink Link");
			System.out.println("POLAR APP IS LINKED");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Polar App MIGHT NOT BE LINKED");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	//Linked Sunnto
	public void LinkedSunnto()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(SunntoDelink, "Sunnto Delink Link") == 0)
		{
			verifyElement.verifyBrowserElement(SunntoDelink, "Sunnto Delink Link");
			System.out.println("SUNNTO APP IS LINKED");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Sunnto MIGHT NOT BE LIKED");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	//Withings Linked
	public void WithingsLinked()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(WithingsDelinking, "Withings Delinking Link") == 0)
		{
			verifyElement.verifyBrowserElement(WithingsDelinking, "Withings Delinking Link");
			System.out.println("Withings APP IS LINKED");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Withings APP MIGHT NOT BE LINKED");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	//Garmin Linked
	public void GarminLinked()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(GarminDelinking, "Garmin Delinking Link") == 0)
		{
			verifyElement.verifyBrowserElement(GarminDelinking, "Garmin Delinking Link");
			System.out.println("Garmin APP IS LINKED");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Garmin App might not be linked");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	
	//TechNogym Linked
	public void TechNogymLinked()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(TechNogymDelink, "TechNogym Delink Link") == 0)
		{
			verifyElement.verifyBrowserElement(TechNogymDelink, "TechNogym Delink Link");
			System.out.println("TechNogym APP IS LINKED");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, TechNogym App MIGHT NOT BE LINKED");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
	
	
	//Huawei Linked
	public void HuaweiLinked()
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality App Frame");
		if(verifyElement.verifyBrowserElementValue(HuaweiDelinkings, "Huawei Delinking Link") == 0)
		{
			verifyElement.verifyBrowserElement(HuaweiDelinkings, "Huawei Delinking Link");
			System.out.println("Huawei App IS LINKED");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The delink link is not available, Huawei APP MIGHT NOT BE LINKED");
		}
	    verifyElement.switchOutOfBrowserFrame();
	}
}
