package stringPrograms;

public class LengthOfAString {

	public static void main(String[] args) {
		
		String s="Narayana";
		
		char[] ch=s.toCharArray();
		int i=0;
		
		for(char c : ch)
		{
			i++;
		}
		
		System.out.println("The lenght of the string is " + i);
 
	}

}
