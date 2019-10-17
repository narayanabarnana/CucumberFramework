package javaNotes;

public class InterruptedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(10000);
		} catch (java.lang.InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
