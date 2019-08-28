package seleniumTests;

public class SplitFunctionExample {

	public static void main(String[] args) {
		
		//The java string split() method splits this string against given regular expression and returns a char array.
		//Returns array of strings
		//Throws PatternSyntaxException if pattern for regular expression is invalid
		String str="Deal: 10185 :";
		
		String[] splitstr=str.split(":");
		System.out.println(splitstr[1].trim());
		
		for(String a : splitstr) {
			System.out.println(a.trim());
		}
		

	}

}
