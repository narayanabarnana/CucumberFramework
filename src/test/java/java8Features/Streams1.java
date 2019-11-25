package java8Features;

import java.util.ArrayList;
import java.util.List;

public class Streams1 {

	public static void main(String[] args) {
		
	
		
		List<String> names = new ArrayList<>();
		names.add("David");		         
		names.add("Johnson");		         
		names.add("Samontika");		         
		names.add("Brijesh");		         
		names.add("John");
		//Print all elements
		names.stream().sorted().forEach(System.out::println);
		System.out.println("******************");
		//1)selecting names containing more than 5 characters
		names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
		System.out.println("******************");
		//2)select only unique names
		names.stream().distinct().forEach(System.out::println);
		System.out.println("******************");
		//3)select first 4 elements
		names.stream().limit(4).forEach(System.out::println);
		System.out.println("**************");
		//Skipping first 4 names
		names.stream().skip(3).forEach(System.out::println);
		//Mappig operations
		System.out.println("************************");
		names.stream().map(String::length).forEach(System.out::println);
		//Sorting Operations
		//Sorting the names according to natural order
		System.out.println("******************************");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("**************************");
		names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);

	}

}
