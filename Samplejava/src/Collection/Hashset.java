package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("manish");
		set.add("saurabh");
		set.add("aniket");
		set.add("manish");
		System.out.println("all element="+set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(""+set.remove("aniket"));
		Iterator<String> itr2=set.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
			HashSet<String> set1=new HashSet<String>();
			set1.add("ashok");
			set1.add("bhushan");
			set1.add("Saurabh");
			System.out.println(set1);
			set.removeIf(str -> str.contains("aniket"));
			System.out.println(set);
			set.clear();
			System.out.println(set);
		}
	}

}
