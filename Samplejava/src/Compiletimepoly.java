
public class Compiletimepoly {
	public static int Add(int a,int b) {
		return a+b;
	}

public static double Add(double a,double b) {
	return a+b;
}
	public static void main(String[] args) {
		System.out.println(Add(2,3));
		System.out.println(Add(5.1,6.2));
		
}
}