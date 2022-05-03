package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("key1", "marketvalue");
		m1.put("key2", "businessUnit");//upcasting
		m1.put("key3", "Industry");//upcasting
		m1.put(null, "Company");
		System.out.println("map value="+m1);
		System.out.println("map size="+m1.size());
		m1.put("key2", "chemical");
		m1.put(100, "survey");
		System.out.println("map value="+m1);
		System.out.println("map size="+m1.size());
		
		
		System.out.println("get the key value ="+m1.get("key1"));
		System.out.println("set of all map key value ="+m1.keySet());
		System.out.println("get the value ="+m1.values());
	}

}
