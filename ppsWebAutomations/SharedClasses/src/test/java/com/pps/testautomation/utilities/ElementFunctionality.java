
package com.pps.testautomation.utilities;

import com.relevantcodes.extentreports.LogStatus;
import com.pps.testautomation.extentReports.ExtentTestManager;
import com.pps.testautomation.listeners.TestListener;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertTrue;

public class ElementFunctionality extends TestListener
{
	private WebDriverWait wait;
	public WebDriver BrowserDriver;
	public IOSDriver<MobileElement> IODriver;
	public String Device;
	public AndroidDriver<MobileElement> AndroidDriver; 
	//private AndroidCommonErrors androidCommonErrors;
	
	public ElementFunctionality(WebDriver BrowserDriver, String Device)
	{
		this.BrowserDriver = BrowserDriver;
		this.Device = Device;
		wait = new WebDriverWait(BrowserDriver,20);
		//androidCommonErrors = new AndroidCommonErrors(testA, Device);
	}
	
	public ElementFunctionality(IOSDriver<MobileElement> IODriver, String Device)
	{
		this.IODriver = IODriver;
		this.Device = Device;
		Dimension size;
		wait = new WebDriverWait(IODriver,20);
	}
	
	public ElementFunctionality(AndroidDriver<MobileElement> AndroidDriver, String Device)
	{
		this.AndroidDriver = AndroidDriver;
		this.Device = Device;
		wait = new WebDriverWait(AndroidDriver,20);
	}
	
