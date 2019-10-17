package methodOverloading;

public class ChildParentCase2 {
	
	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(Object o) {
		System.out.println("Object version");
	}

	public static void main(String[] args) {
		ChildParentCase2 cp=new ChildParentCase2();
		cp.m1(new Object());//Object version
		cp.m1("Narayana");//String version
		cp.m1(null);//String version
	}
}
