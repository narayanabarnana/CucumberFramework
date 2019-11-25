package excelReadAndWritePrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelMethods {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static Row row;



	public static void setExcelFile(String excelPath, String sheetName)
	{

		try {

			// Open the Excel file
			FileInputStream ExcelFile=new FileInputStream(excelPath);

			// Access the required test data sheet
			workbook = new XSSFWorkbook(ExcelFile);
			sheet = workbook.getSheet(sheetName);

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
	}


	//Method to get the sheet names of an excel sheet
	public static List<String> getSheetNames()
	{

		List<String> sheetNames = new ArrayList<String>();
		for(int i=0;i<workbook.getNumberOfSheets();i++)
		{
			System.out.println(" Sheet Names are " + workbook.getSheetName(i));
			sheetNames.add(workbook.getSheetName(i));
		}

		return sheetNames;

	}


	//Method to get RowCount of a Specific Excel Sheet
	public static int getRowCount(String sheetName)
	{
		sheet=workbook.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		System.out.println("Total Rows in sheet " + sheetName + " are " + (rowCount+1));
		return rowCount+1;
	}



	//Method to retrieve cell data of a specific sheet using rowNumber and columnNumber
	public static String getCellDataUsingRowNumberAndColumnNumber(String sheetName,int rowNumber , int colNumber)
	{
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rowNumber);
		String celldata=row.getCell(colNumber).getStringCellValue();
		System.out.println(" The cell data for row " + rowNumber + " column " + colNumber + " is " + celldata);
		return celldata;
	}



	//Method to retrieve cell data of a specific sheet using rowNumber, columnName
	public static String getCellDataUsingColumnName(String sheetName, int rowNumber, String columnName)
	{

		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(0);
		int columnIndex=0;

		for(int i=0; i<row.getLastCellNum() ;i++)
		{

			if(row.getCell(i).getStringCellValue().equalsIgnoreCase(columnName))
			{
				columnIndex=row.getCell(i).getColumnIndex();
			}

		}

		if(sheet.getRow(rowNumber-1).getCell(columnIndex) != null)
		{
			String celldata=sheet.getRow(rowNumber-1).getCell(columnIndex).getStringCellValue().trim();
			System.out.println("The data for the specific Sheet " + sheetName + " and for row " + rowNumber +  " and for column " + columnName + " is " +  celldata );
			return celldata;
		}
		else
		{
			return null;
		}
	}


	//Method to print all data from the excel
	public static void printAllSheetData(String sheetName)
	{
		List<Object> al=new ArrayList<Object>();
		sheet=workbook.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		for(int i=0;i<rowCount+1;i++)
		{
			int columnCount=sheet.getRow(i).getLastCellNum();
			System.out.println("Number of columns for row " + i + " are " + columnCount);
			for(int j=0;j<columnCount;j++)
			{
				//DataFormatter contains methods for formatting the value stored in an Cell. 
				//This can be useful for reports and GUI presentations when you need to display data exactly as it appears in Excel. 
				//Supported formats include currency, SSN, percentages, decimals, dates, phone numbers, zip codes, etc. 
				DataFormatter formatter=new DataFormatter();
				String value=formatter.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(" Data for row " + i +  " and for column " + j + " is " + value);
				al.add(value);
			}
		}

		System.out.println(al);
		
			


	}

}
