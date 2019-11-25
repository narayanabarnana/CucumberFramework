package stringPrograms;

public class SwapTwoStringsWithoutThridVariable {

	public static void main(String[] args) {
		
		
		String a="Hello";
		String b="World";
		
		//append second string to first string
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After swapping : a = " + a + " b = ");
		

	}

}
