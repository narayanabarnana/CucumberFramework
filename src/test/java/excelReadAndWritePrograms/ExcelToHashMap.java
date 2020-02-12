package excelReadAndWritePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashMap {


	public static Map<String, Map<String, String>> setMapData() throws Exception
	{

		String path="";
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheetAt(0);
		int lastrow=sheet.getLastRowNum();

		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
		Map<String, String> dataMap = new HashMap<String, String>();

		//Looping over entire  row
		for(int i=0;i<lastrow;i++)
		{
			Row row=sheet.getRow(i);

			//0th cell as key
			Cell keyCell = row.getCell(0);

			//1at Cell as value
			Cell valueCell = row.getCell(0);

			String value = valueCell.getStringCellValue().trim();
			String key = keyCell.getStringCellValue().trim();

			//Putting key & value in dataMap
			dataMap.put(key, value);

			//Putting dataMap to excelFileMap
			excelFileMap.put("DataSheet", dataMap);

		}

		//Returning excelFileMap
		return excelFileMap;

	}
	
	
	//Method to retrieve value
		public static String getMapData(String key) throws Exception{
	 
		Map<String, String> m = setMapData().get("DataSheet");
			String value = m.get(key);
			
			return value;
			
		}

	public static void main(String[] args) throws Exception {

		ExcelToHashMap r = new ExcelToHashMap();
		
		String val = r.getMapData("search");
		
		System.out.println("Value of the keyword (search) is- "+val);

	}

}
