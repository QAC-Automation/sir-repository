package Practicejava;

public class Reversenumber {

	public static void main(String[] args) {
		int num=1234,rev=0,rem;
		while(num!=0) {
			rem=num%10;  //4
			rev=rev*10+rem;//43
			num=num/10;//12
			
		}
System.out.println(rev);
if(rev==num) {
	System.out.println(" g"+rev);
}else {
	System.out.println(" not"+rev);
}
	}

}
