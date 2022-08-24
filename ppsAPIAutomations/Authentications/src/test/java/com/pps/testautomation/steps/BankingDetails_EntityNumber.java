package com.pps.testautomation.steps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.codoid.products.fillo.Recordset;
import com.sts.testautomation.utilities.ApiHelper;
import com.sts.testautomation.utilities.DataProvider;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class BankingDetails_EntityNumber extends repo {

	
	// Author: Thamsanqa Bhekisizwe
	
	private static String BearerToken = null;

	static Response response; 

	public static void BankingDetailsRules (ExtentReports extent, String fileName) throws Exception {

		ExtentTest test = null;

		String Query = "Select * from Request where RunMe = 'Yes'";

		Recordset ReqRecordset =DataProvider.getDataFromExcelbyQuery("TestData/"+fileName+".xlsx",Query );

		String baseUrl = DataProvider.GetPropVal(DataProvider.propertyFilePath, "baseUrl");

		String EntityNumberUrl = DataProvider.GetPropVal(DataProvider.propertyFilePath, "EntityNumberUrl");



		while(ReqRecordset.next())
		{
			loadRequestData(ReqRecordset);

			loadTCExpectedResponse(TestCaseNumber, fileName); 


			test=extent.createTest(TestCaseNumber);
			test.info( MarkupHelper.createCodeBlock(PRODUCT_NAME));
			test.info("URI Used: " + baseUrl);	
			test.info("Endpoint Used: " + Endpoint);
			test.info("Getting data for BROKER_ENTITY_NUMBER: " + BROKER_ENTITY_NUMBER);


			response = ApiHelper.sendRestGetRequest(EntityNumberUrl, BearerToken, Endpoint + BROKER_ENTITY_NUMBER);

			response.prettyPrint();	
			
			ApiHelper.AssertEquals("Status code" ,statusCode, String.valueOf(response.statusCode()) , test);

			if(statusCode.equals(String.valueOf( response.statusCode() ))) {

				JSONObject jsson = new JSONObject( response.asString());

				String isEssentialDataMissingValue = jsson.get("isEssentialDataMissing").toString();
				test.info("IsEssentialDataMissing: " + isEssentialDataMissingValue);

				JSONArray policybatch = jsson.getJSONArray("policies");

				test.info("Total number of policies on this entity: "+ policybatch.length());

				for(int i = 0; i < policybatch.length(); i++)
				{
					String policyNumberr = policybatch.getJSONObject(i).get("policyNumber").toString();

					test.info("Policy number: " + (i+1) + " (" + policyNumberr +")");  

					//============================Policies=====================================================================================						
					JSONObject HolderpolicyNumber = policybatch.getJSONObject(i);

					if(HolderpolicyNumber.has("policyNumber")) {            	    	  
						test.pass("validation for field 'policyNumber' has passed."); 						 
					}else {              	    	  
						test.fail("The field 'PolicyNumber' does not exit.");
					}
					
					//============================ProductName================================================================================
					JSONArray ProductName = jsson.getJSONArray("policies");
					JSONObject HolderProductNamee = ProductName.getJSONObject(0);
					if(HolderProductNamee.has("productName")) {
						test.pass("validation for field 'ProductName' has passed."); 						 
					}else {              	    	  
						test.fail("The field 'ProductName' does not exit.");
					}     

				//============================fundValue================================================================================
					
					JSONArray iosCodee = jsson.getJSONArray("policies");           	       
					JSONObject batchIosCodee = iosCodee.getJSONObject(i);
					
					

		     		if(batchIosCodee.has("fundValue"))
					  {
		     			String fundValue = batchIosCodee.get("fundValue").toString();
						
						if(!(fundValue.equals("null"))) {
							
							
							JSONArray IsoCodeFu = batchIosCodee.getJSONArray("fundValue");

							for(int y = 0; y < IsoCodeFu.length(); y++) {
								test.info("FundValue Feilds");
								JSONObject HolderIsoCodeFu = IsoCodeFu.getJSONObject(y);
								
								
								//============================IsoCode====================================================================================              	      

								if(HolderIsoCodeFu.has("isoCode"))
								{
									test.pass("validation for field 'IsoCode' has passed."); 
								}else {
									test.fail("The field 'IsoCode' does not exit.");
								}
								//============================Symbol====================================================================================              	      

								if(HolderIsoCodeFu.has("symbol"))
								{
									test.pass("validation for field 'Symbol' has passed."); 
								}else {
									test.fail("The field 'Symbol' does not exit.");
								}

								//============================Amount====================================================================================              	      

								if(HolderIsoCodeFu.has("amount"))
								{
									test.pass("validation for field 'Amount' has passed."); 
								}else {
									test.fail("The field 'Amount' does not exit.");
								}
								
//								}else {///
//									System.out.print("fundValue is null");
//								}
								

							}
							
							
							
						}else {
							System.out.print("fundValue is null");
							test.info("fundValue is null");
						}
							
							
						
						
					}else if(batchIosCodee.has("maturityValue"))
					{
						
						String maturityValue = batchIosCodee.get("maturityValue").toString();
						
						if(!(maturityValue.equals("null"))) {
							
						
                       
						JSONArray IsoCodeMa = batchIosCodee.getJSONArray("maturityValue");


						for(int y = 0; y < IsoCodeMa.length(); y++) {
							test.info("MaturityValue Feilds");

							JSONObject HolderIsoCodeMa = IsoCodeMa.getJSONObject(y);

							//============================IsoCode====================================================================================              	      

							if(HolderIsoCodeMa.has("isoCode"))
							{
								test.pass("validation for field 'IsoCode' has passed."); 
							}else {
								test.fail("The field 'IsoCode' does not exit.");
							}
							//============================Symbol====================================================================================              	      

							if(HolderIsoCodeMa.has("symbol"))
							{
								test.pass("validation for field 'Symbol' has passed."); 
							}else {
								test.fail("The field 'Symbol' does not exit.");
							}

							//============================Amount====================================================================================              	      

							if(HolderIsoCodeMa.has("amount"))
							{
								test.pass("validation for field 'Amount' has passed."); 
							}else {
								test.fail("The field 'Amount' does not exit.");
							}


						}
						
						}else {
							System.out.print("maturityValue is null");
							test.info("maturityValue is null");
						}
				
						
						

					}else if(batchIosCodee.has("totalContributionValue")){

						String totalContributionValue = batchIosCodee.get("totalContributionValue").toString();
						
						if(!(totalContributionValue.equals("null"))) {
							
						
							JSONArray IsoCodeMa = batchIosCodee.getJSONArray("totalContributionValue");


							for(int y = 0; y < IsoCodeMa.length(); y++) {

								test.info("TotalContributionValue Feilds");

								JSONObject HolderIsoCodeMa = IsoCodeMa.getJSONObject(y);

								//============================IsoCode====================================================================================              	      

								if(HolderIsoCodeMa.has("isoCode"))
								{
									test.pass("validation for field 'IsoCode' has passed."); 
								}else {
									test.fail("The field 'IsoCode' does not exit.");
								}
								//============================Symbol====================================================================================              	      

								if(HolderIsoCodeMa.has("symbol"))
								{
									test.pass("validation for field 'Symbol' has passed."); 
								}else {
									test.fail("The field 'Symbol' does not exit.");
								}

								//============================Amount====================================================================================              	      

								if(HolderIsoCodeMa.has("amount"))
								{
									test.pass("validation for field 'Amount' has passed."); 
								}else {
									test.fail("The field 'Amount' does not exit.");
								}


							}
							
						}else {
							System.out.print("totalContributionValue is null");
							test.info("totalContributionValue is null");
						}

				
					}
				  
				
					JSONArray Heading = jsson.getJSONArray("policies");        		     
					JSONObject HolderHeading = Heading.getJSONObject(i);
					JSONArray arrayBankDetails = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

					if(arrayBankDetails.length() != 0) {

						test.info("BankingDetails Feilds");
						if(HolderHeading.has("bankingDetails"))
						{
							//============================Heading====================================================================================              	               		      
							JSONArray HeadingHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderHeading1 = HeadingHolder.getJSONObject(0);

							if(HolderHeading1.has("heading"))
							{
								test.pass("validation for field 'Heading' has passed."); 

							}else {

								test.fail("The field 'Heading' does not exit.");
							} 


							//============================AccountHolder====================================================================================              	                		     
							JSONArray AccountHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderAccountHolder = AccountHolder.getJSONObject(0);

							if(HolderAccountHolder.has("accountHolder"))
							{
								test.pass("validation for field 'AccountHolder' has passed."); 

							}else {

								test.fail("The field 'AccountHolder' does not exit.");
							}            		      		     
							//============================Bank====================================================================================              	                		     
							JSONArray BankHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderBank = BankHolder.getJSONObject(0);

							if(HolderBank.has("bank"))
							{
								test.pass("validation for field 'Bank' has passed."); 

							}else {

								test.fail("The field 'Bank' does not exit.");
							} 
							//============================AccountNumber====================================================================================              	                		     
							JSONArray AccountNumberHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderAccountNumber = AccountNumberHolder.getJSONObject(0);

							if(HolderAccountNumber.has("accountNumber"))
							{
								test.pass("validation for field 'AccountNumber' has passed."); 

							}else {

								test.fail("The field 'AccountNumber' does not exit.");
							} 

							//============================AccountType====================================================================================              	                		     
							JSONArray AccountTypeHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderAccountType = AccountTypeHolder.getJSONObject(0);

							if(HolderAccountType.has("accountType"))
							{
								test.pass("validation for field 'AccountType' has passed."); 

							}else {

								test.fail("The field 'AccountType' does not exit.");
							} 

							//============================Branch====================================================================================              	                		     
							JSONArray BranchHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderBranch = BranchHolder.getJSONObject(0);

							if(HolderBranch.has("branch"))
							{
								test.pass("validation for field 'Branch' has passed."); 

							}else {

								test.fail("The field 'Branch' does not exit.");
							} 
							//============================BranchCode====================================================================================              	                		     
							JSONArray BranchCodeHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderBranchCode = BranchCodeHolder.getJSONObject(0);

							if(HolderBranchCode.has("branchCode"))
							{
								test.pass("validation for field 'BranchCode' has passed."); 

							}else {

								test.fail("The field 'BranchCode' does not exit.");
							} 

							//============================Type====================================================================================              	                		     
							JSONArray TypeHolder = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails"); 

							JSONObject HolderType = TypeHolder.getJSONObject(0);

							if(HolderType.has("type"))
							{
								test.pass("validation for field 'Type' has passed."); 

							}else {

								test.fail("The field 'Type' does not exit.");
							} 



						}else {
							test.fail("The field 'bankingDetails' does not exit.");
						}


						String TypeName = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0).get("type").toString();

						if(!TypeName.equals("Payment")) {

							//============================isoCode2====================================================================================              	                		     
							JSONArray IsoCode2 = jsson.getJSONArray("policies");        		     
							JSONObject innerJson = IsoCode2.getJSONObject(i);

							if(innerJson.has("bankingDetails")) {

								JSONObject bankingdetailsIC = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);



								if(bankingdetailsIC.has("contributionAmount"))
								{


									JSONObject bankingdetailsIC1 = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0).getJSONObject("contributionAmount");


									if(bankingdetailsIC1.has("isoCode"))
									{
										test.pass("validation for field 'IsoCode For Contribution Amount' has passed."); 

									}else {

										test.fail("The field 'IsoCode For Contribution Amount' does not exit.");
									}


								}else if(bankingdetailsIC.has("incomeAmount")){


									JSONObject bankingdetailsIC1 = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0).getJSONObject("incomeAmount");


									if(bankingdetailsIC1.has("isoCode"))
									{
										test.pass("validation for field 'IsoCode For Income Amount' has passed."); 

									}else {

										test.fail("The field 'IsoCode For Income Amount' does not exit.");
									}

								}else {


									test.fail("The field 'IsoCode For Income Amount or Contribution Amount' does not exit.");
								}


							}

							//============================Symbol2====================================================================================              	                		     
							JSONArray Symbol2 = jsson.getJSONArray("policies");        		     
							JSONObject HolderSymbol2 = Symbol2.getJSONObject(i);

							if(HolderSymbol2.has("bankingDetails"))
							{

								JSONObject bankingdetailsS = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);

								if(bankingdetailsS.has("contributionAmount"))
								{

									JSONObject bankingdetailsS1 = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0).getJSONObject("contributionAmount");

									if(bankingdetailsS1.has("symbol"))
									{
										test.pass("validation for field 'Symbol For Contribution Amount' has passed."); 

									}else {

										test.fail("The field 'Symbol For Contribution Amount' does not exit.");
									}



								}else if(bankingdetailsS.has("incomeAmount")){

									JSONObject bankingdetailsS1 = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0).getJSONObject("incomeAmount");

									if(bankingdetailsS1.has("symbol"))
									{
										test.pass("validation for field 'Symbol For Income Amount has passed."); 

									}else {

										test.fail("The field 'Symbol For Income Amount' does not exit.");
									}

								}else {
									test.fail("The key 'Symbol For Income Amount or Contribution Amount' does not exit.");
								}
								
							}	

								//============================Amount2====================================================================================              	                		     
								JSONArray Amount2 = jsson.getJSONArray("policies");        		     
								JSONObject HolderAmount2 = Amount2.getJSONObject(i);

								if(HolderAmount2.has("bankingDetails"))
								{


									JSONObject bankingdetailsA = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);



									if(bankingdetailsA.has("contributionAmount"))
									{

										JSONObject bankingdetailsA1 = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0).getJSONObject("contributionAmount");

										if(bankingdetailsA1.has("amount"))
										{
											test.pass("validation for field 'Amount For Contribution Amount' has passed."); 

										}else {

											test.fail("The field 'Amount For Contribution Amount' does not exit.");
										}



									}else if(bankingdetailsA.has("incomeAmount")){

										JSONObject bankingdetailsA1 = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0).getJSONObject("incomeAmount");

										if(bankingdetailsA1.has("amount"))
										{
											test.pass("validation for field 'Amount For Income Amount' has passed."); 

										}else {

											test.fail("The field 'Amount For Income Amount' does not exit.");
										}

									}else {
										test.fail("The field 'Amount For Income Amount or Contribution Amount' does not exit.");
									}


								}


								//============================DebitOrderDay====================================================================================              	                		     
								JSONArray DebitOrderDay = jsson.getJSONArray("policies");  
								JSONObject HolderDebitOrderDay = DebitOrderDay.getJSONObject(i);

								if(HolderDebitOrderDay.has("bankingDetails")) {



									JSONObject bankingdetailsDOD = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);



									if(bankingdetailsDOD.has("debitOrderDay"))
									{

										test.pass("validation for field 'Debit Order Day' has passed."); 


									}else {

										test.fail("The field 'Debit Order Day' does not exit.");

									}

								}else {

									test.fail("The field 'Debit Order Day' does not exit.");

								}


								//============================ContributionFrequency====================================================================================              	                		     
								JSONArray ContributionFrequency = jsson.getJSONArray("policies");  
								JSONObject HolderContributionFrequency = ContributionFrequency.getJSONObject(i);

								if(HolderContributionFrequency.has("bankingDetails")) {


									JSONObject bankingdetailsCF = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);

									            		    	 
									if(bankingdetailsCF.has("contributionFrequency"))
									{

										test.pass("validation for field 'Contribution Frequency' has passed."); 

									}else{

										test.fail("The field 'Contribution Frequency' does not exit.");
									} 

									//}

								}else {

									test.fail("The field 'Contribution Frequency' does not exit.");

								}

								//============================PayerType====================================================================================              	                		     
								JSONArray PayerType = jsson.getJSONArray("policies");        		     
								//String[] ArrOfPayerType = ApiHelper.setBeneficiaryValue(payerType);  
								JSONObject HolderPayerType = PayerType.getJSONObject(i);

								if(HolderPayerType.has("bankingDetails"))
								{

									JSONObject bankingdetailsPT = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);



									if(bankingdetailsPT.has("payerType"))
									{

										test.pass("validation for field 'Payer Type' has passed."); 

									}else {

										test.fail("The field 'Payer Type' does not exit.");

									}
								}else {
									test.fail("The field 'Payer Type' does not exit.");

								}

								//============================IncomePaymentDay====================================================================================              	                		     
								JSONArray IncomePaymentDay = jsson.getJSONArray("policies");        		     
								JSONObject HolderIncomePaymentDay = IncomePaymentDay.getJSONObject(0);

								if(HolderIncomePaymentDay.has("bankingDetails"))
								{

									JSONObject bankingdetailsIPD = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);

									if(bankingdetailsIPD.has("incomeAmount")) {

										JSONObject incomePaymentDayIPD = jsson.getJSONArray("policies").getJSONObject(i).getJSONArray("bankingDetails").getJSONObject(0);

										if(incomePaymentDayIPD.has("incomePaymentDay"))
										{

											test.pass("validation for field 'Income Payment Day' has passed."); 

										}else {

											test.fail("The field 'Income Payment Day' does not exit.");

										}
									} 

								}else {
									test.fail("The field 'Income Payment Day' does not exit.");

								}

							

						}//TypeName

					}else{//ArrayBankDetails
						test.info("Policy Number that does not have Banking Details or An Empyt Array. " + " [" + policyNumberr +"]");


						System.out.print("No banking Details Found/String is Empyt\n");

					}

				}

				//}

			}

			test.info( "Find response below");
			test.info(MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));


		}


		
		
		
	}	


	public static void Authentication()
	{

		String RequestString = "https://invest-jwt-login-invest-qa.oseza.discsrv.co.za/api/api-users/login?username=test&password=password";


		Response response = given()
				.header("Content-Type", "application/json")
				.relaxedHTTPSValidation()
				.post(RequestString);

		Headers ResponseHeaders = response.getHeaders();

		System.out.println("============================================================================================================");
		System.out.println("API Request : "+RequestString);
		System.out.println(" ");

		int statusCode = response.getStatusCode();

		System.out.println("============================================================================================================");
		System.out.println("Response code :"+statusCode);
		System.out.println(" ");

		System.out.println("============================================================================================================");
		System.out.println("Response Headers :");
		System.out.println(ResponseHeaders);
		System.out.println(" ");

		JSONObject responsebody = new JSONObject(response.asString());
		BearerToken = responsebody.get("token").toString();

		System.out.println(BearerToken);


	}



}
