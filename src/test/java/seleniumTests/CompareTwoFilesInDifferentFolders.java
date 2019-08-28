package seleniumTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompareTwoFilesInDifferentFolders {

	public static void main(String[] args) throws Exception {
		
		
		File folderA=new File("C:\\Facts\\Trunk\\foundation\\tests\\ekbdbcreate\\ver181\\ORA\\Cycles\\dif_rsp");
		File[] listOfFilesInfolderA= folderA.listFiles();
		
		File folderB=new File("C:\\Facts\\Trunk\\foundation\\tests\\ekbdbcreate\\ver181\\ORA\\Cycles\\dif_std");
		File[] listOfFilesInfolderB= folderB.listFiles();
		
		for(File fileA : listOfFilesInfolderA) {
			
			if(fileA.isFile()) {
				
			
				for (File fileB : listOfFilesInfolderB) {
		             if(fileB.isFile()) 
		             {
		                if((fileA.getName()).equals((fileB.getName()))) {
		                	
		                	
		                	System.out.println("File in Folder A " + fileA + " is equal to " + fileB + " in folder B");
		                	
		                	BufferedReader br1=new BufferedReader(new FileReader(fileA));
		                	BufferedReader br2=new BufferedReader(new FileReader(fileB));
		                	
		                	String line1=br1.readLine();
		                	System.out.println("line 1 is " + line1);
		                	String line2=br2.readLine();
		                	System.out.println("line 1 is " + line2);
		                	
		                	boolean areEqual = true;
		                	
		                	int lineNum=1;
		                	
		                	while(line1 != null || line2!=null )
		                	{
		                		
		                		if(line1 == null || line2 == null) {
		                			
		                			
		                			areEqual = false;
		                			break;
		                			
	                		}else if(! line1.equalsIgnoreCase(line2))
	                        {
	                            areEqual = false;
	                             
	                            break;
	                        }
		                		
		                		
		                		 line1 = br1.readLine();
			                        
			                        line2 = br2.readLine();
			                         
			                        lineNum++;    
		                        
		                        
		                		
		                	}
		                	
		                	if(areEqual)
		                    {
		                        System.out.println("Two files have same content.");
		                    }
		                    else
		                    {
		                        System.out.println("Two files have different content. They differ at line "+lineNum);
		                         
		                        System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		                    }
		                	
		                	
		                	
		                	br1.close();
		                	br2.close();
		                }
		             }
		         } 
				
			}
			
			
		}

	}

}
