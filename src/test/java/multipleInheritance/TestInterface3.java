package multipleInheritance;

public class TestInterface3 implements Printable, Showable{

	public static void main(String[] args) {
		
		TestInterface3 t=new TestInterface3();
		t.show();
		t.m1();

	}

	@Override
	public void show() {

		System.out.println("Show method");
		
	}

	@Override
	public void print() {
		
		System.out.println("Print method");
		
	}

	@Override
	public void m1() {
		
		System.out.println("Same method");
		
	}

}
