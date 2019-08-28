//package utilities;
//
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.pdfbox.cos.COSDocument;
//import org.apache.pdfbox.pdfparser.PDFParser;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
//import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
//import org.apache.pdfbox.pdmodel.interactive.form.PDField;
//import org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
////import junit.framework.Assert;
//import org.testng.Assert;
//
//public class PrintFields
//
//{
//
//    private static String S1 = "C:\\Users\\Narayana\\Downloads\\ConditioningsheetRRSP.xlsx";
//	
//    public void printFields(PDDocument pdfDocument) throws IOException
//
//    {
//
//        PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
//
//        PDAcroForm acroForm = docCatalog.getAcroForm();
//
//        List<PDField> fields = acroForm.getFields();
//
//        System.out.println(fields.size() + " top-level fields were found on the form");
//
//        for (PDField field : fields)
//
//        {
//
//            processField(field, "|--", field.getPartialName());
//
//        }
//
//    }
//
//    private void processField(PDField field, String sLevel, String sParent) throws IOException
//
//    {
//    	Map<String, String> PDFDataMap = new HashMap<String, String>();
//        String partialName = field.getPartialName();
//
//        if (field instanceof PDNonTerminalField)
//
//        {
//
//            if (!sParent.equals(field.getPartialName()))
//
//            {
//
//                if (partialName != null)
//
//                {
//
//                    sParent = sParent + "." + partialName;
//
//                }
//
//            }
//
//            System.out.println(sLevel + sParent);
//
//            for (PDField child : ((PDNonTerminalField)field).getChildren())
//
//            {
//
//                processField(child, "|  " + sLevel, sParent);
//
//            }
//
//        }
//
//        else
//
//        {
//
//            String fieldValue = field.getValueAsString();
//
//            StringBuilder outputString = new StringBuilder(sLevel);
//
//            outputString.append(sParent);
//            //This part will print the partial name of the fields
//
//            /*if (partialName != null)
//
//            {
//
//                outputString.append(".").append(partialName);
//
//            }*/
//
//            outputString.append(" = ").append(fieldValue);
//
//            //outputString.append(",  type=").append(field.getClass().getName());
//            PDFDataMap.put(outputString.toString(), fieldValue);
//
//            //System.out.println(outputString);
//            System.out.println(PDFDataMap);
//            
//            ExcelDataConfig EDC=new ExcelDataConfig("C:\\Users\\Narayana\\Downloads\\ConditioningsheetRRSP.xlsx");
//            String test=EDC.getCellData("Sheet1", "PlanNumber", 2);
//            //System.out.println(test);
//            System.out.println(test);
//            boolean t=PDFDataMap.containsKey(test);
//            System.out.println(t);
//            
//        }
//        
//
//    }
//
//    public static void main(String[] args) throws IOException
//
//    {
//    	HashMap PDFDataMap = new HashMap();
//    	HashMap Excelmap = new HashMap();
//    	
//        PDDocument pdf = null;
//
//        try
//
//        {
//
//                pdf = PDDocument.load(new File("C:\\Users\\Narayana\\Downloads\\192751_19e.pdf")); //D:\\DSC\\RRSP_CR\\192751~19e.pdf
//
//                PrintFields exporter = new PrintFields();
//
//                exporter.printFields(pdf);
//                
//
//                if(PDFDataMap.keySet().equals(Excelmap.keySet() )){
//                	
//                	
//                	System.out.println(PDFDataMap.keySet());
//                	System.out.println(Excelmap.keySet());
//                	System.out.println("Verified");
//                }
//                else
//                {
//                System.out.println("Not Verified");
//                	
//                }
//   
//     
//        }
//
//        finally
//
//        {
//
//            if (pdf != null)
//
//            {
//
//                pdf.close();
//
//            }
//
//        }
//
//    }
//    
//
//    private static void usage()
//    {
//
//        System.err.println("usage: org.apache.pdfbox.examples.interactive.form.PrintFields <pdf-file>");
//
//   
//    }
//
//
//	
//
//	 public static HashMap Excelmap(File S1)
//    {
//        // Used the LinkedHashMap and LikedList to maintain the order
//        HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
//
//        LinkedHashMap<Integer, List> Excelmap = new LinkedHashMap<Integer, List>();
//
//        String sheetName = null;
//        // Create an ArrayList to store the data read from excel sheet.
//        // List sheetData = new ArrayList();
//        FileInputStream fis = null; 
//        try
//        {
//            fis = new FileInputStream("C:\\Users\\Narayana\\Downloads\\ConditioningsheetRRSP.xlsx");
//            // Create an excel workbook from the file system
//            XSSFWorkbook workBook = new XSSFWorkbook(fis);
//            // Get the first sheet on the workbook.
//            for (int i = 0; i < workBook.getNumberOfSheets(); i++)
//            {
//                XSSFSheet sheet = workBook.getSheetAt(i);
//                // XSSFSheet sheet = workBook.getSheetAt(0);
//                sheetName = workBook.getSheetName(i);
//
//                Iterator rows = sheet.rowIterator();
//                while (rows.hasNext())
//                {
//                    XSSFRow row = (XSSFRow) rows.next();
//                    Iterator cells = row.cellIterator();
//
//                    List data = new LinkedList();
//                    while (cells.hasNext())
//                    {
//                        XSSFCell cell = (XSSFCell) cells.next();
//                        cell.setCellType(Cell.CELL_TYPE_STRING);
//                        data.add(cell);
//                    }
//                    Excelmap.put(row.getRowNum(), data);
//
//                    // sheetData.add(data);
//                }
//                outerMap.put(sheetName, Excelmap);
//                Excelmap = new LinkedHashMap<Integer, List>();
//            }
//
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        finally
//        {
//            if (fis != null)
//            {
//                try
//                {
//                    fis.close();
//                }
//                catch (IOException e)
//                {
//                   
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return outerMap;
//    }
//}
//
//
//
//
//
