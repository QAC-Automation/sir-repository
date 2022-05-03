package Collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>(5);
		System.out.println(""+v1);
		System.out.println(""+v1.capacity());
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		v1.add("lucky");
		System.out.println(""+v1.capacity());
		v1.addElement("lucky");
		v1.addElement("lucky");
		System.out.println(""+v1.capacity());
		System.out.println(""+v1.size());
		v1.addElement("lucky");
		v1.addElement("lucky");
		System.out.println(""+v1.capacity());
		System.out.println(""+v1.size());
		
		
		
		
		
		
	}

}
