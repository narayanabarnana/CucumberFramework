package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollectionString {
	
	public static void main(String[] args) {
		
		
		//sort elements in ascending order
		ArrayList<String> al=new ArrayList<String>();
		al.add("narayana");
		al.add("mani");
		al.add("prakhar");
		
		System.out.println("Before Sorting : " + al);
		
		Collections.sort(al);
		
		System.out.println("After Sorting in ascending order: " + al);
		
		//sort elements in descending order
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println("After sorting in descending order : " + al);
	}

}
