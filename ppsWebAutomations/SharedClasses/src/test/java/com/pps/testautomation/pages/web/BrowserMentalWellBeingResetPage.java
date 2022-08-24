package com.pps.testautomation.pages.web;

import com.pps.testautomation.utilities.ElementFunctionality;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Hajane Poopedi
 *
 *
 */
public class BrowserMentalWellBeingResetPage {
	
	public WebDriver BrowserDriver;
	public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserMentalWellBeingResetPage(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	
	
	//mental well being get started button
	@FindBy(xpath="//a[.='Get started']")
	private WebElement MentalWellBeingGetStarted;
	
	
	//mental well being start assessment button 
	@FindBy(xpath="//a[.='Start assessments']")
	private WebElement MentalWellBeingStartAssessments;
	
	//agree to mental well being tandc button
	//@FindBy(xpath="MentalWellBeingStartAssessments")
	
	
	public void Click_MentalWellBeingGetStarted() {
		verifyElement.clickElement(MentalWellBeingGetStarted, "Get started");
	}
	
	
	public void Click_MentalWellBeingStartAssessments() {
		verifyElement.clickElement(MentalWellBeingStartAssessments, "Start assessments");
	}


}
