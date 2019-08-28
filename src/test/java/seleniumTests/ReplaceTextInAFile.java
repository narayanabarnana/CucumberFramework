package seleniumTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReplaceTextInAFile {
	
	public static void modifyTextFile(String textfilepath,String oldString, String newString) throws Exception
	{
		
		File fileToBeModified=new File(textfilepath);
		String oldContent = "";
		BufferedReader reader = null;
        FileWriter writer = null;
        
        reader = new BufferedReader(new FileReader(fileToBeModified));
        
        //Reading all the lines of input text file into oldContent
        
        String line = reader.readLine();
        System.out.println(line);
        
        while (line != null) 
        {
            oldContent = oldContent + line + System.lineSeparator();
            
            line = reader.readLine();
            
            //System.out.println(line);
            
            
        }
        
      //Replacing oldString with newString in the oldContent
        
        String newContent = oldContent.replaceAll(oldString, newString);
        
      //Rewriting the input text file with newContent
        
        writer = new FileWriter(fileToBeModified);
        
        writer.write(newContent);
        
        reader.close();
        
        writer.close();
		
	}
	
	
	public static void main(String[] args) throws Exception
    {
		modifyTextFile("C:\\Facts\\Trunk\\foundation\\tests\\pkbfstrupd\\full\\req20181_03_01_01_setup.sql", "Insert into", "INSERT INTO <MSSQL>PKBFOUNDATION.<END MSSQL>");
		//modifyTextFile("C:\\Users\\1024812\\Desktop\\Regression Testing Docs\\req20181_03_01_01_setup.sql", "delete", "delete from <MSSQL>pkbfoundation.<END MSSQL>");
		System.out.println("Insert into done");
		
		modifyTextFile("C:\\Facts\\Trunk\\foundation\\tests\\pkbfstrupd\\full\\req20181_03_01_01_setup.sql", "from", "FROM <MSSQL>pkbfoundation.<END MSSQL>");
		System.out.println("select from done");
		
		modifyTextFile("C:\\Facts\\Trunk\\foundation\\tests\\pkbfstrupd\\full\\req20181_03_01_01_setup.sql", "update", "update <MSSQL>pkbfoundation.<END MSSQL>");
        System.out.println("update done");
    }
	
	
	
	
}
