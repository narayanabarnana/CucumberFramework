package methodOverloading;

public class ChildClassSameLevelCase3 {

	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(StringBuffer s1) {
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) {
		ChildClassSameLevelCase3 ccsl=new ChildClassSameLevelCase3();
		ccsl.m1("Narayana");
		ccsl.m1(new StringBuffer("Narayana"));
		//ccsl.m1(null);//compile error: The method m1(String) is ambiguous for the type ChildClassSameLevel
	}
}
