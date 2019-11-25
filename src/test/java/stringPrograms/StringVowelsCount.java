package stringPrograms;

public class StringVowelsCount {

	public static void main(String[] args) {
		
		
		String s="This is Java";
		s=s.toLowerCase();
		int vowelscount=0;
		int conscount=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u')
			{
				vowelscount++;
			}
			else if(s.charAt(i) >= 'a' || s.charAt(i) >='z')
			{
				conscount++;
			}
			
			
		}
		
		System.out.println("vowels count from string " + vowelscount);
		System.out.println("consonants count from string " + conscount);

	}

}
