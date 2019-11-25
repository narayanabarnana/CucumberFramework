package utilities;

public class TestExcel {

	public static void main(String[] args) {
		
		
		ReadExcelMethods.setExcelFile("C:\\jda\\MaxMinValue.xlsx", "Test1");
//		ReadExcelMethods.getSheetNames();
//		ReadExcelMethods.getRowCount("Test1");
//		ReadExcelMethods.getRowCount("Test2");
//		ReadExcelMethods.getCellDataUsingRowNumberAndColumnNumber("Test1", 1, 1);
//		ReadExcelMethods.getCellDataUsingColumnName("Test1", 2, "TYPE");
//		ReadExcelMethods.printAllSheetData("Test1");
		
		ReadExcelMethods.printAllSheetData("Sheet1");
	}

}
