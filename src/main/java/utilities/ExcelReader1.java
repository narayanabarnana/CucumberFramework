package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {
	
	public static final String ExXCELFILELOCATION="C:\\Users\\Narayana\\Downloads\\ConditioningsheetRRSP.xlsx";
	
	private static FileInputStream fis;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	
	public static void loadExcel() throws Exception{
		
		
		System.out.println("Loading excel data");
		
		File file=new File(ExXCELFILELOCATION);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet("Sheet1");
		fis.close();
		
	}

	
	public static Map<String, Map<String, String>> getDataMap() throws Exception
	{
		if(sheet==null)
		{
			loadExcel();
			
			
			
		}
		Map<String , Map<String, String>> supermap=new HashMap<String , Map<String, String>>();
		Map<String, String> mymap=new HashMap<String, String>();
		
		for(int i=1;i<sheet.getLastRowNum();i++)
		{
			row = sheet.getRow(i);
			String KeyCell=row.getCell(0).getStringCellValue();
			
			int ColNum=row.getLastCellNum();
			
			for(int j=1;j<ColNum;j++)
			{
				
				
				String value=row.getCell(1).getStringCellValue();
				
				mymap.put(KeyCell,value);
				
			}
			
			supermap.put("MASTERDATA",mymap);
			
			
		}
		
		return supermap;
		
		
	}
	
	
	public static String getValue(String key) throws Exception
	{
		
		Map<String, String> myval=getDataMap().get("MASTERDATA");
		String retValue = myval.get(key);
		
		return retValue;
		
		
	}
	
	public static void main(String[] args) throws Exception
	{
		System.out.println(getValue("TaxYear"));
	}
	
	
}