	//Verification of element helper function
		public void verifyBrowserElement(WebElement element, String Name)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				System.out.println(Name+" displayed on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, Name+" displayed on " + Device);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name + " element could not be found on " + Device);
				Assert.fail(Name + " element could not be found on " + Device);
				
			}
		
		}
		
		//Verification of element programatic
		public int verifyBrowserElementValue(WebElement element, String Name)
		{
			int result = 0;
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				//System.out.println(Name+" displayed on " + Device);
				result = 0;
				
			}
			catch(Exception ex)
			{
				result = 1;
				
			}
			return result;
		
		}
		
		public void verifyIOSElement(WebElement element, String Name)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				System.out.println(Name+" displayed on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, Name+" displayed on " + Device);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				Assert.fail(Name + " element could not be found on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name + " element could not be found on " + Device);
			}
		}
		
		public void verifyIOSElement(MobileElement element, String Name)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				System.out.println(Name+" displayed on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, Name+" displayed on " + Device);
			}
			catch(TimeoutException ex)
			{
				Assert.fail(Name + " element could not be found on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name + " element could not be found on " + Device);
			}
		}
		
		public void verifyAndriodElement(WebElement element, String Name)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				System.out.println(Name+" displayed on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, Name+" displayed on " + Device);
			}
			catch(TimeoutException ex)
			{
				ex.printStackTrace();
				Assert.fail(Name + " element could not be found on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name + " element could not be found on " + Device);
			}
		}
		
		public void clickElement(WebElement element, String Name)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				//Thread.sleep(3000);
				element.click();
				System.out.println(Name+" was clicked on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, Name+" was clicked on " + Device);
			
			}
			catch (NoSuchElementException e)
			{
				Assert.fail(Name + " element could not be clicked on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name+" element could not be clicked on " + Device);
				e.printStackTrace();
			} 
			
		/*	catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name+" element could not be clicked on " + Device);
			}*/
		}
		
		public void clickElement(MobileElement element, String Name)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				//Thread.sleep(3000);
				element.click();
				System.out.println(Name+" was clicked on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, Name+" was clicked on " + Device);
			
			}
			catch (NoSuchElementException e)
			{
				Assert.fail(Name + " element could not be clicked on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name+" element could not be clicked on " + Device);
				e.printStackTrace();
			} 
			
	
		}
		
		public void longTouch(WebElement element, String Name)
		{
			try
			{
				
				
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				//Thread.sleep(3000);
				if(AndroidDriver != null)
				{
					AndroidTouchAction touch = new AndroidTouchAction (AndroidDriver);
					touch.longPress(LongPressOptions.longPressOptions().withElement (ElementOption.element (element))).perform ();
			
				}
				else if(IODriver != null)
				{
					IOSTouchAction touch = new IOSTouchAction(IODriver);
					touch.longPress(LongPressOptions.longPressOptions().withElement (ElementOption.element (element))).perform ();
				}
			}
			catch (NoSuchElementException e)
			{
				Assert.fail(Name + " element could not be clicked on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name+" element could not be clicked on " + Device);
				e.printStackTrace();
			} 
			
		/*	catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				ExtentTestManager.getTest().log(LogStatus.FAIL, Name+" element could not be clicked on " + Device);
			}*/
		}
		
	
		
		public void hoverAndroidElement(WebElement element, String Name)
		{
			try
			{
                
                Actions action = new Actions(AndroidDriver);
                wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
                action.moveToElement(element).build().perform();
                Thread.sleep(5000);
                //System.out.println("Hovering over "+ Name +" on "+ Device);
                //ExtentTestManager.getTest().log(LogStatus.PASS, "Hovering over "+ Name +" on "+ Device);
                
        	
			}
			catch (NoSuchElementException e)
			{
				Assert.fail(element + " element could not be hovered on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, " element could not be hovered on " + Device);
                e.printStackTrace();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.fail(element + " element could not be hovered on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, " element could not be hovered on " + Device);
                e.printStackTrace();
			} 

		}
		
		public void hoverBrowserElement(WebElement element, String Name)
		{
			try
			{
                
                Actions action = new Actions(BrowserDriver);
                wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
                action.moveToElement(element).build().perform();
                Thread.sleep(5000);
                System.out.println("Hovering over "+ Name +" on "+ Device);
                //ExtentTestManager.getTest().log(LogStatus.PASS, "Hovering over "+ Name +" on "+ Device);
        	
			}
			catch (NoSuchElementException e)
			{
				Assert.fail(element + " element could not be hovered on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, " element could not be hovered on " + Device);
                e.printStackTrace();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.fail(element + " element could not be hovered on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, " element could not be hovered on " + Device);
                e.printStackTrace();
			} 

		}
		
		
	
		public void dismissAndroidDialog()
		{
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = AndroidDriver.switchTo().alert();
			alert.dismiss();
		}
		
		public void dismissIOSDialog()
		{
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = IODriver.switchTo().alert();
			alert.dismiss();
		}
		
		public void dismissWebDialog()
		{
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = BrowserDriver.switchTo().alert();
			alert.dismiss();
		}
		
		public void hoverIOSElement(WebElement element, String Name)
		{
			try
			{
                
                Actions action = new Actions(IODriver);
                wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
                action.moveToElement(element).build().perform();
                System.out.println("Hovering over "+ Name +" on "+ Device);
                ExtentTestManager.getTest().log(LogStatus.PASS, "Hovering over "+ Name +" on "+ Device);
        	
			}
			catch (NoSuchElementException e)
			{
				Assert.fail(element + " element could not be hovered on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, " element could not be hovered on " + Device);
                e.printStackTrace();
			} 

		}
		
		
		
		public void sendKeys(WebElement element, String Name, String Text)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				if(AndroidDriver != null)
				{
					element.click();
					AndroidDriver.getKeyboard().sendKeys(Text);
					System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					ExtentTestManager.getTest().log(LogStatus.PASS, "The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					
				}
				
				else if(IODriver != null)
				{
					element.click();
					element.sendKeys(Text);
					System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					ExtentTestManager.getTest().log(LogStatus.PASS, "The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					
				}
				
				else
				{
					element.click();
					element.sendKeys(Text);
					System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					ExtentTestManager.getTest().log(LogStatus.PASS, "The text: '"+Text +"' was sent to "+ Name +" on " + Device);
				}
				
				
			}
			catch(TimeoutException ex)
			{
				Assert.fail("The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, "The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
			}
			
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				ExtentTestManager.getTest().log(LogStatus.FAIL, "The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
			}
			
		}

	public void sendKeysPasswordHide(WebElement element, String Name, String Text)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			assertTrue(element.getSize().getWidth()>0);
			if(AndroidDriver != null)
			{
				element.click();
				AndroidDriver.getKeyboard().sendKeys(Text);
				System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, "The text: ******** was sent to "+ Name +" on " + Device);

			}

			else if(IODriver != null)
			{
				element.click();
				element.sendKeys(Text);
				System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, "The text: ******** was sent to "+ Name +" on " + Device);

			}

			else
			{
				element.click();
				element.sendKeys(Text);
				System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, "The text: ******** was sent to "+ Name +" on " + Device);
			}


		}
		catch(TimeoutException ex)
		{
			Assert.fail("The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
			ExtentTestManager.getTest().log(LogStatus.FAIL, "The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
		}

		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ExtentTestManager.getTest().log(LogStatus.FAIL, "The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
		}

	}


	public void selectorOptionPicker(WebElement element, String dropdownName,String option)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				clickElement(element, dropdownName);
				Select dropdown = new Select(element);
				dropdown.selectByVisibleText(option);
				
				System.out.println("The option: '"+option +"' was selected from "+ dropdownName +" on " + Device);
				ExtentTestManager.getTest().log(LogStatus.PASS, "The option: '"+option +"' was selected from "+ dropdownName +" on " + Device);
				
				
				
			}
			catch(TimeoutException ex)
			{
				Assert.fail("The option: '"+option +"' could not be selected from "+ dropdownName +" on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, "The option: '"+option +"' could not be selected from "+ dropdownName +" on " + Device);
			}
			
			catch(Exception ex)
			{
				System.out.println("The option: '"+option +"' could not be selected from "+ dropdownName +" on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, "The option: '"+option +"' could not be selected from "+ dropdownName +" on " + Device);
			}
		}
		
		public void sendKeysToApplication(WebElement element, String Name, String Text)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				assertTrue(element.getSize().getWidth()>0);
				if(AndroidDriver != null)
				{
					element.click();
					element.sendKeys(Text);
					System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					ExtentTestManager.getTest().log(LogStatus.PASS, "The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					
				}
				
				else if(IODriver != null)
				{
					element.click();
					element.sendKeys(Text);
					System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					ExtentTestManager.getTest().log(LogStatus.PASS, "The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					
				}
				
				else
				{
					element.click();
					element.sendKeys(Text);
					System.out.println("The text: '"+Text +"' was sent to "+ Name +" on " + Device);
					ExtentTestManager.getTest().log(LogStatus.PASS, "The text: '"+Text +"' was sent to "+ Name +" on " + Device);
				}
				
				
			}
			catch(TimeoutException ex)
			{
				Assert.fail("The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
				ExtentTestManager.getTest().log(LogStatus.FAIL, "The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
			}
			
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				ExtentTestManager.getTest().log(LogStatus.FAIL, "The text: '"+Text +"' could not be sent to "+ Name + " on " + Device);
			}
			
		}
		
		
		public boolean isStringPresent(String comparedText, String Keyword)
		{
			boolean blnResult = false;
			if(comparedText.contains(Keyword))
			{
				blnResult = true;
			}
			
			return blnResult;
		}
		
		public void waitForFullPageLoad() 
		{
	        ExpectedCondition<Boolean> pageLoadCondition = new
	                ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                    }
	                };
	        WebDriverWait wait = new WebDriverWait(BrowserDriver, 30);
	        wait.until(pageLoadCondition);
	    }
		
		
		
		
		//Method to validate is a url is valid or not
		public boolean isLinkValid(String url, String output)
		{
			 HttpURLConnection huc = null;
			 output = "Link is Valid";
		     int respCode = 200;
		     boolean isValid = true;
		   
            try 
            {
            	
                if(url == null || url.isEmpty() == true || url.startsWith("http") != true || url.startsWith("/") != true)
                {
                	output = "URL is either not configured for anchor tag or it is empty";
                
                }
                
                else
                {
                	 huc = (HttpURLConnection)(new URL(url).openConnection());
                     
                     //huc.setInstanceFollowRedirects(false);
                    // huc.setRequestProperty("user-agent", huc.("user-agent"));
                     //huc.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
                     huc.setRequestMethod("HEAD");
                 
                     huc.connect();
                     respCode = huc.getResponseCode();
                     
                     if(respCode != 404)
                     {
                     	output = "Link is Valid";
                     	
                        
                     }
                     else
                     {
                     	
                     	output = "url: "+url;
                     	//Assert.fail("'"+url+ "' is broken on " + Device);
                     	//ExtentTestManager.getTest().log(LogStatus.FAIL, "'"+url+ "' is broken on " + Device);
                     	isValid = false;
                     	
                     }
                }
 
                
               /* HttpClient client = new DefaultHttpClient();
          
                HttpGet request = new HttpGet(url);
            
                HttpResponse response = null;
            
                response = client.execute(request);
                
                if(url == null || url.isEmpty())
                {
                	output = "URL is either not configured for anchor tag or it is empty";
                
                }
                else if(response.getStatusLine().getStatusCode()!=200)
                {
                	output = response.getFirstHeader("user-agent") + " Link is Broken";
                }
                else
                {
                	output = "Link is Valid";
                }
                	*/
                  
                    
            } 
            
            catch (Exception e) 
            {
            	/*output = "Link is Broken";
            	Assert.fail("'"+url+ "' is broken on " + Device);
            	ExtentTestManager.getTest().log(LogStatus.FAIL, "'"+url+ "' is broken on " + Device);*/
            	isValid = false;
            }
         
 
            return isValid;
        }
		
		//Method to validate if any url was invalid on the page
		public void validatePageLinks(List<String> invalidValues)
		{
			if(invalidValues.isEmpty() != true)
			{
				for(int i = 0; i < invalidValues.size(); i++)
				{
					ExtentTestManager.getTest().log(LogStatus.FAIL, "'"+invalidValues.get(i).toString()+ "' is broken on " + Device);
				}
				Assert.fail("Links are invalid on " + Device);
				
			}
			else
			{
				ExtentTestManager.getTest().log(LogStatus.PASS, "All links valid on " + Device);
			}
		}
		
	public void PageLinksValidation(String linkXpath)
	
	{
		 List<WebElement> txtfields = BrowserDriver.findElements(By.xpath(linkXpath));
		 List<String> inValidLinks= new ArrayList<>();
			
		 try 
		 {
			 if(txtfields.size() == 0)
			 {
				 logInformation("Failure to load Links on " + Device);
				 Assert.fail("Failed to load Links");
			 }
				
			 
			 else
			 {
				 //for loop to send text In all text box one by one.
				  for(int a=0; a<txtfields.size();a++)
				  {  
					  //hoverBrowserElement(txtfields.get(a), "Link: " + txtfields.get(a).getAttribute("text"));
					  if(txtfields.get(a).isDisplayed() == true)
					  {
							hoverBrowserElement(txtfields.get(a), "Link: " + txtfields.get(a).getAttribute("text"));
					  }
					  
					  String resultText="";
					  String url = txtfields.get(a).getAttribute("href");
					  String Message = "";
					  
					  if(txtfields.get(a).getAttribute("text").isEmpty())
					  {
						  resultText = "Image to : [" + url + "]";
					  }
					  
					  else 
					  {
						  resultText = "Link text ('" + txtfields.get(a).getAttribute("text").replaceAll("^\\s|\n\\s|\\s$", "") +"') to : ["+ txtfields.get(a).getAttribute("href") +"]";
						  
					  }
					  
					  if(isLinkValid(url, Message) == false)
					  {
						 
						  inValidLinks.add(txtfields.get(a).getAttribute("text") + " : "+Message);
						  //System.err.println(txtfields.get(a).getAttribute("text") + " : "+Message);
					  }
					  
					  System.out.println(resultText);
				
					
				  }
				  
				  validatePageLinks(inValidLinks);
				  logInformation("Total Number of Links: " + String.valueOf(txtfields.size()-1));
				  System.out.println("Total Number of Links: " + String.valueOf(txtfields.size()-1));
				 
				  
			 }
		 }
		 catch (Exception e)
		 {
			 Assert.fail(e.toString());
		 }
		 
		 
		 
	}
		
	public void ImageValidation(String imageXpath)
	
	{
		 List<WebElement> images = BrowserDriver.findElements(By.xpath(imageXpath));
		 List<String> inValidLinks= new ArrayList<>();
			
		 try 
		 {
			 if(images.size() == 0)
			 {
				logInformation("Failure to load images on " + Device);
			 }
				
			 
			 else
			 {
				 //for loop to send text In all text box one by one.
				  for(int a=0; a<images.size();a++)
				  {  
					 
					  String url = images.get(a).getAttribute("src");
					  String Message = "";
				
					System.out.println( "Validated image: [" +  url +"] on " + Device);
				
					if(isLinkValid(url, Message) == false)
					{
						  inValidLinks.add(Message);
					}
					
				  }
				  
				  validatePageLinks(inValidLinks);
				  logInformation("Total Number of Images: " + String.valueOf(images.size()-1));
				  System.out.println("Total Number of Images: " + String.valueOf(images.size()-1));
				  
			 }
		 }
		 catch (Exception e)
		 {
			 Assert.fail(e.toString());
		 }
		 
	
		 
	}


		
		
		//Method to add failure to a report
		public void failTest(String Message)
		{
			if(AndroidDriver != null)
			{
				String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)AndroidDriver).getScreenshotAs(OutputType.BASE64);
		 
		        //Extentreports log and screenshot operations for failed tests.
				 ExtentTestManager.getTest().log(LogStatus.FAIL,Message);
		        ExtentTestManager.getTest().log(LogStatus.FAIL,Message,
		        ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
			}
			
			else if(IODriver != null)
			{
				
				String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)IODriver).getScreenshotAs(OutputType.BASE64);
				 
		        //Extentreports log and screenshot operations for failed tests.
				 ExtentTestManager.getTest().log(LogStatus.FAIL,Message);
		        ExtentTestManager.getTest().log(LogStatus.FAIL,Message,
		        ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
			}
			
			else
			{
				String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)BrowserDriver).getScreenshotAs(OutputType.BASE64);
				 
		        //Extentreports log and screenshot operations for failed tests.
				ExtentTestManager.getTest().log(LogStatus.FAIL,Message);
		        ExtentTestManager.getTest().log(LogStatus.FAIL,Message,
		        ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
			}
		    
			System.out.println(Message);
		}
		
		//Method to add pass to a report
		public void passTest(String Message)
		{
			ExtentTestManager.getTest().log(LogStatus.PASS, Message);
			System.out.println(Message);
		}
		
		//Method to add pass to a report
		public void passTestWithScreenshot(String Message)
		{
			String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)BrowserDriver).getScreenshotAs(OutputType.BASE64);

			ExtentTestManager.getTest().log(LogStatus.PASS, Message);
			ExtentTestManager.getTest().log(LogStatus.PASS, Message,
			ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
			
			System.out.println(Message);
		}		
		
		//Method to add information
		public void logInformation(String Message)
		{
			ExtentTestManager.getTest().log(LogStatus.INFO, Message);
			System.out.println(Message);
		}
				
		//Generate a random number
		public int generateRandomNumber(Integer lowerbound, int upperbound)
		{
			Random randNum = new Random(123456789);
			int randomInteger = randNum.nextInt(upperbound) + lowerbound;
			
			return randomInteger;
		}
		
		public void scrollBottomToTop()
		{
			
			int width = 0;
			int height= 0; 
			TouchAction action = null;
			Actions browserAction;
			
			try
			{
				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					width = AndroidDriver.manage().window().getSize().getWidth();
					height = AndroidDriver.manage().window().getSize().getHeight();
					action = new TouchAction(AndroidDriver);
				}
				
				else if(IODriver != null)
				{
					width = IODriver.manage().window().getSize().getWidth();
					height = IODriver.manage().window().getSize().getHeight();
					action = new TouchAction(IODriver);
				}
				
		
				

				Point Top = new Point((int)(width/2), (int) (height*0.3));
				Point Bottom = new Point((int)(width/2), (int) (height*0.8));
			
				action.press(PointOption.point(Bottom)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Top)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void scrollTopToBottom()
		{
			int width = 0;
			int height= 0; 
			TouchAction action = null;
			
			try
			{
				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					width = AndroidDriver.manage().window().getSize().getWidth();
					height = AndroidDriver.manage().window().getSize().getHeight();
					action = new TouchAction(AndroidDriver);
				}
				
				else if(IODriver != null)
				{
					width = IODriver.manage().window().getSize().getWidth();
					height = IODriver.manage().window().getSize().getHeight();
					action = new TouchAction(IODriver);
				}
				

				Point Top = new Point((int)(width/2), (int) (height*0.3));
				Point Bottom = new Point((int)(width/2), (int) (height*0.8));
			
				action.press(PointOption.point(Top)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Bottom)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
		
		public void scrollTopToBottomIntegratedRewards()
		{
			int width = 0;
			int height= 0; 
			TouchAction action = null;
			
			try
			{
				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					width = AndroidDriver.manage().window().getSize().getWidth();
					height = AndroidDriver.manage().window().getSize().getHeight();
					action = new TouchAction(AndroidDriver);
				}
				
				else if(IODriver != null)
				{
					width = IODriver.manage().window().getSize().getWidth();
					height = IODriver.manage().window().getSize().getHeight();
					action = new TouchAction(IODriver);
				}
				

				Point Top = new Point((int)(width/2), (int) (height*0.45));
				Point Bottom = new Point((int)(width/2), (int) (height*0.8));
			
				action.press(PointOption.point(Top)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Bottom)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
		
		public void scrollRightToLeft()
		{
			
			int width = 0;
			int height= 0; 
			TouchAction action = null;
			
			try
			{
				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					width = AndroidDriver.manage().window().getSize().getWidth();
					height = AndroidDriver.manage().window().getSize().getHeight();
					action = new TouchAction(AndroidDriver);
				}
				
				else if(IODriver != null)
				{
					width = IODriver.manage().window().getSize().getWidth();
					height = IODriver.manage().window().getSize().getHeight();
					action = new TouchAction(IODriver);
				}
				

				Point Right = new Point((int) (width*0.9), (int) (height/2));
				Point Left = new Point((int) (width*0.1), (int) (height/2));
			
				action.press(PointOption.point(Right)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Left)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
		public void scrollLeftToRight()
		{
			int width = 0;
			int height= 0; 
			TouchAction action = null;
			
			try
			{
				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					width = AndroidDriver.manage().window().getSize().getWidth();
					height = AndroidDriver.manage().window().getSize().getHeight();
					action = new TouchAction(AndroidDriver);
				}
				
				else if(IODriver != null)
				{
					width = IODriver.manage().window().getSize().getWidth();
					height = IODriver.manage().window().getSize().getHeight();
					action = new TouchAction(IODriver);
				}
				

				Point Right = new Point((int) (width*0.9), (int) (height/2));
				Point Left = new Point((int) (width*0.1), (int) (height/2));
			
				action.press(PointOption.point(Left)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Right)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		public void scrollableElementBottomToTop(WebElement scrollableElement)
		{
			
			//Get the Dimensions and Position of the Scrollable Element
			Point elementPoint = scrollableElement.getLocation();
			Dimension elementSize = scrollableElement.getSize();
			
			int topPointX = elementPoint.getX() + (int) (elementSize.getWidth()/2);
			int topPointY = elementPoint.getY() +(int) (elementSize.getHeight()*0.1);
			int bottomPointX = elementPoint.getX() + (int) (elementSize.getWidth()/2);
			int bottomPointY = elementPoint.getY() +(int) (elementSize.getHeight()*0.9);
			
			Point Top = new Point(topPointX, topPointY);
			Point Bottom = new Point(bottomPointX, bottomPointY);
			TouchAction action = null;
			
			try
			{

				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					action = new TouchAction(AndroidDriver);
				}
				
				else if (IODriver != null )
				{
					action = new TouchAction(IODriver);
				}
			
				action.press(PointOption.point(Bottom)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Top)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void scrollableElementTopToBottom(WebElement scrollableElement)
		{
			
			//Get the Dimensions and Position of the Scrollable Element
			Point elementPoint = scrollableElement.getLocation();
			Dimension elementSize = scrollableElement.getSize();
			
			int topPointX = elementPoint.getX() + (int) (elementSize.getWidth()/2);
			int topPointY = elementPoint.getY() +(int) (elementSize.getHeight()*0.1);
			int bottomPointX = elementPoint.getX() + (int) (elementSize.getWidth()/2);
			int bottomPointY = elementPoint.getY() +(int) (elementSize.getHeight()*0.9);
			
			Point Top = new Point(topPointX, topPointY);
			Point Bottom = new Point(bottomPointX, bottomPointY);
			TouchAction action = null;
			try
			{

				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					action = new TouchAction(AndroidDriver);
				}
				
				else if (IODriver != null )
				{
					action = new TouchAction(IODriver);
				}
				
				action.press(PointOption.point(Top)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Bottom)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void scrollableElementRightToLeft(WebElement scrollableElement)
		{
			
			//Get the Dimensions and Position of the Scrollable Element
			Point elementPoint = scrollableElement.getLocation();
			Dimension elementSize = scrollableElement.getSize();
			
			//Get the touch points relative to the screen
			int rightPointX = elementPoint.getX() + (int) (elementSize.getWidth()*0.9);
			int rightPointY = elementPoint.getY() + (int) (elementSize.getHeight()/2);
			int leftPointX  = elementPoint.getX() + (int) (elementSize.getWidth()*0.1);
			int leftPointY = elementPoint.getY() +(int) (elementSize.getHeight()/2);
			
			Point Right = new Point(rightPointX, rightPointY);
			Point Left = new Point(leftPointX, leftPointY);
			
			TouchAction action = null;
			try
			{

				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					action = new TouchAction(AndroidDriver);
				}
				
				else if (IODriver != null )
				{
					action = new TouchAction(IODriver);
				}
				action.press(PointOption.point(Right)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Left)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public void scrollableElementLeftToRight(WebElement scrollableElement)
		{
			
			//Get the Dimensions and Position of the Scrollable Element
			Point elementPoint = scrollableElement.getLocation();
			Dimension elementSize = scrollableElement.getSize();
			
			//Get the touch points relative to the screen
			int rightPointX = elementPoint.getX() + (int) (elementSize.getWidth()*0.9);
			int rightPointY = elementPoint.getY() + (int) (elementSize.getHeight()/2);
			int leftPointX  = elementPoint.getX() + (int) (elementSize.getWidth()*0.1);
			int leftPointY = elementPoint.getY() +(int) (elementSize.getHeight()/2);
			
			Point Right = new Point(rightPointX, rightPointY);
			Point Left = new Point(leftPointX, leftPointY);
			
			TouchAction action = null;
			try
			{

				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					action = new TouchAction(AndroidDriver);
				}
				
				else if (IODriver != null )
				{
					action = new TouchAction(IODriver);
				}
				action.press(PointOption.point(Left)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Right)).release().perform();
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		
		
	    public void scrollToText(String visibleText) 
        {
	    
			try
			{
				if(AndroidDriver != null)
				{
					wait.until(ExpectedConditions.visibilityOf(AndroidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))")));
				}
				
				else if (IODriver != null )
				{
					//wait.until(ExpectedConditions.visibilityOf(IODriver.findElementByIOAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))")));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	    
        }
	    
	    //Scroll to element and verify its visibility
	    public void scrollVerifyElement(WebElement element, String Name, String Direction)
	    {
	    	
	    	boolean endScrolling = false;
	    	
	    	while(endScrolling == false)
	    	{
	    		try 
	    		{
	    			if(element.isDisplayed() == true)
	    			{
	    				endScrolling = true;
	    				verifyAndriodElement(element, Name);
	    				
	    			}
	    		}
	    		catch (Exception e) 
	    		{
	    			String PageBefore = "";
	    			String PageAfter= "";
	    			if(AndroidDriver != null)
	    			{
	    				PageBefore = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageBefore = IODriver.getPageSource().toString();
	    			}
	    		
	    			
	    			if (Direction.compareToIgnoreCase("UP")==0)
					{
	    				scrollBottomToTop();
					}
	    			else if (Direction.compareToIgnoreCase("DOWN")==0)
					{
	    				scrollTopToBottom();
					}
	    			else if (Direction.compareToIgnoreCase("RIGHT")==0)
					{
	    				scrollLeftToRight();
					}
	    			else if (Direction.compareToIgnoreCase("LEFT")==0)
					{
	    				scrollRightToLeft();
					}
	    			else 
	    			{
    					System.err.println("Invalid Direction provided: "+Direction);
    					endScrolling = true;
    					failTest("Invalid Direction provided: "+Direction);
    					Assert.fail();
    				}
	    			
	    			if(AndroidDriver != null)
	    			{
	    				PageAfter = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageAfter = IODriver.getPageSource().toString();
	    			}
	    			
	    			if(PageBefore.compareTo(PageAfter) == 0)
	    			{
	    				
	    				endScrolling = true;
	    				System.err.println("Failed to locate element : "+Name);
    					failTest("Failed to locate element : "+Name);
    					Assert.fail();
	    			}
	    			
					
					
				}
	    	
	    	}
	    }
	    
	    
	  //Scroll to element and verify its visibility
	    public void scrollToTopIntegratedRewards()
	    {
	    	
	    	boolean endScrolling = false;
	    	
	    	while(endScrolling == false)
	    	{
	    			String PageBefore = "";
	    			String PageAfter= "";
	    			if(AndroidDriver != null)
	    			{
	    				PageBefore = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageBefore = IODriver.getPageSource().toString();
	    			}
	    		
	    			scrollTopToBottomIntegratedRewards();
	    			if(AndroidDriver != null)
	    			{
	    				PageAfter = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageAfter = IODriver.getPageSource().toString();
	    			}
	    			
	    			if(PageBefore.compareTo(PageAfter) == 0)
	    			{
	    				endScrolling = true;
    					//Assert.fail();
	    			}
	    			
					
					
				}
	    }
	    
	  //Scroll to element and verify its visibility
	    public void scrollVerifyElementIntegratedRewards(WebElement element, String Name, String Direction)
	    {
	    	
	    	boolean endScrolling = false;
	    	
	    	while(endScrolling == false)
	    	{
	    		try 
	    		{
	    			if(element.isDisplayed() == true)
	    			{
	    				endScrolling = true;
	    				verifyAndriodElement(element, Name);
	    				
	    			}
	    		}
	    		catch (Exception e) 
	    		{
	    			String PageBefore = "";
	    			String PageAfter= "";
	    			if(AndroidDriver != null)
	    			{
	    				PageBefore = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageBefore = IODriver.getPageSource().toString();
	    			}
	    		
	    			
	    			if (Direction.compareToIgnoreCase("UP")==0)
					{
	    				scrollBottomToTop();
					}
	    			else if (Direction.compareToIgnoreCase("DOWN")==0)
					{
	    				scrollTopToBottomIntegratedRewards();
					}
	    			else if (Direction.compareToIgnoreCase("RIGHT")==0)
					{
	    				scrollLeftToRight();
					}
	    			else if (Direction.compareToIgnoreCase("LEFT")==0)
					{
	    				scrollRightToLeft();
					}
	    			else 
	    			{
    					System.err.println("Invalid Direction provided: "+Direction);
    					endScrolling = true;
    					failTest("Invalid Direction provided: "+Direction);
    					Assert.fail();
    				}
	    			
	    			if(AndroidDriver != null)
	    			{
	    				PageAfter = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageAfter = IODriver.getPageSource().toString();
	    			}
	    			
	    			if(PageBefore.compareTo(PageAfter) == 0)
	    			{
	    				
	    				endScrolling = true;
	    				System.err.println("Failed to locate element : "+Name);
    					failTest("Failed to locate element : "+Name);
    					Assert.fail();
	    			}
	    			
					
					
				}
	    	
	    	}
	    }
	    
	    //Scroll gesture per percentage
	    public void scrollByPercentage(Double Percentage, String Direction)
	    {
	    	
	   
	    	int width = 0;
			int height= 0; 
			TouchAction action = null;
			double percentageRequired = ((100-Percentage)/2);
			double minPercentile = percentageRequired/100;
			double maxPercentile = (Percentage + percentageRequired)/100;
			
			try
			{
				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					width = AndroidDriver.manage().window().getSize().getWidth();
					height = AndroidDriver.manage().window().getSize().getHeight();
					action = new TouchAction(AndroidDriver);
				}
				
				else if(IODriver != null)
				{
					width = IODriver.manage().window().getSize().getWidth();
					height = IODriver.manage().window().getSize().getHeight();
					action = new TouchAction(IODriver);
				}
				

				Point Right = new Point((int) (width*maxPercentile), (int) (height/2));
				Point Left = new Point((int) (width*minPercentile), (int) (height/2));
				Point Top = new Point((int)(width/2), (int) (height*minPercentile));
				Point Bottom = new Point((int)(width/2), (int) (height*maxPercentile));
				
				if (Direction.compareToIgnoreCase("UP")==0)
				{
					action.press(PointOption.point(Bottom)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Top)).release().perform();
				}
    			else if (Direction.compareToIgnoreCase("DOWN")==0)
				{
    				action.press(PointOption.point(Top)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Bottom)).release().perform();
				}
    			else if (Direction.compareToIgnoreCase("RIGHT")==0)
				{
    				action.press(PointOption.point(Left)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Right)).release().perform();
				}
    			else if (Direction.compareToIgnoreCase("LEFT")==0)
				{
    				action.press(PointOption.point(Right)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(Left)).release().perform();
				}
    			else 
    			{
					System.err.println("Invalid Direction provided: "+Direction);
					failTest("Invalid Direction provided: "+Direction);
					Assert.fail();
				}
			
				
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	    
	    }
	    
	  //Generic Click Function
	    public void clickPoint(String Direction)
	    {
	    	
	   
	    	int width = 0;
			int height= 0; 
			TouchAction action = null;
		
			
			try
			{
				Thread.sleep(2000);
				if(AndroidDriver != null)
				{
					width = AndroidDriver.manage().window().getSize().getWidth();
					height = AndroidDriver.manage().window().getSize().getHeight();
					action = new TouchAction(AndroidDriver);
				}
				
				else if(IODriver != null)
				{
					width = IODriver.manage().window().getSize().getWidth();
					height = IODriver.manage().window().getSize().getHeight();
					action = new TouchAction(IODriver);
				}
				

				Point Right = new Point((int) (width-5), (int) (height/2));
				Point Left = new Point(5, (int) (height/2));
				Point Top = new Point((int)(width/2), 5);
				Point Bottom = new Point((int)(width/2), (int) (height-5));
				
				if (Direction.compareToIgnoreCase("UP")==0)
				{
					action.press(PointOption.point(Top)).release().perform();
				}
    			else if (Direction.compareToIgnoreCase("DOWN")==0)
				{
    				action.press(PointOption.point(Bottom)).release().perform();
				}
    			else if (Direction.compareToIgnoreCase("RIGHT")==0)
				{
    				action.press(PointOption.point(Right)).release().perform();
				}
    			else if (Direction.compareToIgnoreCase("LEFT")==0)
				{
    				action.press(PointOption.point(Left)).release().perform();
				}
    			else 
    			{
					System.err.println("Invalid Direction provided: "+Direction);
					failTest("Invalid Direction provided: "+Direction);
					Assert.fail();
				}
			
				
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	    
	    }
	    
	    public void scrollVerifyElementNotFail(WebElement element, String Name, String Direction)
	    {
	    	boolean endScrolling = false;
	    	
	    	while(endScrolling == false)
	    	{
	    		try 
	    		{
	    			if(element.isDisplayed() == true)
	    			{
	    				endScrolling = true;
	    				verifyAndriodElement(element, Name);
	    				
	    			}
	    		}
	    		catch (Exception e) 
	    		{
	    			String PageBefore = "";
	    			String PageAfter= "";
	    			if(AndroidDriver != null)
	    			{
	    				PageBefore = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageBefore = IODriver.getPageSource().toString();
	    			}
	    		
	    			
	    			if (Direction.compareToIgnoreCase("UP")==0)
					{
	    				scrollBottomToTop();
					}
	    			else if (Direction.compareToIgnoreCase("DOWN")==0)
					{
	    				scrollTopToBottom();
					}
	    			else if (Direction.compareToIgnoreCase("RIGHT")==0)
					{
	    				scrollLeftToRight();
					}
	    			else if (Direction.compareToIgnoreCase("LEFT")==0)
					{
	    				scrollRightToLeft();
					}
	    			else 
	    			{
    					System.err.println("Invalid Direction provided: "+Direction);
    					endScrolling = true;
    					failTest("Invalid Direction provided: "+Direction);
    					Assert.fail();
    				}
	    			
	    			if(AndroidDriver != null)
	    			{
	    				PageAfter = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageAfter = IODriver.getPageSource().toString();
	    			}
	    			
	    			if(PageBefore.compareTo(PageAfter) == 0)
	    			{
	    				
	    				endScrolling = true;
	    				System.err.println("Failed to locate element : "+Name);
    					failTest("Failed to locate element : "+Name);
    					//Assert.fail();
	    			}
	    			
					
					
				}
	    	
	    	}
	    }
	    
	    //Scroll to element that is located within another scrollable element and verify its visibility
	    public void verifyElementInScrollableView(WebElement scrollableElement, WebElement element, String Name, String Direction)
	    {
	    	boolean endScrolling = false;
	    	
	    	while(endScrolling == false)
	    	{
	    		try 
	    		{
	    			if(element.isDisplayed() == true)
	    			{
	    				endScrolling = true;
	    				verifyAndriodElement(element, Name);
	    				
	    			}
	    		}
	    		catch (Exception e) 
	    		{
	    			String PageBefore = "";
	    			String PageAfter= "";
	    			if(AndroidDriver != null)
	    			{
	    				PageBefore = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageBefore = IODriver.getPageSource().toString();
	    			}
	    		
	    			if (Direction.compareToIgnoreCase("UP")==0)
					{
	    				scrollableElementBottomToTop(scrollableElement);
					}
	    			else if (Direction.compareToIgnoreCase("DOWN")==0)
					{
	    				scrollableElementTopToBottom(scrollableElement);
					}
	    			else if (Direction.compareToIgnoreCase("RIGHT")==0)
					{
	    				scrollableElementLeftToRight(scrollableElement);
					}
	    			else if (Direction.compareToIgnoreCase("LEFT")==0)
					{
	    				scrollableElementRightToLeft(scrollableElement);
					}
	    			else 
	    			{
    					System.err.println("Invalid Direction provided: "+Direction);
    					endScrolling = true;
    					failTest("Invalid Direction provided: "+Direction);
    					Assert.fail();
    				}
	    			

	    			if(AndroidDriver != null)
	    			{
	    				PageAfter = AndroidDriver.getPageSource().toString();
	    			}
	    			
	    			else if (IODriver != null)
	    			{
	    				PageAfter = IODriver.getPageSource().toString();
	    			}
	    			
	    			
	    			if(PageBefore.compareTo(PageAfter) == 0)
	    			{
	    				
	    				endScrolling = true;
	    				System.err.println("Failed to locate element : "+Name);
    					failTest("Failed to locate element : "+Name);
    					Assert.fail();
	    			}
	    			
					
					
				}
	    	
	    	}
	    }
	    
	    public void verifyElementAndScroll(WebElement MobileElement, String name)
	    {
	    	String ElementText = MobileElement.getText();
	    	System.out.println("validating: " + name + " with the following Text: " + ElementText);
	    	try
	    	{
	    		if(verifyBrowserElementValue(MobileElement,"Android MbileElement") != 0)
	    		{
	    			  System.out.println("test 1");
				/*
				
				 * //wait.until(ExpectedConditions.visibilityOf(AndroidDriver.
				 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
				 * +ElementText+"\").instance(0))"))); scrollToText(ElementText);
				 * System.out.println("test 2"); verifyAndriodElement(MobileElement,name);
				 * System.out.println("test 3");
				 */
	    		}
	    		else {
	    			System.out.println("test");
	    			verifyAndriodElement(MobileElement,name);
	    		}
	    	}
	    	catch(Exception ex)
	    	{
	    			failTest("Unsuccessful to find text " + ElementText);
	   		}

	    	
	    }
		
		public void SwipingHorizontal(WebElement MobileElement)
		{
			//get the size of the screen
			Dimension size = AndroidDriver.manage().window().getSize();
			System.out.println("The device's windows size is: " + size);
			
			int height = size.getHeight();
			int width = size.getWidth();
			int x = width / 2; 
			
			
			
			int top_y = (int)(size.width * 0.80);
			int bottom_y = (int)(size.width * 0.20);
			//int starty = size.height / 2;
			
			TouchActions action = new TouchActions(AndroidDriver);
			action.scroll(MobileElement, 0,MobileElement.getLocation().getY());
			action.perform();
		/*
		 * TouchAction action = new TouchAction(AndroidDriver);
		 * action.s.release().perform();
		 */
			//action.pr(911,1194).moveTo(212,1222).release() .perform();
			  

		}
		
		
		public void switchToBrowserFrame(WebElement element, String Name) 
		{
			try 
			{
				verifyBrowserElement(element, Name);
				BrowserDriver.switchTo().frame(element);
				passTest("Successfully switched to " + Name);
			}
			catch(Exception ex)
			{
				failTest("Unsuccessful switch to " + Name);
			}
		
		}
			
		public void switchOutOfBrowserFrame() 
		{
			try 
			{
				BrowserDriver.switchTo().defaultContent();
			}
			catch(Exception ex)
			{
				failTest("Unsuccessful switch out of iFrame");
			}
		
		}
		
		public WebElement getIosNsPredicateElement(String iosPredicateStringText) {
			
			return IODriver.findElement(MobileBy.iOSNsPredicateString(iosPredicateStringText));
			
		}
		
		public void captureImageScreenshot(WebElement webElement, String imageName) {
			System.out.println("Starting Image Capture");
		       
		       try {
		    	Screenshot screenshot = new AShot().takeScreenshot(BrowserDriver,webElement);
				ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir") +"\\Images\\"+imageName+".png"));
				System.out.println("Image "+imageName+" Captured");
		       } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		}
}
