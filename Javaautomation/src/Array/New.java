package Array;

public class New {

	public static void main(String[] args) {
		StringBuilder sc= new StringBuilder("laxmikant");
//		String temp=" ";
//		System.out.println(sc.length());
//		for(int i=0;i<sc.length();i++) {
//			System.out.println(sc.charAt(i));
		
		sc.reverse();
		System.out.println(sc);
		sc.append("mule");
		System.out.println(sc);
		sc.delete(2,5);
		System.out.println(sc);
		}
		
	}


