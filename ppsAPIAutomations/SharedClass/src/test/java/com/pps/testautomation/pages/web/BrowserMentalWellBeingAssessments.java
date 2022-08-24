/**
 * 
 */
package com.pps.testautomation.pages.web;


import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author Aneshen Govender
 *
 */
public class BrowserMentalWellBeingAssessments 
{
	public WebDriver BrowserDriver;
	//public AndroidDriver<MobileElement> aDriver;
	public ElementFunctionality verifyElement; public String Device;
	
	public BrowserMentalWellBeingAssessments(WebDriver browserDriver, String Device)
	{
		BrowserDriver = browserDriver;
		this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
		PageFactory.initElements(BrowserDriver, this);
	}
	
	
	
	//Quick mental assessment complete
	
	//a[.='Start assessments']
	@FindBy(xpath="/html[1]/body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")  
	private WebElement StartAssessments; 
	
	@FindBy(xpath="//h1[contains(text(),'Mental Wellbeing assessments')]")  
	private WebElement MentalWellbeingassessments; 
	
	
	public void clickStartAsseesment()
	{
		try{Thread.sleep(3000);}catch(Exception e){}
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Know your health Page frame");
		
		try{Thread.sleep(1000);}catch(Exception e){}
		JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;

		js.executeScript("arguments[0].scrollIntoView();", StartAssessments);
		verifyElement.clickElement(StartAssessments,"Get Started Button");
		

		verifyElement.switchOutOfBrowserFrame();
	}
	
	// helps to click element that could not be click with the normal click function 
	private void ClickHelpFunction(WebElement Element, String ElementDiscrption) {
		JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		js.executeScript("arguments[0].click();", Element);
		System.out.println("Clicked " + "ElementDiscrption");
	}
	//Vitality App Frame
	@FindBy(xpath="//iframe[@id='appIFrameObj']")  
	private WebElement vitalityAppFrame; 
	
	//Know Your Health Page Title
	@FindBy(xpath="//h1[contains(text(),'Mental Wellbeing assessments')]")
	private WebElement mentalWellbeingAssessmentsHeading;

	//Start Assessments appObjectMWBA frame
	@FindBy(xpath="//*[@id=\"appObjectMWBA\"]") //*[@id="appObjectMWBA"]
	private WebElement appObjectMWBA;
	
	//Start Assessment Button
	@FindBy(xpath="//a[.='Start assessments']") 
	private WebElement startAssessmentsButton;
	//a[.='Start assessments'] or //a[contains(text(),'Start assessments')]
	//Popup I Agree Button
	@FindBy(xpath="//button[contains(text(),'I Agree')]")
	private WebElement popupAgreeButton;
	
	//resume assessment Button
	@FindBy(xpath="//a[.='Resume assessments']")
	private WebElement resumeAssessments;
	
	
	//Popup Close Button
	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement popupCloseButton;
	
	//Resume Assessments Button
	@FindBy(xpath="//a[contains(text(),'Resume assessments')]")
	private WebElement resumeAssessmentsButton;
	
	
	/////////////////////////////Uncompleted Assessments///////////////////////////
	
