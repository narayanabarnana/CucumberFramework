package stringPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class StringSortingAscendingDescending {

	
	
	public static String sortString(String inputString)
	{
		char tempArray[] = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
	
	public static String sortMixedString(String inputString)
	{
		//char tempArray[] = inputString.toCharArray();
		Character tempArray[] = new Character[inputString.length()]; 
        for (int i = 0; i < inputString.length(); i++) { 
            tempArray[i] = inputString.charAt(i); 
        } 
		Arrays.sort(tempArray, new Comparator<Character>() {
			public int compare(Character c1, Character c2) 
            { 
                // ignoring case 
                return Character.compare(Character.toLowerCase(c1), 
                                        Character.toLowerCase(c2)); 
            } 
		});
		
		// using StringBuilder to convert Character array to String
		StringBuilder sb = new StringBuilder(tempArray.length); 
        for (Character c : tempArray) 
            sb.append(c.charValue()); 
  
        return sb.toString();
		
	}
	public static void main(String[] args) {
		
		String inputString = "narayana";
		String outputString=sortString(inputString);
		
		System.out.println("InputString :" + inputString );
		System.out.println("OutputString : " + outputString);
		
		
		String inputString1 = "GeeksforGeeks"; 
        String outputString1 = sortMixedString(inputString1); 
          
        System.out.println("Input String : " + inputString1); 
        System.out.println("Output String : " + outputString1); 

	}

}


/*use of Comparator
 *A comparison function, which imposes a total ordering on some collection of objects. 
 *Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to allow precise control over the sort order. 
 *Comparators can also be used to control the order of certain data structures (such as sorted sets or sorted maps), or to provide an ordering for collections of objects that don't have a natural ordering.

The ordering imposed by a comparator c on a set of elements S is said to be consistent with equals if and only if c.compare(e1, e2)==0 has the same boolean value as e1.equals(e2) for every e1 and e2 in S.

 * 
 * public int compare(Object o1, Object o2)
{
     // have to return -ve if o1 has to come before o2
     // have to return +ve if o1 has to come after o2
     // have to return 0 if o1 is equal to o2
}
 * */
