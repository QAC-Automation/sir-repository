package BasicProgram;

public class RStringMethod {
	public static void main(String[] args) {

		String str1="DhanoriPune";//output: enuPironahD
		System.out.println(""+reverseString(str1));
	
	}
static String reverseString(String str) {
			String temp="";
			for(int i=str.length()-1;i>=0;i--) {
				temp=temp+str.charAt(i);
			}
			return temp;
		}

}
