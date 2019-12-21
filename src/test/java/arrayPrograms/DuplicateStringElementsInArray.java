package arrayPrograms;

//using Hashset
/*
 * Few important features of HashSet are:

Implements Set Interface.
Underlying data structure for HashSet is hashtable.
As it implements the Set Interface, duplicate values are not allowed.
Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
NULL elements are allowed in HashSet.
HashSet also implements Searlizable and Cloneable interfaces.
 * 
 */

import java.util.HashSet;

public class DuplicateStringElementsInArray {

	public static void main(String[] args) {

		String[] strArray= {"java","JSP","java"};
		
		HashSet<String> set=new HashSet<String>();
		
		for(String arrayElement : strArray)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
			
		}
		

	}

}

/*
 * public class MainClass 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
  
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }    
}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
