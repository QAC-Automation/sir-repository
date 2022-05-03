package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Que {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>(); 
		//System.out.println("empty with .element"+queue.element());
		queue.add("Samir");
		queue.add("harshal");
		queue.add("pavan");
		queue.add("mahesh");
		System.out.println("using forEach");
		
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("topmost element ="+queue.element());
//		System.out.println(""+queue.peek());
		
		System.out.println("remove top most using remove() "+queue.remove());
		System.out.println("remove top most using poll()"+queue.remove());
		Iterator itr1=queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			System.out.println("using lamda expresion");
			queue.forEach(obj -> {
				System.out.println(obj);
			});
		}
	}

}
