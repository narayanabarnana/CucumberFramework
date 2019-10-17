package methodOverloading;

public class ReferenceCase5 {
	
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}
	public void m1(Monkey m) {
		System.out.println("Monkey Version");
	}
	public static void main(String[] args) {
		ReferenceCase5 c6=new ReferenceCase5();
		//1
		Animal a=new Animal();
		c6.m1(a); //Animal Version
		//2
		Monkey m=new Monkey();
		c6.m1(m); //Monkey Version
		//3
		Animal a1=new Monkey();
		c6.m1(a1); //Animal Version
	}
}
