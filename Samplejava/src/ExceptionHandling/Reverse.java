package ExceptionHandling;

public class Reverse {

	public static void main(String[] args) {
		String g1="KRRK";
		String temp=" ";
		for(int i=g1.length()-1;i>=0;i--) {
			temp=temp+g1.charAt(i);
			System.out.println(""+temp);
	}
if(temp.equals(g1)) {
	System.out.println("given String is palindrome"+g1);
}else {
	System.out.println("given String is not palindrome"+g1);
}
}
}