//package utilities;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelDataConfig {
//	
//	static XSSFWorkbook wb;
//	static XSSFSheet sheet1;
//	public Row row;
//	public  FileInputStream fis;
//	public  String src;
//	private Cell cell;
//	
//	//creating a constructor
//	public ExcelDataConfig(String excelPath) {
//		
//		try 
//		{
//			
//			File src=new File(excelPath);
//			FileInputStream fis=new FileInputStream(src);
//			wb = new XSSFWorkbook(fis);
//			sheet1 = wb.getSheetAt(0);
//		
//		} catch (Exception e) {
//			
//			System.out.println(e.getMessage());
//		}
//		
//	}
//	
//	
//	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
//    public static void setExcelFile(String Path,String SheetName) throws Exception {
//           try {
//               // Open the Excel file
//            FileInputStream ExcelFile = new FileInputStream(Path);
//            // Access the required test data sheet
//            wb = new XSSFWorkbook(ExcelFile);
//            sheet1 = wb.getSheet(SheetName);
////           Log.info("Excel sheet opened");
//            } catch (Exception e){
//                throw (e);
//            }
//    }
//	
//	
//    public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
//		int i;
//		try {
//			int rowCount = ExcelUtils.getRowUsed();
//			for ( i=0 ; i<rowCount; i++){
//				if  (ExcelUtils.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){
//					break;
//				}
//			}
//			return i;
//				}catch (Exception e){
//			//Log.error("Class ExcelUtil | Method getRowContains | Exception desc : " + e.getMessage());
//			throw(e);
//			}
//		}
//	
//	
//	
//	
//	//*********************************************
//	//To get the sheet names of an excel sheet
//	public List<String> getSheetnames(){
//		
//		
//		List<String> sheetnames = new ArrayList<String>();
//		for (int i=0; i<wb.getNumberOfSheets(); i++) {
//			System.out.println("SheetNames are \t"+wb.getSheetName(i));
//			sheetnames.add( wb.getSheetName(i) );
//		}
//		
//		return sheetnames;
//		
//	}
//	
//	//**************To get Rowcount for a specific excel sheet********************************
//	
//	public int getRowcont(String sheetName) {
//		sheet1=wb.getSheet(sheetName);
//		int rowcount=sheet1.getLastRowNum();
//		return rowcount+1;
//	}
//	//End of GetRowCount method
//	
//	//******************cell data of a specific sheet********************************
//	public String getCellData(String sheetName,int rowNum,int ColNum) {
//		
//		sheet1=wb.getSheet(sheetName);
//		row=sheet1.getRow(rowNum);
//		return row.getCell(ColNum).getStringCellValue();
//	}
//	
//	
//	/*   
//		public String getCellData(String sheetName, String colName, int currentSuiteID) method specification :-
//		1)  Return Data inside a particular cell of a particular column
//		2)  sheetName -> name of the excel sheet. 
//		3)  colName -> Refer to the ColumnHeader in xls file
//		4)  currentSuiteID -> Refer to the rowNumber Number in xls file
// */
//	
//	public String getCellData(String sheetName,String colName,int currentSuiteID) {
//		
//		sheet1=wb.getSheet(sheetName);
//		row = sheet1.getRow(0);
//		int colIndex=0;
//		for(int i=0;i<row.getLastCellNum();i++)
//		{
//			if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) {
//				colIndex=row.getCell(i).getColumnIndex();
//			}
//		}
//		
//		if(sheet1.getRow(currentSuiteID-1).getCell(colIndex)!=null){
//			//return sheet1.getRow(currentSuiteId-1).getCell(colIndex).getStringCellValue().trim();
//			String data1=sheet1.getRow(currentSuiteID-1).getCell(colIndex).getStringCellValue().trim();
//			System.out.println("The data for the specific Sheet " + sheetName + " and for row " + currentSuiteID +  " and for column " + colName + " is " +  data1 );
//			return data1;
//		} else {
//			return null;
//		}
//		
//	}
//	
//public String getCellDataWithRowNum(int RowNum,String sheetName,String colName,int currentSuiteID) {
//		
//		sheet1=ExcelDataConfig.wb.getSheet(sheetName);
//		row = ExcelDataConfig.sheet1.getRow(0);
//		int colIndex=0;
//		for(int i=0;i<row.getLastCellNum();i++)
//		{
//			if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) {
//				colIndex=row.getCell(i).getColumnIndex();
//			}
//		}
//		
//		if(sheet1.getRow(currentSuiteID-1).getCell(colIndex)!=null){
//			//return sheet1.getRow(currentSuiteId-1).getCell(colIndex).getStringCellValue().trim();
//			String data1=sheet1.getRow(currentSuiteID-1).getCell(colIndex).getStringCellValue().trim();
//			System.out.println("The data for the specific Sheet " + sheetName + " and for row " + currentSuiteID +  " and for column " + colName + " is " +  data1 );
//			return data1;
//		} else {
//			return null;
//		}
//		
//	}
//	
//	public String getData(int sheetNumber,int row,int column) 
//	{
//	sheet1=wb.getSheetAt(0);
//	String data=sheet1.getRow(row).getCell(column).getStringCellValue();
//	return data;
//	
//	}
//
//	
//	
//	private void openWorkbook(String path) {
//		try {
//			fis = new FileInputStream(path);
//			wb = new XSSFWorkbook(new BufferedInputStream(fis));
//			sheet1 = wb.getSheetAt(0);
//			fis.close();
//	
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	
//	
//	
//	
//	public boolean setCellData(String sheetName,String colName,int rowNum, String data){
//		try{
//		fis = new FileInputStream(src); 
//		wb = new XSSFWorkbook(fis);
//		
//
//		if(rowNum<=0)
//			return false;
//		
//		int index = wb.getSheetIndex(sheetName);
//		int colNum=-1;
//		if(index==-1)
//			return false;
//		
//		
//		sheet1 = wb.getSheetAt(index);
//		
//
//		row=sheet1.getRow(0);
//		for(int i=0;i<20;i++){ // fixing max column search value to 20 as, have row.getLastCellNum is giving error when we try to write in a newly created sheet
//			//System.out.println(row.getCell(i).getStringCellValue().trim());
//			if(row.getCell(i).getStringCellValue().trim().equals(colName))
//				colNum=i;
//		}
//		if(colNum==-1)
//			return false;
//
//		
//		row = sheet1.getRow(rowNum-1);
//		if (row == null)
//			row = sheet1.createRow(rowNum-1);
//		
//		cell = row.getCell(colNum);	
//		if (cell == null) {
//	        cell = row.createCell(colNum);
////	        cell.setCellStyle()
//		}
//
//	    // cell style
//	    //CellStyle cs = workbook.createCellStyle();
//	    //cs.setWrapText(true);
//	    //cell.setCellStyle(cs);
//		cell.setCellValue(data);
//	    //sheet.autoSizeColumn(colNum); 
//	    sheet1.setColumnWidth(colNum, 5000);
//	    
//	
//		    
//	    try{
//	    	BufferedOutputStream brOut = new BufferedOutputStream(new FileOutputStream(src));
//	    	wb.write(brOut);
//		    brOut.close();
//	    }catch(Exception e){
//	    	Thread.sleep(2000);
//	    	BufferedOutputStream brOut = new BufferedOutputStream(new FileOutputStream(src));
//	    	wb.write(brOut);
//		    brOut.close();
//	    }
//    	
//	   //workbook.write(fileOut);
//		//fileOut.close();	
//	    fis.close();
//	    
//	    openWorkbook(src); 
//
//		}
//		catch(Exception e){
//			e.printStackTrace();
//			return false;
//		}
//		return true;
//	}
//	
//
//	
//}
