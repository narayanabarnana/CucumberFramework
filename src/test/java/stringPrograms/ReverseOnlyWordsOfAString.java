package stringPrograms;

public class ReverseOnlyWordsOfAString {

	public static void main(String[] args) {

		//Example: Welcome to Java
		//output: emocleW ot avaJ
		
		String str = "Welcome to Java";
		
		String[] strArray = str.split(" ");
		
		for(String temp : strArray)
		{
			System.out.print(temp + " ");
		}
		
		System.out.println();
		
		for(int i=0;i< strArray.length;i++)
		{
			char[] s1=strArray[i].toCharArray();
			for(int j=s1.length-1;j>=0;j--)
			{
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
	}

}
