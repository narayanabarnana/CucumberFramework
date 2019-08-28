package seleniumTests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestIO {

	 static StringBuilder sbword = new StringBuilder();
	 static String dirname = null;
	 static File[] filenames = null;
	 static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) throws FileNotFoundException, IOException{
	    boolean fileread = ReadFiles();

	    sbword = null;
	    System.exit(0);



	}
	private static boolean ReadFiles() throws FileNotFoundException, IOException{

	    System.out.println("Enter the location of folder:");


	    File file = new File("C:\\Facts\\Trunk\\quartz\\tests\\cimevents\\SQL Files");
	    
	    filenames = file.listFiles();
	    String line = null;

	    for(File file1 : filenames ){
	    System.out.println("File name" + file1.toString());
	    sbword.setLength(0); 
	    BufferedReader br = new BufferedReader(new FileReader(file1));

	    line = br.readLine();

	    while(line != null){
	        System.out.println(line);
	        sbword.append(line).append("\r\n");
	        line = br.readLine();
	        }

	    ReplaceLines();
	    WriteToFile(file1.toString());

	    }

	    return true;    
	}

	private static void ReplaceLines(){
	    System.out.println("sbword contains :" + sbword.toString());
	    //System.out.println("Enter the word to replace from each of the files:");
	    //String from = sc.nextLine();
	    //System.out.println("Enter the new word");
	    //String To = sc.nextLine();

	    //StringBuilder sbword = new StringBuilder(stbuff);
	    
	    
	   
	    
 	    ReplaceAll(sbword,"from","from <MSSQL>PKBFOUNDATION.<END MSSQL>");
	    ReplaceAll(sbword,"FROM","FROM <MSSQL>PKBFOUNDATION.<END MSSQL>");
	    ReplaceAll(sbword,"Insert into","INSERT INTO <MSSQL>PKBFOUNDATION.<END MSSQL>");
	    ReplaceAll(sbword,"INSERT INTO","INSERT INTO <MSSQL>PKBFOUNDATION.<END MSSQL>");
	    ReplaceAll(sbword,"update","update <MSSQL>PKBFOUNDATION.<END MSSQL>");
	    ReplaceAll(sbword,"insert into","insert into <MSSQL>PKBFOUNDATION.<END MSSQL>");
	    
	   
	    
	    
//	    ReplaceAll(sbword,"<MSSQL>pkbfoundation.<END MSSQL><MSSQL>pkbfoundation.<END MSSQL>","<MSSQL>pkbfoundation.<END MSSQL>");
//	    ReplaceAll2(sbword,"<MSSQL>pkbfoundation.<END MSSQL><MSSQL>PKBFOUNDATION.<END MSSQL>","<MSSQL>pkbfoundation.<END MSSQL>");
//	    ReplaceAll3(sbword,"<MSSQL>pkbfoundation.<END MSSQL><MSSQL>PKBFoundation.<END MSSQL>","<MSSQL>pkbfoundation.<END MSSQL>");
//	    ReplaceAll4(sbword,"<MSSQL>PKBFOUNDATION.<END MSSQL><MSSQL>PKBFoundation.<END MSSQL>","<MSSQL>PKBFoundation.<END MSSQL>");
//	    ReplaceAll5(sbword,"<MSSQL>PKBFOUNDATION.<END MSSQL><MSSQL>PKBFOUNDATION.<END MSSQL>","<MSSQL>PKBFOUNDATION.<END MSSQL>");
//	    ReplaceAll5(sbword,"<MSSQL>PKBFOUNDATION.<END MSSQL><MSSQL>pkbfoundation.<END MSSQL>","<MSSQL>PKBFOUNDATION.<END MSSQL>");
	    
	    ReplaceAll(sbword,"<END MSSQL> ","<END MSSQL>");
	    
	    
	    //String inputString="FROM <MSSQL>pkbfoundation.<END MSSQL>";
	    //inputString.replaceAll("<MSSQL>pkbfoundation.<END MSSQL> ", "");


	}
	
	
	private static void ReplaceAll(StringBuilder builder, String from, String to){
	    int index = builder.indexOf(from);
	    while(index != -1){
	        builder.replace(index, index + from.length(), to);
	        index += to.length();
	        index = builder.indexOf(from,index);
	    }
	}
	
	
	private static void ReplaceAll2(StringBuilder builder, String from, String to){
	    int index = builder.indexOf(from);
	    while(index != -1){
	        builder.replace(index, index + from.length(), to);
	        index += to.length();
	        index = builder.indexOf(from,index);
	    }
	}
	
	private static void ReplaceAll3(StringBuilder builder, String from, String to){
	    int index = builder.indexOf(from);
	    while(index != -1){
	        builder.replace(index, index + from.length(), to);
	        index += to.length();
	        index = builder.indexOf(from,index);
	    }
	}
	
	
	private static void ReplaceAll4(StringBuilder builder, String from, String to){
	    int index = builder.indexOf(from);
	    while(index != -1){
	        builder.replace(index, index + from.length(), to);
	        index += to.length();
	        index = builder.indexOf(from,index);
	    }
	}
	

	private static void ReplaceAll5(StringBuilder builder, String from, String to){
	    int index = builder.indexOf(from);
	    while(index != -1){
	        builder.replace(index, index + from.length(), to);
	        index += to.length();
	        index = builder.indexOf(from,index);
	    }
	}
	
	private static void WriteToFile(String filename) throws IOException{
	   try{
	    File file1 = new File(filename);
	    BufferedWriter bufwriter = new BufferedWriter(new FileWriter(file1));
	    bufwriter.write(sbword.toString());
	    bufwriter.close();

	    }catch(Exception e){
	         System.out.println("Error occured while attempting to write to file: " +     e.getMessage());
	    }

	}
	
}