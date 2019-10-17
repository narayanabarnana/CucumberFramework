package methodOverloading;

public class Case4 {

	public void m1(int i,float f) {
		System.out.println("int-float version");
	}
	public void m1(float f,int i) {
		System.out.println("float-int version");
	}
	public static void main(String[] args) {
		Case4 c4=new Case4();
		c4.m1(10, 10.5f);
		c4.m1(10.5f, 10);
		//c4.m1(10, 10); //The method m1(int, float) is ambiguous for the type Case4
		//c4.m1(10.5f, 10.5f); //The method m1(float, int) in the type Case4 is not applicable for the arguments (float, float)
	}
}
