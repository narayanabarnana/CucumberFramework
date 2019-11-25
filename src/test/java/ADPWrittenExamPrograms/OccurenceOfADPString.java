package ADPWrittenExamPrograms;

import java.util.HashMap;

public class OccurenceOfADPString {


	static int countFreq(String pat, String txt) {         
		int M = pat.length();  
		System.out.println("lenght of Pat is " + M);

		int N = txt.length();   
		System.out.println("lenght of txt is " + N);

		int minus=N - M;
		System.out.println("length of pat-txt " + minus);
		int res = 0; 

		/* A loop to slide pat[] one by one */
		for (int i = 0; i <= N - M; i++) { 

			int j;             
			for (j = 0; j < M; j++) 
			{ 
				
				if (txt.charAt(i + j) != pat.charAt(j)) { 
					break; 
				} 
				
			} 


			if (j == M) 
			{                 
				res++;                 
				j = 0;                 
			}    
        
		}         
		return res; 
	}
	public static void main(String[] args) {

		String txt = "ADPADPINDIAINDIAADP";         
		String pat = "ADP";         
		System.out.println(countFreq(pat, txt)); 



	}

}
