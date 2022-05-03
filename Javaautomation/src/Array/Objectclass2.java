package Array;

public class Objectclass2 {

	static int lastrollno=100;
	int rollno;
	//constructor
	Objectclass2()
	{
		rollno=lastrollno;
		lastrollno++;
	}
	@Override
	public String toString() {
		return("hello im toString method");
		
	}
		
	

	public static void main(String[] args) {
		
		Objectclass2 s=new Objectclass2();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
	
		

}
}
