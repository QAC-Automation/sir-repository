package Array;
class Demo{
	void more() {
		System.out.println("i am more display");
	}
	
}

public class Objectclass extends Demo {
	static int lastrollno=100;
	int rollno;
	//constructor
	Objectclass()
	{
		rollno=lastrollno;
		lastrollno++;
	}

	public static void main(String[] args) {
		
		Objectclass s=new Objectclass();
		System.out.println(s);
		System.out.println(s.toString());
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		Demo d2=new Demo();
		System.out.println(d2);
		System.out.println(d2.toString());
		
	
		
		

	}

}
