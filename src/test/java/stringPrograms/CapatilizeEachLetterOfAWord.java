package stringPrograms;

public class CapatilizeEachLetterOfAWord {

	public static void main(String[] args) {
		
		//Example: welcome to java
		//Output: Welcome To Java
		
		String str="welcome to java";
		String[] words=str.split(" ");
		
		String capitalsen="";
		
		for(String w: words)
		{
			String first=w.substring(0,1); //returns w for the word welcome
			//System.out.println(first);
			String afterFirst=w.substring(1); //returns elcome for the word welcome
			//System.out.println(afterFirst); //output: welcome
			capitalsen+=first.toUpperCase()+afterFirst	+" "; 
		}
			
		System.out.println(capitalsen);

	}

}

 


//first iteration welcome stores in w
//String first=w.substring(0,1); //returns w for the word welcome so output: w
//String afterFirst=w.substring(1); //returns elcome from the word welcome
//capitalsen+=first.toUpperCase()+afterFirst	+" ";
	// first.toUpperCase() : first has letter w so it got capitalized
    // first.toUpperCase()+afterFirst //appending afterFirst output to W
    


/*
 * w
elcome
t
o
j
ava
Welcome To Java 
 * */
