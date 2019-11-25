package stringPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintStringSequence {

	public static void main(String[] args) {


		String s="Narayana";
		
		String result="";
		
		for(int i=0;i<s.length();i++)
		{
			result=result+s.charAt(i);
			System.out.println(result);
		}
		
//		char[] ch=s.toCharArray();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print(ch[j]);
//			
//			}
//			
//			System.out.println();
//		}

	}
	
}


		
