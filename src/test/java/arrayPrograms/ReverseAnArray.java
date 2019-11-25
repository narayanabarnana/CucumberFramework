package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {

	static void reverseArray(int[] array, int n) {

		// creating a new Array
		int[] b = new int[n];
		int j = n;

		for (int i = 0; i < n; i++) {
			b[j - 1] = array[i];
			j = j - 1;

		}

		System.out.print(" Reverse Array is:");
		for (int k = 0; k < n; k++) {
			System.out.println(b[k]);
		}

	}

	//second method to reverse an Array
	static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
	 

	public static void main(String[] args) {

		int[] array = new int[] { 10, 12, 98, 76 };
		reverseArray(array, array.length);
		
		Integer a[]= {12,13,14,15};
		reverse(a);

	}

}
