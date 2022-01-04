import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Person per = new Person("hello",23);
     	Person perr = new Person("bello",32);
//		Person1 per1 = new Person1("morid");
//		Person2 per2 = new Person2("morid",23,"oja","la");
		
//		System.out.println(per1.toString());
//		per1.speed();
//		System.out.println(per2.toString());
		
//		StringBuilder buld = new StringBuilder("Morid");
//		System.out.println(buld.reverse());
//		
//		StringBuffer buf = new StringBuffer("Morid");	
//		System.out.println(buf);
		
		System.out.println(Person.name);
		//per.people(0,"","");
		
		System.out.println("-----------------------------");
		
		Stack<Integer> st = new Stack<>();
		st.add(12);
		st.add(234);
		
		System.out.println(st);
		
		
		System.out.println("-----------------------------");
		
		HashSet<String> hash = new HashSet<>();
		hash.add("Morid");
		hash.add("Seyar");
		hash.add("Seyar");
		hash.add("Barry");
		
		System.out.println(hash);
		
		System.out.println("-----------------------------");
		
		int[] arr = {2,3,4,5,6,6,7,8,8,9,10};
		
		HashSet<Integer> ash = new HashSet<>();
		
		System.out.println("-----------------------------");
		
		// Map are key-value pair data structure
		// key must be unique
		// we define the data-type for key and for values
		// key comes first, than the value like === <key, value>
		// to all data to the map, we use method put(key, value)
		// to get value of a key, we use method get(key)
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("fname","Morid");
		map.put("Lname", "Joyandah");
		map.put("Age", "21");
		map.put("fname", "seyar");
		
		System.out.println(map);
		
//		// some of the important methods of map are:
//		// keysSet(): will return a set of all of the key in the map
//		System.out.println(map.keySet());
//		
//		// values(): will return all of the values in your map
//		System.out.println(map.values());
//		
//		// containsValue(): will check to see if such value exist in the map, if yes, it return true, if not than false
//		// containsKey(): //
//		System.out.println(map.containsValue("Morid"));
//		System.out.println(map.containsKey("Age"));
//		
//		// how to iterate through a map.
//		
//		// to get one value from a map we use get(Key)
//		System.out.println(map.get(1));
//		
//		// to get all of the keys, we use keySet();
//		// we can use a forEach loop to iterate a set
//		for(String key: map.keySet()) {
//			System.out.println("Key: "+ key + "    Value: "+  map.get(key));
//			
			
//		}
	}
}
