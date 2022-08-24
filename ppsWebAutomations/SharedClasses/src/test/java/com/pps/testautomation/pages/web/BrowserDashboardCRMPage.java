package com.pps.testautomation.pages.web;

import com.pps.testautomation.utilities.ElementFunctionality;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserDashboardCRMPage {

    public WebDriver BrowserDriver;
    //public AndroidDriver<MobileElement> aDriver;
    public ElementFunctionality verifyElement; public String Device;

    public BrowserDashboardCRMPage(WebDriver browserDriver, String Device)
    {
        BrowserDriver = browserDriver;
        this.Device=Device; verifyElement = new ElementFunctionality(BrowserDriver, Device);
        PageFactory.initElements(BrowserDriver, this);

    }

    //////////Iframes and Page Header Title
    //Vitality Status Frame
    @FindBy(xpath="//iframe[@id='vitalityStatusIframe']")
    private WebElement vitalityStatusFrame;

    //CRM Dashboard Tabs

//    @FindBy(xpath="//button[normalize-space()='Entity number']")
//    private WebElement searchDropDown;

    @FindBy(css="button[class='select-button']")
    private WebElement searchDropDown;



    @FindBy(xpath="//nb-option[normalize-space()='ID number']")
    private WebElement idNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Entity number']")
    private WebElement entityNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Passport number']")
    private WebElement passportNumberOption;


    @FindBy(xpath="//nb-option[normalize-space()='Policy number']")
    private WebElement policyNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Membership (card) number']")
    private WebElement membershipCardNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Reference number']")
    private WebElement referenceNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Broker number']")
    private WebElement brokerNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Employer number']")
    private WebElement employerNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Cellphone number']")
    private WebElement cellphoneNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Practice number']")
    private WebElement practiceNumberOption;

    @FindBy(xpath="//nb-option[normalize-space()='Email reference']")
    private WebElement emailReferenceOption;

    @FindBy(xpath="//nb-option[normalize-space()='Online application reference']")
    private WebElement onlineApplicationReferenceOption;

    @FindBy(xpath="//input[@placeholder='Search Value']")
    private WebElement searchValueEditBox;

    @FindBy(xpath="//button[@id='searchButton']")
    private WebElement searchValueButton;


    @FindBy(xpath="//a[@title='Home']")
    private WebElement homeIcon;




    public void clickHomeIcon() {

        verifyElement.waitForFullPageLoad();
        if (verifyElement.verifyBrowserElementValue(homeIcon, "click Home Icon") == 0) {
            verifyElement.clickElement(homeIcon, "Home Icon");

        } else {
            System.err.println("There is no Home Icon");
        }

    }


    public void clickSearchDropDown(String dropDownOption) {

        verifyElement.waitForFullPageLoad();
        if (verifyElement.verifyBrowserElementValue(searchDropDown, "Verify Search Drop Down field") == 0) {
            verifyElement.clickElement(searchDropDown, "click Search Drop Down");




            if(dropDownOption.equalsIgnoreCase("Entity number")){

                verifyElement.clickElement(entityNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Passport number"))
            {
                verifyElement.clickElement(passportNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Policy number"))
            {
                verifyElement.clickElement(policyNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Membership (card) number"))
            {
                verifyElement.clickElement(membershipCardNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Reference number"))
            {
                verifyElement.clickElement(referenceNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Broker number"))
            {
                verifyElement.clickElement(brokerNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Employer number"))
            {
                verifyElement.clickElement(employerNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Cellphone number"))
            {
                verifyElement.clickElement(cellphoneNumberOption, "click Entity number option");

            }else if(dropDownOption.equalsIgnoreCase("Practice number"))
            {
                verifyElement.clickElement(practiceNumberOption, "click Practice number");

            }else if(dropDownOption.equalsIgnoreCase("Email reference"))
            {
                verifyElement.clickElement(emailReferenceOption, "click Email reference");

            }else if(dropDownOption.equalsIgnoreCase("Online application reference"))
            {
                verifyElement.clickElement(onlineApplicationReferenceOption, "click online application reference");

            }else if(dropDownOption.equalsIgnoreCase("ID Number"))
            {
                verifyElement.clickElement(idNumberOption, "click ID Number");

            }


        } else {
            System.err.println("There is no Select Search Drop Down");
        }

    }

    public void enterSearchValue(String searchVal) {

        verifyElement.waitForFullPageLoad();
        if (verifyElement.verifyBrowserElementValue(searchValueEditBox, "Verify Search Value") == 0) {
            verifyElement.sendKeys(searchValueEditBox, "Enter Search Value" ,searchVal);

        } else {
            System.err.println("There is no Search Value");
        }

    }

    public void clickSearchValueButton() {

        verifyElement.waitForFullPageLoad();
        if (verifyElement.verifyBrowserElementValue(searchValueButton, "Click Search Value Button") == 0) {
            verifyElement.clickElement(searchValueButton, "Click Search Value Button");
        } else {
            System.err.println("There is no Search Value Button");
        }

    }

    public void clearSearchValue() {

        verifyElement.waitForFullPageLoad();
        if (verifyElement.verifyBrowserElementValue(searchValueEditBox, "Clear Search Value") == 0) {
            searchValueEditBox.clear();
        } else {
            System.err.println("There is no Search Value");
        }

    }

}
