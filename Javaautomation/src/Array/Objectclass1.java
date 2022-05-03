package Array;

public class Objectclass1 extends Demo {


	static int lastrollno=100;
	int rollno;
	//constructor
	Objectclass1()
	{
		rollno=lastrollno;
		lastrollno++;
	}

	public static void main(String[] args) {
		
		Objectclass1 s=new Objectclass1();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
		Demo d2=new Demo();
		System.out.println(d2);
		System.out.println(d2.toString());
		System.out.println(d2.hashCode());
		
	
		
		

	}

}
