package wrapperClasses;

public class CreatingWrapperObject {

	public static void main(String[] args) {
		
		
		Integer myInt = 50;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		
		System.out.println(myInt.intValue());
		System.out.println(myChar.charValue());
		System.out.println(myDouble.doubleValue());
		
		//To convert Integer to String
		String myString = myInt.toString();
		System.out.println(myString);
		System.out.println(myString.length());

	}

}
