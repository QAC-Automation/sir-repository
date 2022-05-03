package Practicejava;

//public class Swapingnumber {
//
//	public static void main(String[] args) {
//		int a=34,b=56;
//		System.out.println("before swaping no a="+a+" b="+b);
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swaping no a="+a+" b="+b);
//	}
//
//}
public class Swapingnumber{

	 public static void main(String [] args){

	  int a=23,b=45;

	  System.out.println("before swap a="+a+"b="+b);

	b=a+b-(a=b);
	System.out.println("after swap a="+a+"b="+b);

	}

	}