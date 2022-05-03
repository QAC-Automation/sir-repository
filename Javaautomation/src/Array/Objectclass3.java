package Array;

public class Objectclass3{
	static int lastrollno=100;
	int rollno;
	//constructor
	Objectclass3()
	{
		rollno=lastrollno;
		lastrollno++;
	}
	@Override
	public int hashCode() {
		return(101);
		
	}
		
	

	public static void main(String[] args) {
		
		Objectclass3 s=new Objectclass3();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
	
	

}
}
