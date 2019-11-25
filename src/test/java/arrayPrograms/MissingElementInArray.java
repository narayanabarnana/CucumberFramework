package arrayPrograms;

public class MissingElementInArray {

	/*
	 * Example :
		If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. 
		For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). 
		You have to find out that missing number.
	 *  Solution:
	 *  Step 1 : First we find out sum of ‘n’ numbers by using formula n*(n+1)/2.

		Step 2 : Then we will find sum of all elements of array ‘a’.

		Step 3 : Missing_Number = (Sum of 1 to ‘n’ numbers) – (Sum of elements of array ‘a’)
	 * 
	 * 
	 * 
	 */

	static int sumOfNumbers(int n)
	{
		int sum = (n*(n+1))/2;
		return sum;
	}

	static int sumOfElements(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum = sum+array[i];

		}
		return sum;
	}
	public static void main(String[] args) {

		int n=8;
		int[] a= {1,3,4,5,6,7,8};

		int sumOfNumbers = sumOfNumbers(n);

		int sumOfElements = sumOfElements(a);

		int missingNumber = sumOfNumbers-sumOfElements;

		System.out.println("The missing number is " + missingNumber);

	}

}
