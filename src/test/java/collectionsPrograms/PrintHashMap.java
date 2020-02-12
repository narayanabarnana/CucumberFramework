package collectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintHashMap {

	public static void main(String[] args) {


		HashMap<Integer, String> hm=new HashMap<Integer, String>();

		hm.put(111, "ABC");
		hm.put(222, "DEF");
		hm.put(333, "GHI");


		//entryset: Returns a Set view of the mappings contained in this map. The set is backed by the map, 
		//so changes to the map are reflected in the set, and vice-versa.
//		Set set = hm.entrySet();
//		Iterator iterator = set.iterator(); //iterator: Returns an iterator over the elements in this set. 
//		while(iterator.hasNext()) {
//			
//			//Map.Entry : A map entry (key-value pair). The Map.entrySet method returns a collection-view of the map, whose elements are of this class. 
//			Map.Entry mentry = (Map.Entry)iterator.next();
//			System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//			System.out.println(mentry.getValue());
//		}
		
		for( Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		Map<Integer, String> mp=new TreeMap<Integer, String>(hm);
		
		System.out.println("After sorting : ");
		
		for( Map.Entry m1 : mp.entrySet())
		{
			System.out.println(m1.getKey() + " " + m1.getValue());
		}


	}

}
