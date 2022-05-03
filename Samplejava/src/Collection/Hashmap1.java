package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(100,"Manik");
        h1.put(101, "Saurabh");
        h1.put(102, "mohan");
        h1.put(103, "Hira");
        //h1.put(100, "Samir");//duplicate key not allow
        h1.put(104,"Manik");//duplicate values are allow but key diff.
        System.out.println("all map value="+h1);
        System.out.println("all map size="+h1.size());
        HashMap<Integer,String> h2=new HashMap<Integer,String>();
        h2.put(200,"milind");
        h2.put(201, "banti");
        h2.put(202, "vikas");
        h2.put(203, "omkar");
        System.out.println("all map value="+h2);
        System.out.println("all map size="+h2.size());
      for(Map.Entry m:h2.entrySet()) {       
    	  System.out.println(m.getKey()+" = "+m.getValue());
        	System.out.println("..........................");
      }	
      System.out.println("all map value="+h1);
  	       h1.remove(100);
        	System.out.println("remove 100 key map value="+h1);
        	
          h1.remove(102, "mohan");
          System.out.println("remove 102 key of mohan map value="+h1);
          
          h1.replace(103, "Shankar");
          System.out.println("replace map value="+h1);
          
          h2.replace(203,"omkar", "sidhivinayaka");
          System.out.println("replace old data with new value="+h2);
          for(Map.Entry m5:h1.entrySet()) {
      		System.out.println(m5.getKey()+" = "+m5.getValue());
      		
      		
      		
      	}
          
        	h2.putIfAbsent(205,"parmeshwar");
        	System.out.println("all map value="+h2);
        	h1.putAll(h2);
        	System.out.println("all map value="+h1);
        	for(Map.Entry m2:h1.entrySet()) {
        		System.out.println(m2.getKey()+" = "+m2.getValue());
        		
        		
        		
        	}
	}

}
