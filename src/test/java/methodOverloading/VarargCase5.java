package methodOverloading;

public class VarargCase5 {

	public void m1(int x) {
		System.out.println("General method");
	}
	public void m1(int... x) {
		System.out.println("var-arg method");
	}
	public static void main(String[] args) {
		VarargCase5 vc5=new VarargCase5();
		vc5.m1(); //var-arg method
		vc5.m1(10,20);//var-arg method
		vc5.m1(10); //General method
	}
}
