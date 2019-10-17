package javaNotes;

public class Test {
	
	static int x=10;
	int y=20;
	
	public void m1() {
		
		Test t11=new Test();
		System.out.println(t11.y);
	}

	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.x=888;
		t1.y=999;
		System.out.println(t1.x + "--------" + t1.y);
		
		Test t2=new Test();
		System.out.println(t2.x + "--------" + t2.y);
		
		t1.m1();
		
		

	}

}
