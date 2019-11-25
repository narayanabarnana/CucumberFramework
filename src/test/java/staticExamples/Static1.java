package staticExamples;

public class Static1 {
	
	static int x;
	int y;
	
	void test() {
		System.out.println(x);
	}
	
	static void m1() {
		//we cant access nonstatic variables inside static block
		//y=20;
	}

	public static void main(String[] args) {
	
		Static1 s=new Static1();
		s.test();

	}

}
