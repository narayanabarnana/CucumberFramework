package stringPrograms;

public class CharacterCount {

	public static void main(String[] args) {
		
		String s="Narayana";
		
		
		int len=s.length()-s.replace("a", "").length();
		System.out.println(len);
	}

}
