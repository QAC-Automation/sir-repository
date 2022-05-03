package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		System.out.println(""+al1);
		System.out.println(""+al1.isEmpty());
		al1.add("Bharat");
		al1.add("Kedar");
		al1.add("Shivshankar");
		System.out.println("al1= "+al1);
		System.out.println(""+al1.isEmpty());
		ArrayList al2=new ArrayList();
		al2.add("Sidharth");
		al2.add("lucky");
		System.out.println(""+al2);
		System.out.println(""+al2.isEmpty());
		al1.addAll(al2);
		System.out.println(""+al1);
		ArrayList al3=new ArrayList();
		al3.add("Vishal");
		al3.add("ram");
		System.out.println(""+al3);
		al2.addAll(1, al3);
		System.out.println(""+al2);
		
		
		
	}

}
   
















