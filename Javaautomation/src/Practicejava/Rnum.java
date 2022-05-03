package Practicejava;

public class Rnum {

	public static void main(String[] args) {
		int rev=0,rem,num=56789;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(rev);

}
}