package java8Features;

public class VehicleImplementsClass implements Vehicle{
	
	public void Test(){
		
		Vehicle.super.print();
		Vehicle.statichorn();
	}
	
	public static void main(String[] args) {
		
		VehicleImplementsClass vc=new VehicleImplementsClass();
		vc.Test();
		
	}

}
