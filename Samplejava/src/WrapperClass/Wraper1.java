package WrapperClass;

import java.util.concurrent.SynchronousQueue;

public class Wraper1 {

	public static void main(String[] args) {
		int a=30;
		Integer i=new Integer(a);//explicitly int primitive into Integer
		Integer j=50;//implicitly int into Integer
		
	System.out.println(""+a+" "+i+" " +j);
	
	Character c=new Character('a');//explicitly Char into Character
	Character c1='a';//implicitly autoboxing
	
	System.out.println(c==c1);
	System.out.println(c.equals(c1));
	
	Integer x1=new Integer(5);
	int m1=x1.intValue();//unboxing 
	System.out.println(m1);
	
	Character h1='k';//unboxing
	char l1=h1.charValue();
	System.out.println(l1);
	
	Boolean g1=new Boolean(true);
	boolean d1=g1.booleanValue();
	System.out.println(d1);
	
	System.out.println("d1="+d1+"g1="+g1);
	}

}
