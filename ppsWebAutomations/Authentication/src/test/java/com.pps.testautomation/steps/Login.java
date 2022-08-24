package com.pps.testautomation.steps;

import org.testng.annotations.Test;

import java.net.URL;


public class Login {


    //Use xml to pass arguments and URL



    //Setup method
    @BeforeClass
    public void setup(){

      //  Webdriver.navigate().to(new URL(url));
       // Webdriver.manage().window().maximize();

    }

    //Login method
    @Test
    public void Login(){

        //Pageobject

    }

    //Logout method

    @AfterTest
    public void Logout(){

        //TestDown

    }

    @DataProvider

    public Object[][] Authentication() throws Exception
    {

        System.out.println("setting excel file");
        // Setting up the Test Data Excel file


        System.out.println("Creating array");
        Object[][] testObjArray = ExcelHandler.getTableArray("../src/data/testdata.xlsx","LoginCredentials","AccountType",Account);

        return (testObjArray);

    }




}


