package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("amay");
		a1.add("baban");
		a1.add("ram");
		a1.add("amay");
		System.out.println(""+a1);
		HashSet<String> str2=new HashSet<String>(a1);
		str2.add("mama");
		System.out.println(""+str2);
		Iterator itr4=str2.iterator();
		while(itr4.hasNext()) {
			System.out.println(""+itr4.next());
		}
		System.out.println("..................................");
str2.forEach(str -> {
	System.out.println(str);
});
str2.removeIf(str -> str2.contains("baban"));
System.out.println(str2);
	}

}