	//Depression Uncompleted
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[2]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]")
	private WebElement depressionAssessmentUncompleted;
	
	
	//Depression Questions
	@FindBy(xpath="//span[contains(text(),'9 Questions')]")
	private WebElement depressionAssessmentUncompletedQuestions;
	
	
	//Anxiety Uncompleted
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[3]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]")
	private WebElement anxietyAssessmentUncompleted;
		
		//Anxiety Uncompleted result
		@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[3]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]")
		private WebElement anxietyAssessmentUncompletedQuestions;
	

		//Sleep Uncompleted
		@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[4]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]")
		private WebElement sleepAssessmentUncompleted;
		
		//Sleep Uncompleted result
		@FindBy(xpath="//span[contains(text(),'8 Questions')]")
		private WebElement sleepAssessmentUncompletedQuestions;
	
		//Wellbeing Uncompleted
		@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[5]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
		private WebElement wellbeingAssessmentUncompleted;
		
		//Wellbeing Uncompleted result
		@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[5]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]")
		private WebElement wellbeingAssessmentUncompletedQuestion;
		
		//Resilience Uncompleted
		@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[6]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
		private WebElement resilienceAssessmentUncompleted;
		
		//Resilience Uncompleted result
		@FindBy(xpath="//span[contains(text(),'6 Questions')]")
		private WebElement resilienceAssessmentUncompletedQuestions;
		
		//Drinking Uncompleted
		@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[7]/mwba-incomplete-assessment-bar[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
		private WebElement drinkingAssessmentUncompleted;
		
		//Drinking Uncompleted result
		@FindBy(xpath="//span[contains(text(),'3 Questions')]")
		private WebElement drinkingAssessmentUncompletedQuestion;
		
	public void VerifyUncompletedAssesmentPage()
	{
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality AppFrame");
		verifyElement.verifyBrowserElement(mentalWellbeingAssessmentsHeading,"mental Wellbeing Assessments Heading");
		verifyElement.verifyBrowserElement(depressionAssessmentUncompleted,"Depression Assessment Uncompleted");
		verifyElement.verifyBrowserElement(anxietyAssessmentUncompleted,"Anxiety Assessment Uncompleted");
		verifyElement.verifyBrowserElement(sleepAssessmentUncompleted,"Sleep Assessment Uncompleted");
		verifyElement.verifyBrowserElement(wellbeingAssessmentUncompleted,"Wellbeing Assessment Uncompleted");
		verifyElement.verifyBrowserElement(resilienceAssessmentUncompleted,"Resilience Assessment Uncompleted");
		verifyElement.verifyBrowserElement(drinkingAssessmentUncompleted,"Drinking Assessment Uncompleted");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void clickStartAssessment2() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
		
		js.executeScript("window.scrollBy(0,850)");
		
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Vitality App Frame");
		
		Thread.sleep(10000);
		
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Object IFrame");
	
		js.executeScript("arguments[0].click();", startAssessmentsButton);


		verifyElement.switchOutOfBrowserFrame();
		verifyElement.switchOutOfBrowserFrame();
		} 
		
	
	public void clickResumeButton() throws Exception {
		
		
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "vitality AppFrame");
		Thread.sleep(3000);
		//verifyElement.switchToBrowserFrame(appObjectMWBA, "Object IFrame");
		JavascriptExecutor js = (JavascriptExecutor) BrowserDriver;
		js.executeScript("window.scrollBy(0,850)");
		js.executeScript("arguments[0].click();", resumeAssessments);
		verifyElement.switchOutOfBrowserFrame();

	
		}
	
	public void clickPopUpButton() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "iframe ");
		verifyElement.verifyBrowserElement(popupAgreeButton,"Popup Agree Button");
		verifyElement.clickElement(popupAgreeButton, "Popup Agree Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	
	
	
public void verifyDepressionUncompleted() {
		
		verifyElement.verifyBrowserElement(depressionAssessmentUncompletedQuestions,"Depression Assessment Uncompleted Questions");
		
	}
	
	public void verifyAnxietyUncompleted() {
		
		verifyElement.verifyBrowserElement(anxietyAssessmentUncompletedQuestions,"Anxiety Assessment Uncompleted Questions");
	
	}
	
	
	public void verifySleepUncompleted() {
		
	
		verifyElement.verifyBrowserElement(sleepAssessmentUncompletedQuestions,"Sleep Assessment Uncompleted Questions");
	
	}
	
	
	
	public void verifyWellbeingUncompleted() {
	

		verifyElement.verifyBrowserElement(wellbeingAssessmentUncompletedQuestion,"Wellbeing Assessment Uncompleted Questions");
		
	}
	
	
	
	public void verifyResilienceUncompleted() {
		
		
		verifyElement.verifyBrowserElement(resilienceAssessmentUncompletedQuestions,"Resilience Assessment Uncompleted Questions");
		
	}
	
	
	
	public void verifyDrinkingUncompleted() {
	
		
		verifyElement.verifyBrowserElement(drinkingAssessmentUncompletedQuestion,"Drinking Assessment Uncompleted Questions");
	
	}
	
	/////////////////////////////Completed Assessments/////////////////////////////
	
	
	//Depression 
	@FindBy(xpath="//div[contains(text(),'Depression')]")
	private WebElement Depression;
	
	//Footer
	@FindBy(xpath="//body/mwba-app[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement Footer;

	//Depression Completed

	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[2]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[2]")
	private WebElement depressionAssessmentCompleted;
	
	//Depression Completed result
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[2]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[3]")
	private WebElement depressionAssessmentCompletedResult;
	
	//Depression Completed Dropdown
	@FindBy(xpath="//div[contains(text(),'Depression')]")
	private WebElement depressionAssessmentCompletedDropdown;
		
	//Depression Completed Dropdown Info
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[2]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]")
	private WebElement depressionAssessmentCompletedDropdownInfo;
	
	//Cookie Button
	@FindBy(xpath="//h3[contains(text(),'Assessments')]")
	private WebElement assessmentsText;
	
	public void verifyDepressionCompleted() 
	{
		try
		{
			Thread.sleep(9000);
		}
		catch(Exception e)
		{
			
		}
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		JavascriptExecutor executor = (JavascriptExecutor) BrowserDriver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", Depression);
	    
		verifyElement.clickElement(Depression,"Depression");
		verifyElement.verifyBrowserElement(depressionAssessmentCompleted,"Depression Assessment Completed");
		verifyElement.verifyBrowserElement(depressionAssessmentCompletedResult,"Depression Assessment Completed Result");
		verifyElement.clickElement(depressionAssessmentCompletedDropdown, "Depression Assessment Completed Dropdown");
		verifyElement.verifyBrowserElement(depressionAssessmentCompletedDropdownInfo,"Depression Assessment Completed Dropdown Info");
		verifyElement.switchOutOfBrowserFrame();
	}
		
	//Anxiety Completed
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[3]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement anxietyAssessmentCompleted;
	
	//Anxiety Completed result
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[3]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[3]")
	private WebElement anxietyAssessmentCompletedResult;
	
	//Anxiety Completed Dropdown
	@FindBy(xpath="//div[contains(text(),'Anxiety')]")
	private WebElement anxietyAssessmentCompletedDropdown;
		
	//Anxiety Completed Dropdown Info
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[3]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]")
	private WebElement anxietyAssessmentCompletedDropdownInfo;
	
	public void verifyAnxietyCompleted() 
	{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(anxietyAssessmentCompleted,"Anxiety Assessment Completed");
		verifyElement.verifyBrowserElement(anxietyAssessmentCompletedResult,"Anxiety Assessment Completed Result");
		verifyElement.clickElement(anxietyAssessmentCompletedDropdown, "Anxiety Assessment Completed Dropdown");
		verifyElement.verifyBrowserElement(anxietyAssessmentCompletedDropdownInfo,"Anxiety Assessment Completed Dropdown Info");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Sleep Completed
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[4]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement sleepAssessmentCompleted;
	
	//Sleep Completed result
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[4]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[3]")
	private WebElement sleepAssessmentCompletedResult;
	
	//Sleep Completed Dropdown
	@FindBy(xpath="//div[contains(text(),'Sleep')]")
	private WebElement sleepAssessmentCompletedDropdown;
		
	//Sleep Completed Dropdown Info
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[4]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/div[1]/div[1]")
	private WebElement sleepAssessmentCompletedDropdownInfo;
	
	public void verifySleepCompleted() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(sleepAssessmentCompleted,"Sleep Assessment Completed");
		verifyElement.verifyBrowserElement(sleepAssessmentCompletedResult,"Sleep Assessment Completed Result");
		verifyElement.clickElement(sleepAssessmentCompletedDropdown, "Sleep Assessment Completed Dropdown");
		verifyElement.verifyBrowserElement(sleepAssessmentCompletedDropdownInfo,"Sleep Assessment Completed Dropdown Info");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Wellbeing Completed
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[5]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement wellbeingAssessmentCompleted;
	
	//Wellbeing Completed result
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[5]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[3]")
	private WebElement wellbeingAssessmentCompletedResult;
	
	//Wellbeing Completed Dropdown
	@FindBy(xpath="//div[contains(text(),'Wellbeing')]")
	private WebElement wellbeingAssessmentCompletedDropdown;
		
	//Wellbeing Completed Dropdown Info
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[5]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/div[1]/div[1]")
	private WebElement wellbeingAssessmentCompletedDropdownInfo;
	
	public void verifyWellbeingCompleted() 
	{
		
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		JavascriptExecutor executor = (JavascriptExecutor) BrowserDriver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", Footer);
	    
		verifyElement.verifyBrowserElement(wellbeingAssessmentCompleted,"Wellbeing Assessment Completed");
		verifyElement.verifyBrowserElement(wellbeingAssessmentCompletedResult,"Wellbeing Assessment Completed Result");
		verifyElement.clickElement(wellbeingAssessmentCompletedDropdown, "Wellbeing Assessment Completed Dropdown");
		verifyElement.verifyBrowserElement(wellbeingAssessmentCompletedDropdownInfo,"Wellbeing Assessment Completed Dropdown Info");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Resilience Completed
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[6]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement resilienceAssessmentCompleted;
	
	//Resilience Completed result
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[6]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[3]")
	private WebElement resilienceAssessmentCompletedResult;
	
	//Resilience Completed Dropdown
	@FindBy(xpath="//div[contains(text(),'Resilience')]")
	private WebElement resilienceAssessmentCompletedDropdown;
		
	//Resilience Completed Dropdown Info
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[6]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/div[1]/div[1]")
	private WebElement resilienceAssessmentCompletedDropdownInfo;
	
	public void verifyReslieneceCompleted() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(resilienceAssessmentCompleted,"Resilience Assessment Completed");
		verifyElement.verifyBrowserElement(resilienceAssessmentCompletedResult,"Resilience Assessment Completed Result");
		verifyElement.clickElement(resilienceAssessmentCompletedDropdown, "Resilience Assessment Completed Dropdown");
		verifyElement.verifyBrowserElement(resilienceAssessmentCompletedDropdownInfo,"Resilience Assessment Completed Dropdown Info");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Drinking Completed
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[7]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement drinkingAssessmentCompleted;
	
	//Drinking Completed result
	@FindBy(xpath="//body[1]/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[6]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/div[1]/a[1]/div[1]/div[3]")
	private WebElement drinkingAssessmentCompletedResult;
	
	//Drinking Completed Dropdown
	@FindBy(xpath="//div[contains(text(),'Drinking')]")
	private WebElement drinkingAssessmentCompletedDropdown;
		
	//Drinking Completed Dropdown Info
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessments[1]/div[2]/div[7]/mwba-complete-assessment-bar[1]/mat-expansion-panel[1]/div[1]/div[1]")
	private WebElement drinkingAssessmentCompletedDropdownInfo;
	
	public void verifyDrinkingCompleted() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(drinkingAssessmentCompleted,"Drinking Assessment Completed");
		verifyElement.verifyBrowserElement(drinkingAssessmentCompletedResult,"Drinking Assessment Completed Result");
		verifyElement.clickElement(drinkingAssessmentCompletedDropdown, "Drinking Assessment Completed Dropdown");
		verifyElement.verifyBrowserElement(drinkingAssessmentCompletedDropdownInfo,"Drinking Assessment Completed Dropdown Info");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Overall Feedback Block
	@FindBy(xpath="//body/mwba-app[1]/div[1]/mwba-dashboard[1]/div[2]/div[1]/mwba-assessment-feedback[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement overallFeedbackBlock;
	
	public void verifyOverallFeedback() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(overallFeedbackBlock,"O	verall Feedback Block");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//////////////////////////////
	
	//Question 1
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[2]/formly-wrapper-form-field/div/label")
	private WebElement q1;
	
	//Question 1 answer
	@FindBy(xpath="//*[@id=\"formly_4_radio_MWB_PRE_SCREENING_QUESTIONNAIRE_Q1_1_0\"]")
	private WebElement q1Yes;
	
	//Question 1 answer
	@FindBy(xpath="//*[@id=\"formly_4_radio_MWB_PRE_SCREENING_QUESTIONNAIRE_Q1_1_1\"]")
	private WebElement q1No;
	
	//Question 2
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[3]/formly-wrapper-form-field/div/label")
	private WebElement q2;
	
	//Question 2 answer
	@FindBy(xpath="//*[@id=\"formly_4_radio_MWB_PRE_SCREENING_QUESTIONNAIRE_Q1_1_0\"]")
	private WebElement q2Yes;
	
	//Question 2 answer
	@FindBy(xpath="//*[@id=\"formly_4_radio_MWB_PRE_SCREENING_QUESTIONNAIRE_Q2_2_1\"]")
	private WebElement q2No;
	
	//Question 3
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement q3;
	
	//Question 3 answer
	@FindBy(xpath="//*[@id=\"formly_4_radio_MWB_PRE_SCREENING_QUESTIONNAIRE_Q3_3_0\"]")
	private WebElement q3Yes;
	
	//Question 3 answer
	@FindBy(xpath="//*[@id=\"formly_4_radio_MWB_PRE_SCREENING_QUESTIONNAIRE_Q3_3_1\"]")
	private WebElement q3No;
	
	//Save And Continue Button
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/div[2]/div[2]/div/button")
	private WebElement saveContinueButton;
	
	//Cancel Button
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/div[2]/div[1]/button")
	private WebElement cancelButton;
	
	public void verifyAssessment1() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(q1,"Question 1");
		verifyElement.verifyBrowserElement(q1Yes,"Question 1 Yes");
		verifyElement.verifyBrowserElement(q1No,"Question 1 No");
		verifyElement.verifyBrowserElement(q2,"Question 2");
		verifyElement.verifyBrowserElement(q2Yes,"Question 2 Yes");
		verifyElement.verifyBrowserElement(q2No,"Question 2 No");
		verifyElement.verifyBrowserElement(q3,"Question 3");
		verifyElement.verifyBrowserElement(q3Yes,"Question 3 Yes");
		verifyElement.verifyBrowserElement(q3No,"Question 3 No");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void completeAssessment1() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		verifyElement.clickElement(q1Yes,"Question 1 Yes");
		
		verifyElement.clickElement(q2Yes,"Question 2 Yes");
		
		verifyElement.clickElement(q3Yes,"Question 3 Yes");
		
		verifyElement.clickElement(saveContinueButton,"Save Continue Button");
		
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//////////////////////Depression Questions//////////////////////////
	
	//Depression Q1
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ1;
	
	//Depression Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q1_1_0\"]")
	private WebElement depressionQ1NotAtAll;
	
	//Depression Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q1_1_1\"]")
	private WebElement depressionQ1SeveralDays;
	
	//Depression Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q1_1_2\"]")
	private WebElement depressionQ1MoreThanHalf;
	
	//Depression Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q1_1_3\"]")
	private WebElement depressionQ1NearlyEveryday;
	
	//Depression Q2
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[3]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ2;
	
	//Depression Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q2_2_0\"]")
	private WebElement depressionQ2NotAtAll;
	
	//Depression Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q2_2_1\"]")
	private WebElement depressionQ2SeveralDays;
	
	//Depression Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q2_2_2\"]")
	private WebElement depressionQ2MoreThanHalf;
	
	//Depression Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q2_2_3\"]")
	private WebElement depressionQ2NearlyEveryday;
	
	//Depression Q3
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ3;
	
	//Depression Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q3_3_0\"]")
	private WebElement depressionQ3NotAtAll;
	
	//Depression Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q3_3_1\"]")
	private WebElement depressionQ3SeveralDays;
	
	//Depression Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q3_3_2\"]")
	private WebElement depressionQ3MoreThanHalf;
	
	//Depression Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q3_3_3\"]")
	private WebElement depressionQ3NearlyEveryday;
	
	//Depression Q4
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[5]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ4;
	
	//Depression Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q4_4_0\"]")
	private WebElement depressionQ4NotAtAll;
	
	//Depression Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q4_4_1\"]")
	private WebElement depressionQ4SeveralDays;
	
	//Depression Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q4_4_2\"]")
	private WebElement depressionQ4MoreThanHalf;
	
	//Depression Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_PHQ9_Q4_4_3\"]")
	private WebElement depressionQ4NearlyEveryday;
	
	//Depression Q5
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[6]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ5;
	
	//Depression Q5 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q5_5_0\"]")
	private WebElement depressionQ5NotAtAll;
	
	//Depression Q5 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q5_5_1\"]")
	private WebElement depressionQ5SeveralDays;
	
	//Depression Q5 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q5_5_2\"]")
	private WebElement depressionQ5MoreThanHalf;
	
	//Depression Q5 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q5_5_3\"]")
	private WebElement depressionQ5NearlyEveryday;
	
	//Depression Q6
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[7]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ6;
	
	//Depression Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_0\"]")
	private WebElement depressionQ6NotAtAll;
	
	//Depression Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_1\"]")
	private WebElement depressionQ6SeveralDays;
	
	//Depression Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_2\"]")
	private WebElement depressionQ6MoreThanHalf;
	
	//Depression Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_3\"]")
	private WebElement depressionQ6NearlyEveryday;
	
	//Depression Q7
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[8]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ7;
	
	//Depression Q7 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q7_7_0\"]")
	private WebElement depressionQ7NotAtAll;
	
	//Depression Q7 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q7_7_1\"]")
	private WebElement depressionQ7SeveralDays;
	
	//Depression Q7 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q7_7_2\"]")
	private WebElement depressionQ7MoreThanHalf;
	
	//Depression Q7 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q7_7_3\"]")
	private WebElement depressionQ7NearlyEveryday;
	
	//Depression Q8
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[9]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ8;
	
	//Depression Q8 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q8_8_0\"]")
	private WebElement depressionQ8NotAtAll;
	
	//Depression Q8 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q8_8_1\"]")
	private WebElement depressionQ8SeveralDays;
	
	//Depression Q8 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q8_8_2\"]")
	private WebElement depressionQ8MoreThanHalf;
	
	//Depression Q8 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q8_8_3\"]")
	private WebElement depressionQ8NearlyEveryday;
	
	//Depression Q9
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[9]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ9;
	
	//Depression Q9 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q8_8_0\"]")
	private WebElement depressionQ9NotAtAll;
	
	//Depression Q9 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q8_8_1\"]")
	private WebElement depressionQ9SeveralDays;
	
	//Depression Q9 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q8_8_2\"]")
	private WebElement depressionQ9MoreThanHalf;
	
	//Depression Q9 answer
	@FindBy(xpath="/html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[10]/formly-wrapper-form-field/div/label")
	private WebElement depressionQ9NearlyEveryday;
	
	public void verifyDepressionAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(depressionQ1,"Depression Question 1");
		verifyElement.verifyBrowserElement(depressionQ1NotAtAll,"Depression Question 1 Not At All");
		verifyElement.verifyBrowserElement(depressionQ1SeveralDays,"Depression Question 1 Several Days");
		verifyElement.verifyBrowserElement(depressionQ1MoreThanHalf,"Depression Question 1 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ1NearlyEveryday,"Depression Question 1 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ2,"Question 2 ");
		verifyElement.verifyBrowserElement(depressionQ2NotAtAll,"Depression Question 2 Not At All");
		verifyElement.verifyBrowserElement(depressionQ2SeveralDays,"Depression Question 2 Several Days");
		verifyElement.verifyBrowserElement(depressionQ2MoreThanHalf,"Depression Question 2 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ2NearlyEveryday,"Depression Question 2 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ3,"Question 3 ");
		verifyElement.verifyBrowserElement(depressionQ3NotAtAll,"Depression Question 3 Not At All");
		verifyElement.verifyBrowserElement(depressionQ3SeveralDays,"Depression Question 3 Several Days");
		verifyElement.verifyBrowserElement(depressionQ3MoreThanHalf,"Depression Question 3 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ3NearlyEveryday,"Depression Question 3 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ4,"Question 4 ");
		verifyElement.verifyBrowserElement(depressionQ4NotAtAll,"Depression Question 4 Not At All");
		verifyElement.verifyBrowserElement(depressionQ4SeveralDays,"Depression Question 4 Several Days");
		verifyElement.verifyBrowserElement(depressionQ4MoreThanHalf,"Depression Question 4 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ4NearlyEveryday,"Depression Question 4 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ5,"Question 5 ");
		verifyElement.verifyBrowserElement(depressionQ5NotAtAll,"Depression Question 5 Not At All");
		verifyElement.verifyBrowserElement(depressionQ5SeveralDays,"Depression Question 5 Several Days");
		verifyElement.verifyBrowserElement(depressionQ5MoreThanHalf,"Depression Question 5 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ5NearlyEveryday,"Depression Question 5 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ6,"Question 6 ");
		verifyElement.verifyBrowserElement(depressionQ6NotAtAll,"Depression Question 6 Not At All");
		verifyElement.verifyBrowserElement(depressionQ6SeveralDays,"Depression Question 6 Several Days");
		verifyElement.verifyBrowserElement(depressionQ6MoreThanHalf,"Depression Question 6 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ6NearlyEveryday,"Depression Question 6 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ7,"Question 7 ");
		verifyElement.verifyBrowserElement(depressionQ7NotAtAll,"Depression Question 7 Not At All");
		verifyElement.verifyBrowserElement(depressionQ7SeveralDays,"Depression Question 7 Several Days");
		verifyElement.verifyBrowserElement(depressionQ7MoreThanHalf,"Depression Question 7 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ7NearlyEveryday,"Depression Question 7 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ8,"Question 8 ");
		verifyElement.verifyBrowserElement(depressionQ8NotAtAll,"Depression Question 8 Not At All");
		verifyElement.verifyBrowserElement(depressionQ8SeveralDays,"Depression Question 8 Several Days");
		verifyElement.verifyBrowserElement(depressionQ8MoreThanHalf,"Depression Question 8 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ8NearlyEveryday,"Depression Question 8 Nearly Everyday");
		verifyElement.verifyBrowserElement(depressionQ9,"Question 9 ");
		verifyElement.verifyBrowserElement(depressionQ9NotAtAll,"Depression Question 9 Not At All");
		verifyElement.verifyBrowserElement(depressionQ9SeveralDays,"Depression Question 9 Several Days");
		verifyElement.verifyBrowserElement(depressionQ9MoreThanHalf,"Depression Question 9 More Than Half");
		verifyElement.verifyBrowserElement(depressionQ9NearlyEveryday,"Depression Question 9 Nearly Everyday");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void completeDepressionAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		verifyElement.clickElement(depressionQ1NotAtAll,"Depression Question 1 Not At All");
		
		verifyElement.clickElement(depressionQ2NotAtAll,"Depression Question 2 Not At All");
		
		verifyElement.clickElement(depressionQ3NotAtAll,"Depression Question 3 Not At All");
		
		verifyElement.clickElement(depressionQ4NotAtAll,"Depression Question 4 Not At All");
		
		verifyElement.clickElement(depressionQ5NotAtAll,"Depression Question 5 Not At All");
		
		verifyElement.clickElement(depressionQ6NotAtAll,"Depression Question 6 Not At All");
		
		verifyElement.clickElement(depressionQ7NotAtAll,"Depression Question 7 Not At All");
		
		verifyElement.clickElement(depressionQ8NotAtAll,"Depression Question 8 Not At All");
		
		verifyElement.clickElement(depressionQ9NotAtAll,"Depression Question 9 Not At All");
		
		verifyElement.clickElement(saveContinueButton,"Save Continue Button");
		
		verifyElement.switchOutOfBrowserFrame();
	}
	
	/////////////////////////Anxiety Questions///////////////////////
	//Anxiety Q1
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[2]/formly-wrapper-form-field/div/label")
	private WebElement anxietyQ1;
	
	//Anxiety Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q1_1_0\"]")
	private WebElement anxietyQ1NotAtAll;
	
	//Anxiety Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q1_1_1\"]")
	private WebElement anxietyQ1SeveralDays;
	
	//Anxiety Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q1_1_2\"]")
	private WebElement anxietyQ1MoreThanHalf;
	
	//Anxiety Q1 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q1_1_3\"]")
	private WebElement anxietyQ1NearlyEveryday;
	
	//Anxiety Q2
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[3]/formly-wrapper-form-field/div/label")
	private WebElement anxietyQ2;
	
	//Anxiety Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q2_2_0\"]")
	private WebElement anxietyQ2NotAtAll;
	
	//Anxiety Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q2_2_1\"]")
	private WebElement anxietyQ2SeveralDays;
	
	//Anxiety Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q2_2_2\"]")
	private WebElement anxietyQ2MoreThanHalf;
	
	//Anxiety Q2 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q2_2_3\"]")
	private WebElement anxietyQ2NearlyEveryday;
	
	//Anxiety Q3
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement anxietyQ3;
	
	//Anxiety Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q3_3_0\"]")
	private WebElement anxietyQ3NotAtAll;
	
	//Anxiety Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q3_3_1\"]")
	private WebElement anxietyQ3SeveralDays;
	
	//Anxiety Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q3_3_2\"]")
	private WebElement anxietyQ3MoreThanHalf;
	
	//Anxiety Q3 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q3_3_3\"]")
	private WebElement anxietyQ3NearlyEveryday;
	
	//Anxiety Q4
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[5]/formly-wrapper-form-field/div/label")
	private WebElement anxietyQ4;
	
	//Anxiety Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q4_4_0\"]")
	private WebElement anxietyQ4NotAtAll;
	
	//Anxiety Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q4_4_1\"]")
	private WebElement anxietyQ4SeveralDays;
	
	//Anxiety Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q4_4_2\"]")
	private WebElement anxietyQ4MoreThanHalf;
	
	//Anxiety Q4 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q4_4_3\"]")
	private WebElement anxietyQ4NearlyEveryday;
	
	//Anxiety Q5
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[6]/formly-wrapper-form-field/div/label")
	private WebElement anxietyQ5;
	
	//Anxiety Q5 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q5_5_0\"]")
	private WebElement anxietyQ5NotAtAll;
	
	//Anxiety Q5 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q5_5_1\"]")
	private WebElement anxietyQ5SeveralDays;
	
	//Anxiety Q5 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q5_5_\"]")
	private WebElement anxietyQ5MoreThanHalf;
	
	//Anxiety Q5 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q5_5_\"]")
	private WebElement anxietyQ5NearlyEveryday;
	
	//Anxiety Q6
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[7]/formly-wrapper-form-field/div/label")
	private WebElement anxietyQ6;
	
	//Anxiety Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_0\"]")
	private WebElement anxietyQ6NotAtAll;
	
	//Anxiety Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_1\"]")
	private WebElement anxietyQ6SeveralDays;
	
	//Anxiety Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_2\"]")
	private WebElement anxietyQ6MoreThanHalf;
	
	//Anxiety Q6 answer
	@FindBy(xpath="//*[@id=\"formly_10_radio_MWB_PHQ9_Q6_6_3\"]")
	private WebElement anxietyQ6NearlyEveryday;
	
	//Anxiety Q7
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[8]/formly-wrapper-form-field/div/label")
	private WebElement anxietyQ7;
	
	//Anxiety Q7 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q7_7_0\"]")
	private WebElement anxietyQ7NotAtAll;
	
	//Anxiety Q7 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q7_7_1\"]")
	private WebElement anxietyQ7SeveralDays;
	
	//Anxiety Q7 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q7_7_2\"]")
	private WebElement anxietyQ7MoreThanHalf;
	
	//Anxiety Q7 answer
	@FindBy(xpath="//*[@id=\"formly_18_radio_MWB_GAD7_Q7_7_3\"]")
	private WebElement anxietyQ7NearlyEveryday;
	
	public void verifyAnxietyAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(anxietyQ1,"anxiety Question 1");
		verifyElement.verifyBrowserElement(anxietyQ1NotAtAll,"anxiety Question 1 Not At All");
		verifyElement.verifyBrowserElement(anxietyQ1SeveralDays,"anxiety Question 1 Several Days");
		verifyElement.verifyBrowserElement(anxietyQ1MoreThanHalf,"anxiety Question 1 More Than Half");
		verifyElement.verifyBrowserElement(anxietyQ1NearlyEveryday,"anxiety Question 1 Nearly Everyday");
		verifyElement.verifyBrowserElement(anxietyQ2,"Question 2 ");
		verifyElement.verifyBrowserElement(anxietyQ2NotAtAll,"anxiety Question 2 Not At All");
		verifyElement.verifyBrowserElement(anxietyQ2SeveralDays,"anxiety Question 2 Several Days");
		verifyElement.verifyBrowserElement(anxietyQ2MoreThanHalf,"anxiety Question 2 More Than Half");
		verifyElement.verifyBrowserElement(anxietyQ2NearlyEveryday,"anxiety Question 2 Nearly Everyday");
		verifyElement.verifyBrowserElement(anxietyQ3,"Question 3 ");
		verifyElement.verifyBrowserElement(anxietyQ3NotAtAll,"anxiety Question 3 Not At All");
		verifyElement.verifyBrowserElement(anxietyQ3SeveralDays,"anxiety Question 3 Several Days");
		verifyElement.verifyBrowserElement(anxietyQ3MoreThanHalf,"anxiety Question 3 More Than Half");
		verifyElement.verifyBrowserElement(anxietyQ3NearlyEveryday,"anxiety Question 3 Nearly Everyday");
		verifyElement.verifyBrowserElement(anxietyQ4,"Question 4 ");
		verifyElement.verifyBrowserElement(anxietyQ4NotAtAll,"anxiety Question 4 Not At All");
		verifyElement.verifyBrowserElement(anxietyQ4SeveralDays,"anxiety Question 4 Several Days");
		verifyElement.verifyBrowserElement(anxietyQ4MoreThanHalf,"anxiety Question 4 More Than Half");
		verifyElement.verifyBrowserElement(anxietyQ4NearlyEveryday,"anxiety Question 4 Nearly Everyday");
		verifyElement.verifyBrowserElement(anxietyQ5,"Question 5 ");
		verifyElement.verifyBrowserElement(anxietyQ5NotAtAll,"anxiety Question 5 Not At All");
		verifyElement.verifyBrowserElement(anxietyQ5SeveralDays,"anxiety Question 5 Several Days");
		verifyElement.verifyBrowserElement(anxietyQ5MoreThanHalf,"anxiety Question 5 More Than Half");
		verifyElement.verifyBrowserElement(anxietyQ5NearlyEveryday,"anxiety Question 5 Nearly Everyday");
		verifyElement.verifyBrowserElement(anxietyQ6,"Question 6 ");
		verifyElement.verifyBrowserElement(anxietyQ6NotAtAll,"anxiety Question 6 Not At All");
		verifyElement.verifyBrowserElement(anxietyQ6SeveralDays,"anxiety Question 6 Several Days");
		verifyElement.verifyBrowserElement(anxietyQ6MoreThanHalf,"anxiety Question 6 More Than Half");
		verifyElement.verifyBrowserElement(anxietyQ6NearlyEveryday,"anxiety Question 6 Nearly Everyday");
		verifyElement.verifyBrowserElement(anxietyQ7,"Question 7 ");
		verifyElement.verifyBrowserElement(anxietyQ7NotAtAll,"anxiety Question 7 Not At All");
		verifyElement.verifyBrowserElement(anxietyQ7SeveralDays,"anxiety Question 7 Several Days");
		verifyElement.verifyBrowserElement(anxietyQ7MoreThanHalf,"anxiety Question 7 More Than Half");
		verifyElement.verifyBrowserElement(anxietyQ7NearlyEveryday,"anxiety Question 7 Nearly Everyday");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void completeAnxietyAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		verifyElement.clickElement(anxietyQ1NotAtAll,"anxiety Question 1 Not At All");
		
		verifyElement.clickElement(anxietyQ2NotAtAll,"anxiety Question 2 Not At All");
		
		verifyElement.clickElement(anxietyQ3NotAtAll,"anxiety Question 3 Not At All");
		
		verifyElement.clickElement(anxietyQ4NotAtAll,"anxiety Question 4 Not At All");
		
		verifyElement.clickElement(anxietyQ5NotAtAll,"anxiety Question 5 Not At All");
		
		verifyElement.clickElement(anxietyQ6NotAtAll,"anxiety Question 6 Not At All");
		
		verifyElement.clickElement(anxietyQ7NotAtAll,"anxiety Question 7 Not At All");
		
		verifyElement.clickElement(saveContinueButton,"Save Continue Button");
		
		verifyElement.switchOutOfBrowserFrame();
	}
	
	////////////////////////////////////Sleep Questions///////////////////
	//Sleep Q1
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[2]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ1;
	
	//sleep Q1 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q1_1_0\"]")
	private WebElement sleepQ1NotAtAll;
	
	//sleep Q1 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q1_1_1\"]")
	private WebElement sleepQ1ALilBit;
	
	//sleep Q1 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q1_1_2\"]")
	private WebElement sleepQ1Somewhat;
	
	//sleep Q1 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q1_1_3\"]")
	private WebElement sleepQ1QuiteAbit;
	
	//sleep Q1 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q1_1_4\"]")
	private WebElement sleepQ1VeryMuch;
	
	//sleep Q2
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[3]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ2;
	
	//sleep Q2 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q2_2_0\"]")
	private WebElement sleepQ2NotAtAll;
	
	//sleep Q2 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q2_2_1\"]")
	private WebElement sleepQ2ALilBit;
	
	//sleep Q2 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q2_2_2\"]")
	private WebElement sleepQ2Somewhat;
	
	//sleep Q2 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q2_2_3\"]")
	private WebElement sleepQ2QuiteAbit;
	
	//sleep Q2 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q2_2_4\"]")
	private WebElement sleepQ2VeryMuch;
	
	//sleep Q3
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ3;
	
	//sleep Q3 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q3_3_0\"]")
	private WebElement sleepQ3NotAtAll;
	
	//sleep Q3 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q3_3_1\"]")
	private WebElement sleepQ3ALilBit;
	
	//sleep Q3 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q3_3_2\"]")
	private WebElement sleepQ3Somewhat;
	
	//sleep Q3 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q3_3_3\"]")
	private WebElement sleepQ3QuiteAbit;
	
	//sleep Q3 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q3_3_4\"]")
	private WebElement sleepQ3VeryMuch;
	
	//sleep Q4
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[5]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ4;
	
	//sleep Q4 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q4_4_0\"]")
	private WebElement sleepQ4NotAtAll;
	
	//sleep Q4 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q4_4_1\"]")
	private WebElement sleepQ4ALilBit;
	
	//sleep Q4 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q4_4_2\"]")
	private WebElement sleepQ4Somewhat;
	
	//sleep Q4 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q4_4_3\"]")
	private WebElement sleepQ4QuiteAbit;
	
	//sleep Q4 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q4_4_4\"]")
	private WebElement sleepQ4VeryMuch;
	
	//sleep Q5
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[6]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ5;
	
	//sleep Q5 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q5_5_0\"]")
	private WebElement sleepQ5Never;
	
	//sleep Q5 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q5_5_1\"]")
	private WebElement sleepQ5Rarely;
	
	//sleep Q5 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q5_5_2\"]")
	private WebElement sleepQ5Sometimes;
	
	//sleep Q5 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q5_5_3\"]")
	private WebElement sleepQ5Often;
	
	//sleep Q5 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q5_5_4\"]")
	private WebElement sleepQ5Always;
	
	//sleep Q6
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[7]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ6;
	
	//sleep Q6 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q6_6_0\"]")
	private WebElement sleepQ6Never;
	
	//sleep Q6 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q6_6_1\"]")
	private WebElement sleepQ6Rarely;
	
	//sleep Q6 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q6_6_2\"]")
	private WebElement sleepQ6Sometimes;
	
	//sleep Q6 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q6_6_3\"]")
	private WebElement sleepQ6Often;
	
	//sleep Q6 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q6_6_4\"]")
	private WebElement sleepQ6Always;
	
	//sleep Q7
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[8]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ7;
	
	//sleep Q7 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q7_7_0\"]")
	private WebElement sleepQ7Never;
	
	//sleep Q7 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q7_7_1\"]")
	private WebElement sleepQ7Rarely;
	
	//sleep Q7 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q7_7_2\"]")
	private WebElement sleepQ7Sometimes;
	
	//sleep Q7 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q7_7_3\"]")
	private WebElement sleepQ7Often;
	
	//sleep Q7 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q7_7_4\"]")
	private WebElement sleepQ7Always;
	
	//sleep Q8
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[9]/formly-wrapper-form-field/div/label")
	private WebElement sleepQ8;
	
	//sleep Q8 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q8_8_0\"]")
	private WebElement sleepQ8VeryPoor;
	
	//sleep Q8 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q8_8_1\"]")
	private WebElement sleepQ8Poor;
	
	//sleep Q8 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q8_8_2\"]")
	private WebElement sleepQ8Fair;
	
	//sleep Q8 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q8_8_3\"]")
	private WebElement sleepQ8Good;
	
	//sleep Q8 answer
	@FindBy(xpath="//*[@id=\"formly_9_radio_MWB_PROMIS_Q8_8_\"]")
	private WebElement sleepQ8VeryGood;
	
	public void verifySleepAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(sleepQ1,"sleep Question 1");
		verifyElement.verifyBrowserElement(sleepQ1NotAtAll,"sleep Question 1 Not At All");
		verifyElement.verifyBrowserElement(sleepQ1ALilBit,"sleep Question 1 A Lil Bit");
		verifyElement.verifyBrowserElement(sleepQ1Somewhat,"sleep Question 1 Somewhat");
		verifyElement.verifyBrowserElement(sleepQ1QuiteAbit,"sleep Question 1 Quite Abit");
		verifyElement.verifyBrowserElement(sleepQ1VeryMuch,"sleep Question 1 Very Much");
		verifyElement.verifyBrowserElement(sleepQ2,"Question 2 ");
		verifyElement.verifyBrowserElement(sleepQ2NotAtAll,"sleep Question 2 Not At All");
		verifyElement.verifyBrowserElement(sleepQ2ALilBit,"sleep Question 2 A Lil Bit");
		verifyElement.verifyBrowserElement(sleepQ2Somewhat,"sleep Question 2 Somewhat");
		verifyElement.verifyBrowserElement(sleepQ2QuiteAbit,"sleep Question 2 Quite Abit");
		verifyElement.verifyBrowserElement(sleepQ2VeryMuch,"sleep Question 2 Very Much");
		verifyElement.verifyBrowserElement(sleepQ3,"Question 3 ");
		verifyElement.verifyBrowserElement(sleepQ3NotAtAll,"sleep Question 3 Not At All");
		verifyElement.verifyBrowserElement(sleepQ3ALilBit,"sleep Question 3 A Lil Bit");
		verifyElement.verifyBrowserElement(sleepQ3Somewhat,"sleep Question 3 Somewhat");
		verifyElement.verifyBrowserElement(sleepQ3QuiteAbit,"sleep Question 3 Quite Abit");
		verifyElement.verifyBrowserElement(sleepQ3VeryMuch,"sleep Question 3 Very Much");
		verifyElement.verifyBrowserElement(sleepQ4,"Question 4 ");
		verifyElement.verifyBrowserElement(sleepQ4NotAtAll,"sleep Question 4 Not At All");
		verifyElement.verifyBrowserElement(sleepQ4ALilBit,"sleep Question 4 A Lil Bit");
		verifyElement.verifyBrowserElement(sleepQ4Somewhat,"sleep Question 4 Somewhat");
		verifyElement.verifyBrowserElement(sleepQ4QuiteAbit,"sleep Question 4 Quite Abit");
		verifyElement.verifyBrowserElement(sleepQ4VeryMuch,"sleep Question 4 Very Much");
		verifyElement.verifyBrowserElement(sleepQ5,"Question 5 ");
		verifyElement.verifyBrowserElement(sleepQ5Never,"sleep Question 5 Never");
		verifyElement.verifyBrowserElement(sleepQ5Rarely,"sleep Question 5 Rarely");
		verifyElement.verifyBrowserElement(sleepQ5Sometimes,"sleep Question 5 Sometimes");
		verifyElement.verifyBrowserElement(sleepQ5Often,"sleep Question 5 Often");
		verifyElement.verifyBrowserElement(sleepQ5Always,"sleep Question 5 Always");
		verifyElement.verifyBrowserElement(sleepQ6,"Question 6 ");
		verifyElement.verifyBrowserElement(sleepQ6Never,"sleep Question 6 Never");
		verifyElement.verifyBrowserElement(sleepQ6Rarely,"sleep Question 6 Rarely");
		verifyElement.verifyBrowserElement(sleepQ6Sometimes,"sleep Question 6 Sometimes");
		verifyElement.verifyBrowserElement(sleepQ6Often,"sleep Question 6 Often");
		verifyElement.verifyBrowserElement(sleepQ6Always,"sleep Question 6 Always");
		verifyElement.verifyBrowserElement(sleepQ7,"Question 7 ");
		verifyElement.verifyBrowserElement(sleepQ7Never,"sleep Question 7 Never");
		verifyElement.verifyBrowserElement(sleepQ7Rarely,"sleep Question 7 Rarely");
		verifyElement.verifyBrowserElement(sleepQ7Sometimes,"sleep Question 7 Sometimes");
		verifyElement.verifyBrowserElement(sleepQ7Often,"sleep Question 7 Often");
		verifyElement.verifyBrowserElement(sleepQ7Always,"sleep Question 7 Always");
		verifyElement.verifyBrowserElement(sleepQ8,"Question 8 ");
		verifyElement.verifyBrowserElement(sleepQ8VeryPoor,"sleep Question 8 Very Poor");
		verifyElement.verifyBrowserElement(sleepQ8Poor,"sleep Question 8 Poor");
		verifyElement.verifyBrowserElement(sleepQ8Fair,"sleep Question 8 Fair");
		verifyElement.verifyBrowserElement(sleepQ8Good,"sleep Question 8 Good");
		verifyElement.verifyBrowserElement(sleepQ8VeryGood,"sleep Question 8 Very Good");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void completeSleepAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		verifyElement.clickElement(sleepQ1NotAtAll,"sleep Question 1 Not At All");
		
		verifyElement.clickElement(sleepQ2NotAtAll,"sleep Question 2 Not At All");
		
		verifyElement.clickElement(sleepQ3NotAtAll,"sleep Question 3 Not At All");
		
		verifyElement.clickElement(sleepQ4NotAtAll,"sleep Question 4 Not At All");
		
		verifyElement.clickElement(sleepQ5Never,"sleep Question 5 Never");
		
		verifyElement.clickElement(sleepQ6Never,"sleep Question 6 Never");
		
		verifyElement.clickElement(sleepQ7Never,"sleep Question 7 Never");
		
		verifyElement.clickElement(sleepQ8VeryPoor,"sleep Question 8 Very Poor");
		
		verifyElement.clickElement(saveContinueButton,"Save Continue Button");
		
		verifyElement.switchOutOfBrowserFrame();
	}
	
	/////////////////////////////////WellBeing Questions///////////////
	
	//wellbeing Q1
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[2]/formly-wrapper-form-field/div/label")
	private WebElement wellbeingQ1;
	
	//wellbeing Q1 answer
	@FindBy(xpath="//*[@id=\"formly_17_input_MWB_PERSONAL_WELLNESS_Q1_1\"]")
	private WebElement wellbeingQ1Answer;
	
	//wellbeing Q2
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[3]/formly-wrapper-form-field/div/label")
	private WebElement wellbeingQ2;
	
	//wellbeing Q2 answer
	@FindBy(xpath="//*[@id=\"formly_17_input_MWB_PERSONAL_WELLNESS_Q2_2\"]")
	private WebElement wellbeingQ2Answer;
	
	//wellbeing Q3
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement wellbeingQ3;
	
	//wellbeing Q3 answer
	@FindBy(xpath="//*[@id=\"formly_17_input_MWB_PERSONAL_WELLNESS_Q3_3\"]")
	private WebElement wellbeingQ3Answer;
	
	//wellbeing Q4
	@FindBy(xpath="/html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[5]/formly-wrapper-form-field/div/label")
	private WebElement wellbeingQ4;
	
	//wellbeing Q4 answer
	@FindBy(xpath="//*[@id=\"formly_17_input_MWB_PERSONAL_WELLNESS_Q4_4\"]")
	private WebElement wellbeingQ4Answer;
	
	//wellbeing Q5
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[6]/formly-wrapper-form-field/div/label")
	private WebElement wellbeingQ5;
	
	//wellbeing Q5 answer
	@FindBy(xpath="//*[@id=\"formly_17_input_MWB_PERSONAL_WELLNESS_Q5_5\"]")
	private WebElement wellbeingQ5Answer;
	
	//wellbeing Q6
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[7]/formly-wrapper-form-field/div/label")
	private WebElement wellbeingQ6;
	
	//wellbeing Q6 answer
	@FindBy(xpath="//*[@id=\"formly_17_input_MWB_PERSONAL_WELLNESS_Q6_6\"]")
	private WebElement wellbeingQ6Answer;
	
	//wellbeing Q7
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[8]/formly-wrapper-form-field/div/label")
	private WebElement wellbeingQ7;
	
	//wellbeing Q7 answer
	@FindBy(xpath="//*[@id=\"formly_17_input_MWB_PERSONAL_WELLNESS_Q7_7\"]")
	private WebElement wellbeingQ7Answer;
	
	public void verifyWellbeingAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(wellbeingQ1,"wellbeing Question 1");
		verifyElement.verifyBrowserElement(wellbeingQ1Answer,"wellbeing Question 1 Answer");
		verifyElement.verifyBrowserElement(wellbeingQ2,"Question 2 ");
		verifyElement.verifyBrowserElement(wellbeingQ2Answer,"wellbeing Question 2 Answer");
		verifyElement.verifyBrowserElement(wellbeingQ3,"Question 3 ");
		verifyElement.verifyBrowserElement(wellbeingQ3Answer,"wellbeing Question 3 Answer");
		verifyElement.verifyBrowserElement(wellbeingQ4,"Question 4 ");
		verifyElement.verifyBrowserElement(wellbeingQ4Answer,"wellbeing Question 4 Answer");
		verifyElement.verifyBrowserElement(wellbeingQ5,"Question 5 ");
		verifyElement.verifyBrowserElement(wellbeingQ5Answer,"wellbeing Question 5 Answer");
		verifyElement.verifyBrowserElement(wellbeingQ6,"Question 6 ");
		verifyElement.verifyBrowserElement(wellbeingQ6Answer,"wellbeing Question 6 Answer");
		verifyElement.verifyBrowserElement(wellbeingQ7,"Question 7 ");
		verifyElement.verifyBrowserElement(wellbeingQ7Answer,"sleep Question 7 Answer");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void completeWellbeingAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		verifyElement.clickElement(wellbeingQ1Answer,"wellbeing Question 1 Answer");
		verifyElement.sendKeys(wellbeingQ1Answer,"1","wellbeing Question 1 Answer");
		
		verifyElement.clickElement(wellbeingQ2Answer,"wellbeing Question 2 Answer");
		verifyElement.sendKeys(wellbeingQ2Answer,"1","wellbeing Question 2 Answer");
		
		verifyElement.clickElement(wellbeingQ3Answer,"wellbeing Question 3 Answer");
		verifyElement.sendKeys(wellbeingQ3Answer,"1","wellbeing Question 3 Answer");
		
		verifyElement.clickElement(wellbeingQ4Answer,"wellbeing Question 4 Answer");
		verifyElement.sendKeys(wellbeingQ4Answer,"1","wellbeing Question 4 Answer");
		
		verifyElement.clickElement(wellbeingQ5Answer,"wellbeing Question 5 Answer");
		verifyElement.sendKeys(wellbeingQ5Answer,"1","wellbeing Question 5 Answer");
		
		verifyElement.clickElement(wellbeingQ6Answer,"wellbeing Question 6 Answer");
		verifyElement.sendKeys(wellbeingQ6Answer,"1","wellbeing Question 6 Answer");
		
		verifyElement.clickElement(wellbeingQ7Answer,"sleep Question 7 Answer");
		verifyElement.sendKeys(wellbeingQ7Answer,"1","sleep Question 7 Answer");
		
		verifyElement.clickElement(saveContinueButton,"Save Continue Button");
		
		verifyElement.switchOutOfBrowserFrame();
	}
	///////////////////////////Reslience Questions//////////////////////
	//reslience Q1
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[2]/formly-wrapper-form-field/div/label")
	private WebElement reslienceQ1;
	
	//reslience Q1 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q1_1_0\"]")
	private WebElement reslienceQ1StronglyDisagree;
	
	//reslience Q1 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q1_1_1\"]")
	private WebElement reslienceQ1Disagree;
	
	//reslience Q1 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q1_1_2\"]")
	private WebElement reslienceQ1Neutral;
	
	//reslience Q1 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q1_1_3\"]")
	private WebElement reslienceQ1Agree;
	
	//reslience Q1 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q1_1_4\"]")
	private WebElement reslienceQ1StronglyAgree;
	
	//reslience Q2
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[3]/formly-wrapper-form-field/div/label")
	private WebElement reslienceQ2;
	
	//reslience Q2 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q2_2_0\"]")
	private WebElement reslienceQ2StronglyDisagree;
	
	//reslience Q2 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q2_2_1\"]")
	private WebElement reslienceQ2Disagree;
	
	//reslience Q2 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q2_2_2\"]")
	private WebElement reslienceQ2Neutral;
	
	//reslience Q2 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q2_2_3\"]")
	private WebElement reslienceQ2Agree;
	
	//reslience Q2 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q2_2_4\"]")
	private WebElement reslienceQ2StronglyAgree;
	
	//reslience Q3
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement reslienceQ3;
	
	//reslience Q3 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q3_3_0\"]")
	private WebElement reslienceQ3StronglyDisagree;
	
	//reslience Q3 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q3_3_1\"]")
	private WebElement reslienceQ3Disagree;
	
	//reslience Q3 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q3_3_2\"]")
	private WebElement reslienceQ3Neutral;
	
	//reslience Q3 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q3_3_3\"]")
	private WebElement reslienceQ3Agree;
	
	//reslience Q3 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q3_3_4\"]")
	private WebElement reslienceQ3StronglyAgree;
	
	//reslience Q4
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[5]/formly-wrapper-form-field/div/label")
	private WebElement reslienceQ4;
	
	//reslience Q4 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q4_4_0\"]")
	private WebElement reslienceQ4StronglyDisagree;
	
	//reslience Q4 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q4_4_1\"]")
	private WebElement reslienceQ4Disagree;
	
	//reslience Q4 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q4_4_2\"]")
	private WebElement reslienceQ4Neutral;
	
	//reslience Q4 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q4_4_3\"]")
	private WebElement reslienceQ4Agree;
	
	//reslience Q4 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q4_4_4\"]")
	private WebElement reslienceQ4StronglyAgree;
	
	//reslience Q5
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[6]/formly-wrapper-form-field/div/label")
	private WebElement reslienceQ5;
	
	//reslience Q5 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q5_5_0\"]")
	private WebElement reslienceQ5StronglyDisagree;
	
	//reslience Q5 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q5_5_1\"]")
	private WebElement reslienceQ5Disagree;
	
	//reslience Q5 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q5_5_2\"]")
	private WebElement reslienceQ5Neutral;
	
	//reslience Q5 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q5_5_3\"]")
	private WebElement reslienceQ5Agree;
	
	//reslience Q5 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q5_5_4\"]")
	private WebElement reslienceQ5StronglyAgree;
	
	//reslience Q6
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[7]/formly-wrapper-form-field/div/label")
	private WebElement reslienceQ6;
	
	//reslience Q6 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q6_6_0\"]")
	private WebElement reslienceQ6StronglyDisagree;
	
	//reslience Q6 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q6_6_1\"]")
	private WebElement reslienceQ6Disagree;
	
	//reslience Q6 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q6_6_2\"]")
	private WebElement reslienceQ6Neutral;
	
	//reslience Q6 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q6_6_3\"]")
	private WebElement reslienceQ6Agree;
	
	//reslience Q6 answer
	@FindBy(xpath="//*[@id=\"formly_24_radio_MWB_RESILIENCE_Q6_6_4\"]")
	private WebElement reslienceQ6StronglyAgree;
	
	public void verifyReslienceAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(reslienceQ1,"reslience Question 1");
		verifyElement.verifyBrowserElement(reslienceQ1StronglyDisagree,"reslience Question 1 Strongly Disagree");
		verifyElement.verifyBrowserElement(reslienceQ1Disagree,"reslience Question 1 Disgree");
		verifyElement.verifyBrowserElement(reslienceQ1Neutral,"reslience Question 1 Neutral");
		verifyElement.verifyBrowserElement(reslienceQ1Agree,"reslience Question 1 Agree");
		verifyElement.verifyBrowserElement(reslienceQ1StronglyAgree,"reslience Question 1 Strongly Agree");
		verifyElement.verifyBrowserElement(reslienceQ2,"Question 2 ");
		verifyElement.verifyBrowserElement(reslienceQ2StronglyDisagree,"reslience Question 2 Strongly Disagree");
		verifyElement.verifyBrowserElement(reslienceQ2Disagree,"reslience Question 2 Disgree");
		verifyElement.verifyBrowserElement(reslienceQ2Neutral,"reslience Question 2 Neutral");
		verifyElement.verifyBrowserElement(reslienceQ2Agree,"reslience Question 2 Agree");
		verifyElement.verifyBrowserElement(reslienceQ2StronglyAgree,"reslience Question 2 Strongly Agree");
		verifyElement.verifyBrowserElement(reslienceQ3,"Question 3 ");
		verifyElement.verifyBrowserElement(reslienceQ3StronglyDisagree,"reslience Question 3 Strongly Disagree");
		verifyElement.verifyBrowserElement(reslienceQ3Disagree,"reslience Question 3 Disgree");
		verifyElement.verifyBrowserElement(reslienceQ3Neutral,"reslience Question 3 Neutral");
		verifyElement.verifyBrowserElement(reslienceQ3Agree,"reslience Question 3 Agree");
		verifyElement.verifyBrowserElement(reslienceQ3StronglyAgree,"reslience Question 3 Strongly Agree");
		verifyElement.verifyBrowserElement(reslienceQ4,"Question 4 ");
		verifyElement.verifyBrowserElement(reslienceQ4StronglyDisagree,"reslience Question 4 Strongly Disagree");
		verifyElement.verifyBrowserElement(reslienceQ4Disagree,"reslience Question 4 Disgree");
		verifyElement.verifyBrowserElement(reslienceQ4Neutral,"reslience Question 4 Neutral");
		verifyElement.verifyBrowserElement(reslienceQ4Agree,"reslience Question 4 Agree");
		verifyElement.verifyBrowserElement(reslienceQ4StronglyAgree,"reslience Question 4 Strongly Agree");
		verifyElement.verifyBrowserElement(reslienceQ5,"Question 5 ");
		verifyElement.verifyBrowserElement(reslienceQ5StronglyDisagree,"reslience Question 5 Strongly Disagree");
		verifyElement.verifyBrowserElement(reslienceQ5Disagree,"reslience Question 5 Disagree");
		verifyElement.verifyBrowserElement(reslienceQ5Neutral,"reslience Question 5 Neutral");
		verifyElement.verifyBrowserElement(reslienceQ5Agree,"reslience Question 5 Agree");
		verifyElement.verifyBrowserElement(reslienceQ5StronglyAgree,"reslience Question 5 Strongly Agree");
		verifyElement.verifyBrowserElement(reslienceQ6,"Question 6 ");
		verifyElement.verifyBrowserElement(reslienceQ6StronglyDisagree,"reslience Question 6 Strongly Disagree");
		verifyElement.verifyBrowserElement(reslienceQ6Disagree,"reslience Question 6 Disagree");
		verifyElement.verifyBrowserElement(reslienceQ6Neutral,"reslience Question 6 Neutral");
		verifyElement.verifyBrowserElement(reslienceQ6Agree,"reslience Question 6 Agree");
		verifyElement.verifyBrowserElement(reslienceQ6StronglyAgree,"reslience Question 6 Strongly Agree");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void completeResilienceAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		verifyElement.clickElement(reslienceQ1StronglyDisagree,"reslience Question 1 Strongly Disagree");
		verifyElement.clickElement(reslienceQ2StronglyDisagree,"reslience Question 2 Strongly Disagree");
		verifyElement.clickElement(reslienceQ3StronglyDisagree,"reslience Question 3 Strongly Disagree");
		verifyElement.clickElement(reslienceQ4StronglyDisagree,"reslience Question 4 Strongly Disagree");
		verifyElement.clickElement(reslienceQ5StronglyDisagree,"reslience Question 5 Strongly Disagree");
		verifyElement.clickElement(reslienceQ6StronglyDisagree,"reslience Question 6 Strongly Disagree");
		verifyElement.clickElement(saveContinueButton,"Save Continue Button");

		verifyElement.switchOutOfBrowserFrame();
	}
	
	///////////////////////////Drinking Questions///////////////////////
	//drinking Q1
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[2]/formly-wrapper-form-field/div/label")
	private WebElement drinkingQ1;
	
	//drinking Q1 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q1_1_0\"]")
	private WebElement drinkingQ1Never;
	
	//drinking Q1 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q1_1_1\"]")
	private WebElement drinkingQ1MonthlyOrLess;
	
	//drinking Q1 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q1_1_2\"]")
	private WebElement drinkingQ1TwoToFour;
	
	//drinking Q1 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q1_1_3\"]")
	private WebElement drinkingQ1TwoThree;
	
	//drinking Q1 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q1_1_4\"]")
	private WebElement drinkingQ1FourOrMore;
	
	//drinking Q2
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[3]/formly-wrapper-form-field/div/label")
	private WebElement drinkingQ2;
	
	//drinking Q2 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q2_2_0\"]")
	private WebElement drinkingQ2OneOrTwo;
	
	//drinking Q2 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q2_2_1\"]")
	private WebElement drinkingQ2ThreeOrFour;
	
	//drinking Q2 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q2_2_2\"]")
	private WebElement drinkingQ2FiveOrSix;
	
	//drinking Q2 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q2_2_3\"]")
	private WebElement drinkingQ2SevenToNine;
	
	//drinking Q2 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q2_2_4\"]")
	private WebElement drinkingQ2TenOrMore;
	
	//drinking Q3
	@FindBy(xpath="/html/body/mwba-app/div/mwba-assessment//div/div/form/formly-form/formly-field[4]/formly-wrapper-form-field/div/label")
	private WebElement drinkingQ3;
	
	//drinking Q3 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q3_3_0\"]")
	private WebElement drinkingQ3Never;
	
	//drinking Q3 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q3_3_1\"]")
	private WebElement drinkingQ3LessThanMonth;
	
	//drinking Q3 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q3_3_2\"]")
	private WebElement drinkingQ3Monthly;
	
	//drinking Q3 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q3_3_3\"]")
	private WebElement drinkingQ3Weekly;
	
	//drinking Q3 answer
	@FindBy(xpath="//*[@id=\"formly_28_radio_MWB_AUDIT3_Q3_3_4\"]")
	private WebElement drinkingQ3Daily;
	
	public void verifyDrinkingAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(drinkingQ1,"drinking Question 1");
		verifyElement.verifyBrowserElement(drinkingQ1Never,"drinking Question 1 Never");
		verifyElement.verifyBrowserElement(drinkingQ1MonthlyOrLess,"drinking Question 1 Montly Or Less");
		verifyElement.verifyBrowserElement(drinkingQ1TwoToFour,"drinking Question 1 Two To Four");
		verifyElement.verifyBrowserElement(drinkingQ1TwoThree,"drinking Question 1 Two Three");
		verifyElement.verifyBrowserElement(drinkingQ1FourOrMore,"drinking Question 1 Four Or More");
		verifyElement.verifyBrowserElement(drinkingQ2,"Question 2 ");
		verifyElement.verifyBrowserElement(drinkingQ2OneOrTwo,"drinking Question 2 One Or Two");
		verifyElement.verifyBrowserElement(drinkingQ2ThreeOrFour,"drinking Question 2 Three Or Four");
		verifyElement.verifyBrowserElement(drinkingQ2FiveOrSix,"drinking Question 2 Five Or Six");
		verifyElement.verifyBrowserElement(drinkingQ2SevenToNine,"drinking Question 2 Seven To Nine");
		verifyElement.verifyBrowserElement(drinkingQ2TenOrMore,"drinking Question 2 Ten Or More");
		verifyElement.verifyBrowserElement(drinkingQ3,"Question 3 ");
		verifyElement.verifyBrowserElement(drinkingQ3Never,"drinking Question 3 Never");
		verifyElement.verifyBrowserElement(drinkingQ3Daily,"drinking Question 3 Daily");
		verifyElement.verifyBrowserElement(drinkingQ3LessThanMonth,"drinking Question 3 Less Than A Month");
		verifyElement.verifyBrowserElement(drinkingQ3Monthly,"drinking Question 3 Monthly");
		verifyElement.verifyBrowserElement(drinkingQ3Weekly,"drinking Question 3 Weekly");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void completeDrinkingAssessment() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		
		verifyElement.clickElement(drinkingQ1Never,"drinking Question 1 Never");

		verifyElement.clickElement(drinkingQ2OneOrTwo,"drinking Question 2 One Or Two");

		verifyElement.clickElement(drinkingQ3Never,"drinking Question 3 Never");

		verifyElement.clickElement(submitButton,"Save Continue Button");

		verifyElement.switchOutOfBrowserFrame();
	}
	
	//Submit And Save Assessment Button
	@FindBy(xpath="//html/body/mwba-app/div/mwba-assessment//div/div/div[2]/div[2]/div/button")
	private WebElement submitButton;
	
	public void clickSubmitButton() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(submitButton,"Submit Button");
		verifyElement.clickElement(submitButton,"Submit Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void clickCancelButton() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(cancelButton,"Cancel Button");
		verifyElement.clickElement(cancelButton,"Cancel Button");
		verifyElement.switchOutOfBrowserFrame();
	}
	
	public void clickSaveContinueButton() {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		verifyElement.verifyBrowserElement(saveContinueButton,"Save Continue Button");
		verifyElement.clickElement(saveContinueButton,"Save Continue Button");
		verifyElement.switchOutOfBrowserFrame();
	}

	public void clickResumeAssessment() throws Exception {
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		Thread.sleep(3000);
		verifyElement.switchToBrowserFrame(appObjectMWBA, "Object IFrame");
		ClickHelpFunction(resumeAssessments, "clicks the resume test button");
		verifyElement.switchOutOfBrowserFrame();
		verifyElement.switchOutOfBrowserFrame();
	}
	
	//drinking Q3 answer
	@FindBy(xpath="//*[@id=\"formly_8_radio_MWB_GAD7_Q1_1_0\"]")
	private WebElement feelingNervousNotatAll;
	
	@FindBy(xpath="//*[@id=\"formly_8_radio_MWB_GAD7_Q2_2_0\"]")
	private WebElement controlWorrying;
	
	@FindBy(xpath="//*[@id=\"formly_8_radio_MWB_GAD7_Q3_3_0\"]")
	private WebElement worryTooMuch;
	
	@FindBy(xpath="//*[@id=\"formly_8_radio_MWB_GAD7_Q4_4_0\"]")
	private WebElement troubleRelaxing;

	@FindBy(xpath="//*[@id=\"formly_8_radio_MWB_GAD7_Q5_5_0\"]")
	private WebElement restless;
	
	@FindBy(xpath="//*[@id=\"formly_8_radio_MWB_GAD7_Q6_6_0\"]")
	private WebElement annoyed;
	
	@FindBy(xpath="//*[@id=\"formly_8_radio_MWB_GAD7_Q7_7_0\"]")
	private WebElement afraid;
	
	// Uses CSS to locate the shadow-root and sub-elements.
	public List<WebElement> findElementsByTags(String tagShadowRootComposerName, String tagDesiredElementName) {
	WebElement tagShadowRootComposerElement = BrowserDriver.findElement(By.tagName(tagShadowRootComposerName));
	WebElement shadowRoot = (WebElement) ((JavascriptExecutor) BrowserDriver)
	.executeScript("return arguments[0].shadowRoot", tagShadowRootComposerElement);
	List<WebElement> desiredElements = shadowRoot.findElements(By.tagName(tagDesiredElementName));
	return desiredElements;
	}
	
	


   
   
   
   
	public void continueFillingAssessmentFormAndResetForm() throws Exception{
		verifyElement.switchToBrowserFrame(vitalityAppFrame, "Browser frame ");
		Thread.sleep(3000);
		verifyElement.switchToBrowserFrame(appObjectMWBA, "Object IFrame");
		
		//nervous
	    JavascriptExecutor jse = (JavascriptExecutor)BrowserDriver;
	    WebElement nervousRadio = (WebElement) jse.executeScript("return document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"#formly_8_radio_MWB_GAD7_Q1_1_0\")");    
	    ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", nervousRadio);
		
	   
		//control feeling worried
	    WebElement worryingRadio = (WebElement) jse.executeScript("return document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"#formly_8_radio_MWB_GAD7_Q2_2_0\")");    
	   ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", worryingRadio);
	   
	   //worryingTooMuch
	    WebElement worryingTooMuchRadio = (WebElement) jse.executeScript("return document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"#formly_8_radio_MWB_GAD7_Q3_3_0\")");    
	   ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", worryingTooMuchRadio);
		
	  
		//relaxing
	    WebElement relaxingRadio = (WebElement) jse.executeScript("return document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"#formly_8_radio_MWB_GAD7_Q4_4_0\")");    
	   ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", relaxingRadio);
		
	    //restless
	    WebElement restlessRadio = (WebElement) jse.executeScript("return document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"#formly_8_radio_MWB_GAD7_Q5_5_0\")");    
	   ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", restlessRadio);
		
	   
	    //annoyed
	    WebElement annoyedRadio = (WebElement) jse.executeScript("return document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"#formly_8_radio_MWB_GAD7_Q6_6_0\")");    
	   ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", annoyedRadio);

		//afraid
	    WebElement afraidRadio = (WebElement) jse.executeScript("return document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"#formly_8_radio_MWB_GAD7_Q7_7_0\")");    
	   ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", afraidRadio);

		//cancel
	   
	    WebElement cancelButton = (WebElement) jse.executeScript("return  document.querySelector(\"mwba-assessment\").shadowRoot.querySelector(\"div.section-content > div > div.row.pt-2 > div.col-md-6.col-4.text-left > button\")");    
		   ((JavascriptExecutor)BrowserDriver).executeScript("arguments[0].click();", cancelButton);
		
	  
		verifyElement.switchOutOfBrowserFrame();
		
		
	}
	
}

