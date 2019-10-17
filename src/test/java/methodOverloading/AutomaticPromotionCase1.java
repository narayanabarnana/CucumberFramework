package methodOverloading;

public class AutomaticPromotionCase1 {	
	
	public void m1(int i) {
		System.out.println("Int-args");
	}	
	public void m1(float f) {
		System.out.println("Float-args");
	}	
	public static void main(String[] args) {
		
		AutomaticPromotionCase1 AP=new AutomaticPromotionCase1();
		AP.m1(10);//Int-args
		AP.m1(10.5f);//Float-args
		AP.m1('a');//Int-args because char is promoted to int
		AP.m1(10l);//Float-args because long is promoted to float	
		//AP.m1(10.5); //compile error because we cant promote double	
	}
}
