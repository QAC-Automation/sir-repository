package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {
		public static void main(String[] args) {
			TreeSet<String> t1=new TreeSet<String>();
			t1.add("Samved");
			t1.add("rugved");
			t1.add("athravaved");
			t1.add("Samved");
			System.out.println(""+t1);
			Iterator<String> i1=t1.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
				}
			Iterator<String> h1=t1.descendingIterator();
			while(h1.hasNext()) {
				System.out.println(h1.next());
			}
			TreeSet<Integer> k1=new TreeSet<Integer>();
			k1.add(12);
			k1.add(25);
			k1.add(190);
			k1.add(78);
			System.out.println(""+k1);
			System.out.println(""+k1.pollFirst());
			
			System.out.println(""+k1);
			System.out.println(""+k1.pollLast());
			System.out.println(""+k1);
		
		
		TreeSet<String> s1=new TreeSet<String>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("d");
		s1.add("e");
		System.out.println(""+s1);
		System.out.println(""+s1.headSet("c"));
		System.out.println(""+s1.headSet("c", true));
		
		System.out.println(""+s1.subSet("c","e"));
		System.out.println(""+s1.subSet("a", true, "e", false));
		
		System.out.println(""+s1.tailSet("a"));
		System.out.println(""+s1.tailSet("b", true));

}

}
