package arrayPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class OccurenceCountOfEachStringElement {
	
	static void printOccurenceCount(String[] inputArray)
	{
		
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String i: inputArray) {
			
			
			if(hm.containsKey(i)) {				
				hm.put(i, hm.get(i)+1);					
			}
			else {
				hm.put(i, 1);
			}
		}
		

		System.out.println("Input Array : "+Arrays.toString(inputArray));
        
        System.out.println("Element Count : "+hm);
		
		
	}

	public static void main(String[] args) {
		
		
		printOccurenceCount(new String[]{"Nari","Mani","Nari","Prakhar"});

	}

}
