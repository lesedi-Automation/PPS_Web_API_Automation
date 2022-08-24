package com.pps.testautomation.utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandler
{
	 private static XSSFSheet ExcelWSheet;
	 private static XSSFWorkbook ExcelWBook;
	 private static XSSFCell Cell;
	 private static XSSFRow Row;
	 
	 //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
	 
	 public static void setExcelFile(String Path,String SheetName) throws Exception 
	 {
	 
	    try 
	    {
	 
		 // Open the Excel file
		 
		 FileInputStream ExcelFile = new FileInputStream(Path);
		 
		 // Access the required test data sheet
		 
		 ExcelWBook = new XSSFWorkbook(ExcelFile);
		 
		 ExcelWSheet = ExcelWBook.getSheet(SheetName);
		 
	    } 
	    
	    catch (Exception e)
	    {
	 
	    	throw (e);
	 
	    }
	 
	 }
	 
	 public static Object[][] getTableArray(String FilePath, String SheetName, String Attribute, String Value)  throws Exception
	 
	 {   
	 
	    String[][] tabArray = null;
	 
	    try
	    {
	 
		    FileInputStream ExcelFile = new FileInputStream(FilePath);
		 
		    // Access the required test data sheet
		 
		    ExcelWBook = new XSSFWorkbook(ExcelFile);
		 
		    ExcelWSheet = ExcelWBook.getSheet(SheetName);
		    
		    int numCols = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
		    int numRows =  ExcelWSheet.getLastRowNum()+1;
		    int attributeCol = 0;
		    int valueRow = 0;
		    tabArray = new String[1][numCols];
		    
		    //Determine the column for the attribute name
		    for(int i = 0; i< numCols; i++)
		    {
		    	if(ExcelWSheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(Attribute))
		    	{
		    		attributeCol = i;
		    		break;
		    		
		    	}
		    }
		 
		    //Determine the row that has the value
		    for(int j = 0; j< numRows; j++)
		    {
		    	if(ExcelWSheet.getRow(j).getCell(attributeCol).getStringCellValue().equalsIgnoreCase(Value))
		    	{
		    		valueRow = j;
		    		break;
		    	}
		    }
		    
		    //Populate the object with the correct values
		    for(int c = 0; c< numCols; c++)
		    {
		    	tabArray[0][c] = ExcelWSheet.getRow(valueRow).getCell(c).getStringCellValue();
		    	
		    }
		 
		
		 
		 }
	 
	 catch (FileNotFoundException e)
	 
	 {
	 
		 System.out.println("Could not read the Excel sheet");
		 
		 e.printStackTrace();
	 
	 }
	 
	 catch (IOException e)
	 
	 {
	 
		 System.out.println("Could not read the Excel sheet");
	 
		 e.printStackTrace();
	 
	 }
	 
	 return(tabArray);
	 
	 }
	
	 //Get all entries besides the provides value
	 public static Object[][] getTableArrayAllBesides(String FilePath, String SheetName, String Attribute, String Value)  throws Exception
	 
	 {   
	 
	    String[][] tabArray = null;
	 
	    try
	    {
	 
		    FileInputStream ExcelFile = new FileInputStream(FilePath);
		 
		    // Access the required test data sheet
		 
		    ExcelWBook = new XSSFWorkbook(ExcelFile);
		 
		    ExcelWSheet = ExcelWBook.getSheet(SheetName);
		    
		    int numCols = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
		    int numRows =  ExcelWSheet.getLastRowNum()+1;
		    int attributeCol = 0;
		    int valueRow = 0;
		    
		    
		    //Determine the column for the attribute name
		    for(int i = 0; i< numCols; i++)
		    {
		    	if(ExcelWSheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(Attribute))
		    	{
		    		attributeCol = i;
		    		break;
		    		
		    	}
		    }
		 
		    tabArray = new String[numRows-2][numCols];
		    int counter = 0;
		    //Determine the row that has the value
		    for(int j = 1; j< numRows; j++)
		    {
		    	if(ExcelWSheet.getRow(j).getCell(attributeCol).getStringCellValue().equalsIgnoreCase(Value)==false)
		    	{
		    		  //Populate the object with the correct values
				    for(int c = 0; c< numCols; c++)
				    {
				    	tabArray[counter][c] = ExcelWSheet.getRow(j).getCell(c).getStringCellValue();
				    	 
				    }
				    
		    	}
		    	
		    	else
		    	{
		    		counter --;
		    	}
		    	counter++;
		    	
		    }
		    
		  
		 
		
		 
		 }
	 
	 catch (FileNotFoundException e)
	 
	 {
	 
		 System.out.println("Could not read the Excel sheet");
		 
		 e.printStackTrace();
	 
	 }
	 
	 catch (IOException e)
	 
	 {
	 
		 System.out.println("Could not read the Excel sheet");
	 
		 e.printStackTrace();
	 
	 }
	 
	 return(tabArray);
	 
	 }
	
	 //Getting all of the user data from Excel 
	 public static Object[][] getTableArray(String FilePath, String SheetName)  throws Exception
	 
	 {   
	 
	    String[][] tabArray = null;
	 
	    try
	    {
	 
		    FileInputStream ExcelFile = new FileInputStream(FilePath);
		 
		    // Access the required test data sheet
		 
		    ExcelWBook = new XSSFWorkbook(ExcelFile);
		 
		    ExcelWSheet = ExcelWBook.getSheet(SheetName);
		    
		    int numCols = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
		    int numRows =  ExcelWSheet.getLastRowNum()+1;
		  
		    int attributeCol = 0;
		    int valueRow = 0;
		    tabArray = new String[numRows][numCols];
		    
		    
		    //Populate the object with the correct values
		   for(int r = 1; r<numRows; r++)
		   {
			   for(int c = 0; c< numCols; c++)
			    {
			    	tabArray[r-1][c] = ExcelWSheet.getRow(r).getCell(c).getStringCellValue();
			    	
			    } 
		   }
		    
		 
		
		 
		 }
	 
	 catch (FileNotFoundException e)
	 
	 {
	 
		 System.out.println("Could not read the Excel sheet");
		 
		 e.printStackTrace();
	 
	 }
	 
	 catch (IOException e)
	 
	 {
	 
		 System.out.println("Could not read the Excel sheet");
	 
		 e.printStackTrace();
	 
	 }
	 
	 return(tabArray);
	 
	 }
	
	
		
		
		
}
