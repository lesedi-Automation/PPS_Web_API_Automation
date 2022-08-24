package com.pps.testautomation.steps;

import com.pps.testautomation.deviceConfig.*;
import com.sts.testautomation.deviceConfig.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class BaseTest 
{
    public WebDriverWait wait;
	public String url; 
	public HashMap<String, Node> SeleniumGrid;
	public SetUpHashMap HashSetup;
	public String Device;
	public WebDriver testB;
	public 	AndroidDriver<MobileElement> testA;
	public IOSDriver<MobileElement> testI;
	
    public WebDriver getDriver() 
    {
    	WebDriver web = null;
		for(Map.Entry<String, Node> currentNode : SeleniumGrid.entrySet())
		{
			if(currentNode.getKey().equals(Device))
			{
				//Android
				if(currentNode.getValue() instanceof AndroidNode)
				{
					
					
					web = returnAndoridDriver();
				}
			
				//iOS
				else if(currentNode.getValue() instanceof IOSNode)
				{
					
					web = returnIOSDriver();
				}
				//Browser
				else if(currentNode.getValue() instanceof BrowserNode)
				{
					
					web = returnWebDriver(); 
				}
				else
				{
					web = null;
				}
					
			}
		}
		return web;
		
        
    }

    public AndroidDriver<MobileElement> returnAndoridDriver()
    {
    	return testA;
    }
    
    public IOSDriver<MobileElement> returnIOSDriver()
    {
    	return testI;
    }
    
    public WebDriver returnWebDriver()
    {
    	return testB;
    }
    
    @BeforeClass (description = "Initialize Grid")
    public void setup () 
    {
    	System.out.println("Initializing Nodes");
		
		SeleniumGrid = new HashMap<>();
		HashSetup = new SetUpHashMap(SeleniumGrid);
		
		try
		{
			
			HashSetup.SetUpBrowser();
			
			HashSetup.SetUpAndroidDevices();
			
			HashSetup.SetUpiOSDevices();
			
			
		}
		
		catch (Exception e) 
		{
			Assert.fail();
			e.printStackTrace();
		} 
    }

   
}
