package Lec_37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hashmap_example {
	public static void main(String[] args) {
//		HashMap<Key, Value> map = new HashMap<>();
		HashMap<String, Integer> map = new HashMap<>();
//		put a pair in yout map!! O(1)
		map.put("A", 10);
		map.put("D", 10);
		map.put("E", 10);
		map.put("B", 10);
		map.put("C", 10);
		map.put("F", 10);
		System.out.println(map);
//		map insertion ke order preserve nahi karta!! just like heap and PQ

		map.put("A", 99);
//		map, pair will never have a duplicate key!!
//		all keys in your map will be unique!!
		System.out.println(map);

//		Get value from your key!! O(1)
		System.out.println(map.get("A"));
		System.out.println(map.get("AAA")); // if key does not exist gives null!!

//		check if your map contains a key!!  O(1)
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("AA"));

//		remove!! O(1)
		System.out.println(map.remove("A"));
		System.out.println(map);

//		get keys!!
		System.out.println(map.keySet());

//		for viewing!!,do not modify it!!!
		Set<String> keys = map.keySet();
//		System.out.println(keys); 
		for(String ele : keys ) {
			System.out.println(ele +" ");
		}
		System.out.println("============");
		for(String ele : map.keySet()) {
			System.out.println(ele);
		}
		ArrayList<String> AL = new ArrayList<>(map.keySet());
		System.out.println(AL);
	}
	 
}
