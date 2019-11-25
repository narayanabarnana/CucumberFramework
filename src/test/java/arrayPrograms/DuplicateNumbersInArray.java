package arrayPrograms;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		
		
		int[] duplicateArray={1,5,1,3,2,3,2};
		for(int i=0;i<duplicateArray.length;i++)
		{
			for(int j=i+1;j<duplicateArray.length;j++)
			{
				if(duplicateArray[i]==duplicateArray[j] && i!=j)
				{
					System.out.println("duplicate element in Array is " + duplicateArray[i]);
				}

			}
			
		}

	}

}
