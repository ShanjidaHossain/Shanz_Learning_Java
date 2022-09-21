package learning.collection.framework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapping_ {

	public static void main(String[] args) {
		//The HashMap class implements the Map interface. We can create a HashMap in two ways:

		// Key, Value
		//Methods are:
		// 		V.put() , V.remove(), V.get(), void clear(), int size(), boolean isEmpty()
		//		boolean replace(K value, V oldVale, V.newValue
		
		
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("One",1);
		hMap.put("Five", 5);
		hMap.put("Seven", 7);
		hMap.put("two", 2);
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"One");
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(2, "two");
		
		
		//A LinkedHashMap object can be created as follows -
		Map<Integer,String> lmap = new LinkedHashMap<Integer,String>();
		lmap.put(1,"One");
		lmap.put(5, "Five");
		lmap.put(7, "Seven");
		lmap.put(2, "two");

		//A TreeMap object can be created as follows -
		Map<Integer,String> tmap = new TreeMap<Integer,String>();
		tmap.put(1,"One");
		tmap.put(5, "Five");
		tmap.put(7, "Seven");
		tmap.put(2, "two");

		

	}

}
