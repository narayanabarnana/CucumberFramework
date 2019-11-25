package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInAnArray {

	//method to print integer array elements in an ascending order
	public static void AscendingOrder(int[] intarr)
	{

		Arrays.sort(intarr);
		System.out.printf("Modified array is " + Arrays.toString(intarr));
		
	}
	
	//Method to print integer array elements in a descending order
	public static void descendingOrder(Integer[] intarr)
	{
		// Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
		Arrays.sort(intarr,Collections.reverseOrder());
		System.out.println();
		System.out.printf("Modified array is " + Arrays.toString(intarr));
	}
	
	//Method to sort strings in alphabetical order
	public static void sortStringArray(String[] strArr)
	{
		
		//Sort in ascending order
		Arrays.sort(strArr);
		System.out.println("Modified array is " + Arrays.toString(strArr));
		
		//Sort in ascending order
		Arrays.sort(strArr,Collections.reverseOrder());
		System.out.println("Modified array is " + Arrays.toString(strArr));
	}
	
	//method to sort a subarray
	public static void sortIntegerSubArray(int[] intarr)
	{
		// Sort subarray from index 1 to 4, i.e., 
        // only sort subarray {7, 6, 45, 21} and 
        // keep other elements as it is. 
        Arrays.sort(intarr, 1, 5); 
  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(intarr));
	}
	public static void main(String[] args) {

		AscendingOrder(new int[] {1,4,2,5,3});
		descendingOrder(new Integer[] {1,4,2,5,3});
		sortStringArray(new String[] {"narayana","mani","tagore"});
		sortIntegerSubArray(new int[] {13, 7, 6, 45, 21, 9, 2, 100});
	}

}
