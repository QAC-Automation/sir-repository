package Collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(25);
		a1.add(34);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("gurudatta");
		a2.add("Rashmi");
		ArrayList<Boolean> a3=new ArrayList<Boolean>();
		a3.add(false);
		System.out.println(""+a3);
		
		
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("Rmakant");
		s1.add("yogeshwari");
		s1.add("Banderao");
		s1.add("vasantrao");
		s1.add("mukund");
		s1.add("uday");
		System.out.println(""+s1);
		System.out.println(""+s1.remove("Banderao"));
		System.out.println(""+s1);
		System.out.println(""+s1.remove(0));
		System.out.println(""+s1);
		ArrayList<String> s2=new ArrayList<String>();
		s2.add("Shakuntalabai");
		s2.add("chandrakant kaka");
		s2.add("vasantrao");
		s2.add("mukund");
		s1.addAll(s2);
		System.out.println(" "+s1);
		s1.retainAll(s2);
	System.out.println(""+s1);
		s1.removeAll(s2);
		System.out.println(""+s1);
		s1.removeIf(str -> s1.contains("uday"));
		System.out.println(""+s1);
		
		s1.clear();
		System.out.println(""+s1);
		
		
	}

}
