package com.pps.testautomation.pages.web;

import com.pps.testautomation.utilities.ElementFunctionality;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserDevicesPage {

	public WebDriver BrowserDriver;
	public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserDevicesPage(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	
	@FindBy(xpath = "//div[@class='col-md-10']/h2[contains(.,'Get started with')]")
	private WebElement h2_DeviceGetStarted; 	// Device Get started header
	
	@FindBy(xpath = "//div[@class='col-md-10']/p")
	private WebElement p_DeviceGetStarted; // Device Get started paragrpah
	
	@FindBy(xpath = "//button[@class='btn btn-action btn-block']")
	private WebElement btn_LinkDevice; 	// Dynamically links the selected device (e.g. 'LINK MY FITBIT ACCOUNT' is the name given to the button because 'Fitbit' device is selected)
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-lg']//div[@class='modal-body']/div[@class='container-fluid']")
	private WebElement popup_DevicePermissions_And_HonestyPledge;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-lg']/div[@class='modal-content']/div[@class='modal-footer no-border' ]/div[@class='container-fluid text-center']/a")
	private WebElement btn_I_Accept; 	// Accepts Device Permissions and Honesty Pledge
	
	@FindBy(xpath = "//div[@class='col-md-10']/h2[contains(.,'Need to know')]")
	private WebElement h2_DeviceNeedToKnow; 
	
	@FindBy(xpath = "//footer[@class='section-content discovery-footer']")
	private WebElement footer;
	
	@FindBy(xpath = "//*[@id='appIFrameObj']")
	private WebElement appFrame;
	
	public void verifyDevicePage() {
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
		verifyElement.verifyBrowserElement(h2_DeviceGetStarted, "Device Get Started Header 2");
		verifyElement.verifyBrowserElement(p_DeviceGetStarted, "Device Get Started Paragraph");
		verifyElement.verifyBrowserElement(h2_DeviceNeedToKnow, "Device Need To Know Header 2");
//		verifyElement.verifyBrowserElement(footer, "Footer");
	}
	
	public void clickBtn_LinkDevice() {
		verifyElement.switchToBrowserFrame(appFrame, "App Frame");
		waitTime(2000);
		if (verifyElement.verifyBrowserElementValue(btn_LinkDevice, "Link Device Button") == 0) {
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].scrollIntoView();", btn_LinkDevice);
			js.executeScript("arguments[0].click();", btn_LinkDevice);
//			verifyElement.clickElement(btn_LinkDevice, "Link Device Button");
		} else {
			System.err.println("Link Device Button Couldn't Be Found");
		}
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void validatePopup_DevicePermissions_And_HonestyPledge() {
		verifyElement.switchToBrowserFrame(appFrame, "Vitality App Frame");
		if (verifyElement.verifyBrowserElementValue(popup_DevicePermissions_And_HonestyPledge, "Device Permissions and Honesty Pledge Pop-Up") == 0) {
			System.out.println(popup_DevicePermissions_And_HonestyPledge.getText());
		} else {
			System.err.println("Device Permissions and Honesty Pledge Pop-Up Couldn't Be Found");
		}
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void clickBtn_I_Accept() {
		verifyElement.switchToBrowserFrame(appFrame, "Vitality App Frame");
		if (verifyElement.verifyBrowserElementValue(btn_I_Accept, "I Accept Button") == 0) {
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
			js.executeScript("arguments[0].scrollIntoView();", btn_I_Accept);
			js.executeScript("arguments[0].click();", btn_I_Accept);
//			verifyElement.clickElement(btn_I_Accept, "I Accept Button");
		} else {
			System.err.println("I Accept Button Couldn't Be Found");
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
