package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Laxmikant");
		list.add("1234");
		list.add("Mango");
		list.add("krishna");
        list.add("komal");
        System.out.println("no of list="+list.size());
        System.out.println("get the 2 index element="+list.get(2));
        list.set(2, "mule");
        System.out.println("size"+list);
        for(int i=0;i<list.size();i++) {
        	System.out.println(""+list.get(i));
        	
        }	Collections.sort(list);
        		list.forEach(a -> {
        			System.out.println(a);
        		});
        			Iterator itr=list.iterator();
        			System.out.println(""+itr.hasNext());
        			System.out.println(""+itr.next());
        			System.out.println(""+itr.next());
        			System.out.println(""+itr.next());
        			System.out.println(""+itr.next());
        			System.out.println(""+itr.next());
        	System.out.println(""+itr.hasNext());
        	for(Object obj:list) {
        		System.out.println(obj);
        	}
        		
	}
        }
	


