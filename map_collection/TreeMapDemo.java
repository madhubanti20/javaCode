package map_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap mp = new TreeMap();
		mp.put(4, "Hello");
//		mp.put(2.78, 11); //--> will throw class cast excepion;
		mp.put(3, 'd');
		mp.put(3, null);
		mp.put(4, null);
		System.out.println(mp);
		System.out.println(mp.containsKey(3));
		System.out.println(mp.containsValue("Hello"));
		System.out.println(mp.replace(6, 33));
		System.out.println(mp.replace(4, null, 20));
		System.out.println(mp);

//		TreeMap tm = new TreeMap((o1,o2)->(Integer)o2 - (Integer)o1); //-->sort in descending order
//		System.out.println(tm);
		
		TreeMap<String,List<String>> tm1 = new TreeMap();
		List<String> l1 = Arrays.asList("Kolkata","Blr","Hydrabad");
		List<String> l2 = Arrays.asList("J&K","Assam","Mizoram");
//		l1.add("M"); //--> can not add cuz list id fixed	
		tm1.put("SBI", l1);
		tm1.put("CBI", l2);
		System.out.println(tm1);
		
		//to print key
		Set<String> s = tm1.keySet();
		Iterator<String> it1 = s.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("```````````````````````````````````");
		
		// to print values
		Collection<List<String>> c = tm1.values();
		Iterator<List<String>> it2 = c.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		// to print whole entry
		Set<Entry<String,List<String>>> s1 = tm1.entrySet();
		Iterator<Entry<String, List<String>>> it3 = s1.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		for(Entry<String,List<String>> e: s1 ) {
			System.out.println(e.getKey()+" ..........."+e.getValue());
		}
		
	}
}

