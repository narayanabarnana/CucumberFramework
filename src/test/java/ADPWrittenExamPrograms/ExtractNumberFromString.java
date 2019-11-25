package ADPWrittenExamPrograms;

public class ExtractNumberFromString {

	public static void main(String[] args) {
	
		String s="java123!@#4sd5fasdf8";
		
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				System.out.print(c);
			}
			
			
		}

	}

}
