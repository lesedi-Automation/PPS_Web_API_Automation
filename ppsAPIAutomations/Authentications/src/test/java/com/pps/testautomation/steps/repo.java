package com.pps.testautomation.steps;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.pps.testautomation.utilities.DataProvider;

public class repo {

	
	protected static String TestCaseNumber, runMe, Endpoint , PRODUCT_NAME, 
    statusCode, BROKER_ENTITY_NUMBER, policyNumber, umbrellaNumber, productName, 
    isoCode, symbol, heading, amount, accountHolder, accountHolderDescription,
    bank, accountNumber, branch, branchCode,type, isoCode2, symbol2, amount2,
    debitOrderDay, payerType, incomePaymentDay;
	
	public static void loadRequestData(Recordset recordset) throws FilloException {
		
		TestCaseNumber = recordset.getField("TestCaseNumber");
		Endpoint = recordset.getField("Endpoint");
		runMe = recordset.getField("runMe");
		PRODUCT_NAME = recordset.getField("PRODUCT_NAME");

	}
	
	public static void loadTCExpectedResponse(String testCase, String filename) throws FilloException {
		
         String Query = "Select * from Response where TestCaseNumber = '"+testCase+"'";
		 
		 Recordset recordset =DataProvider.getDataFromExcelbyQuery("TestData/"+filename+".xlsx",Query );
		 
		 recordset.next();
		 
         statusCode = recordset.getField("statusCode");
		 

		
	}
	
	
}
