package com.pps.testautomation.steps;

import com.aventstack.extentreports.model.Device;
import com.relevantcodes.extentreports.LogStatus;
//import com.pps.testautomation.deviceConfig.BrowserNode;
//import com.pps.testautomation.deviceConfig.Node;
//import com.pps.testautomation.extentReports.ExtentTestManager;
//import com.pps.testautomation.pages.web.BrowserDashboardCRMPage;
//import com.pps.testautomation.pages.web.BrowserLoginPage;
//import com.pps.testautomation.pages.web.BrowserNavigation;
//import com.pps.testautomation.utilities.ElementFunctionality;
//import com.pps.testautomation.utilities.ExcelHandler;

import org.apache.tools.ant.taskdefs.optional.junit.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.URL;
import java.util.Map;

//change
public class Login
{
//
//	private BrowserNavigation browserNavigation;
//	private BrowserLoginPage browserLogin;
//	public ElementFunctionality verifyElement;

	private String Account;

	//@Parameters({"URL","Device","AccountType"})
	@Test (description = "Instantiate Grid")
    public void setupTest () {
		try
		{

//			//Creating a driver object referencing WebDriver interface
//			WebDriver driver;
//
//			//Setting the webdriver.chrome.driver property to its executable's location
//			System.setProperty("webdriver.chrome.driver", "/Users/lesedimatli/Desktop/Selenium/chromedriver");
//
//			//Instantiating driver object
//			driver = new ChromeDriver();
//
//			//Using get() method to open a webpage
//			driver.get("https://www.shoprite.co.za");
//
//			//Closing the browser
//			driver.quit();

	
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail();
		} 
		
	  }

	@Test(priority=1,description="Browser Login to Shoprite", dataProvider = "Authentication")
	public void LoginToCRM(String AccountType, String Username, String Password)
	  {
	  
	  try
		{
			
		


	
		}
		
	  
	  
		catch (Exception e) 
		{
			Assert.fail();
			e.printStackTrace();
			
		} 
		
	  }


	@AfterTest
	public void closeBrowser() throws Throwable 
	{
		 try
			{

		
			}
			
			catch (Exception e) 
			{
				Assert.fail();
				e.printStackTrace();
			} 
		
	}

	 @DataProvider
	 
	 public Object[][] Authentication() throws Exception
	 {
	 
		 System.out.println("setting excel file");
	     // Setting up the Test Data Excel file
		
		
		 System.out.println("Creating array");
	     Object[][] testObjArray = null;
		 //ExcelHandler.getTableArray("../TestData/TestData.xlsx","sheet1","username",Account);

	     return (testObjArray);


	 
	 }
	
	


  
}
