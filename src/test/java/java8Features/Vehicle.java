package java8Features;

public interface Vehicle {
	
	default void print() {
		System.out.println("default 1");
	}
	
	default void blowhorn() {
		System.out.println("default 2");
	}
	
	static void statichorn() {
		System.out.println("Static horn");
	}
	
	

}
