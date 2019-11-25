package wrapperClasses;

import java.util.ArrayList;

public class AutoBoxing {

	public static void main(String[] args) {
		
		
		char ch = 'a';
		
		//Autoboxing - Primitive to Character Object conversion
		Character a = ch;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		// Autoboxing because ArrayList stores only objects 
		al.add(200);
		
		//Printing the value from object.
		System.out.println(al.get(0));
		

	}

}
