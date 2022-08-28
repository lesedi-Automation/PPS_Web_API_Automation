package com.pps.testautomation.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Map;

//change
public class Logins
{


	private String Account;
	public WebDriver driver;

	//@Parameters({"URL","Device","AccountType"})
	@Test(description = "Instantiate Grid")
	public void setupTest () {
		try
		{

			//Creating a driver object referencing WebDriver interface


			//Setting the webdriver.chrome.driver property to its executable's location
			System.setProperty("webdriver.chrome.driver", "/Users/lesedimatli/Desktop/Selenium/chromedriver");

			//Instantiating driver object
			driver = new ChromeDriver();

			//Using get() method to open a webpage
			driver.get("https://www.shoprite.co.za");




		}

		catch (Exception e)
		{
			e.printStackTrace();
			//Assert.fail();
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
			//Assert.fail();
			e.printStackTrace();

		}

	}


	@AfterTest
	public void closeBrowser() throws Throwable
	{
		try
		{
           //Closing the browser
			driver.quit();

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
