package BasicProgram;

public class StringReverse {

	public static void main(String[] args) {
		String s1="Laxmikant";
		String temp=" ";
		for (int i=s1.length()-1;i>=0;i--) {
			temp=temp+s1.charAt(i);
		}
System.out.println("before"+s1);
System.out.println("after"+temp);
	}

}
