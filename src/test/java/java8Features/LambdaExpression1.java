package java8Features;

import java.util.ArrayList;

public class LambdaExpression1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Selenium");
		al.add("UFT");
		al.add("appium");
		
		al.forEach(item -> System.out.println(item));
		
		
		
		
		

	}

}
