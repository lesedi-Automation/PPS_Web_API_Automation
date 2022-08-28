package com.pps.testautomation.steps;


import org.apache.tools.ant.taskdefs.optional.junit.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Map;

//change
public class Logins extends BaseTest
{

	//public BrowserLoginPage browserLoginPage;

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


			driver.get("https://www.shoprite.co.za/search/all?q=juice");

			searchField.click();
			searchField.sendKeys("Fruitree Orange");




		}

		catch (Exception e)
		{
			e.printStackTrace();
			//Assert.fail();
		}

	}

	@FindBy(xpath = "//input[@id='js-site-search-input']")
	private WebElement searchField;

	@Test(priority=1,description="Browser Login to Shoprite")
	public void LoginToShoprite()
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
