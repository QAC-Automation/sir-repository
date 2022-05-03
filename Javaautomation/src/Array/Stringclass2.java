package Array;

public class Stringclass2 {

	public static void main(String[] args) {
		String s1="Pune";
		String s2="Aur ang abd";
		System.out.println("no of character in Pune"+s1.length());
		System.out.println("no of character in Aurangabad"+s2.length());
		System.out.println("2th index character  "+s1.charAt(2));
		System.out.println("3rd index chya pudheche character"+s2.charAt(3));
		System.out.println("5th index chya pudhche character " +s2.substring(5));
		System.out.println("3th to 8 index chya madhle character " +s2.substring(3,5));
		System.out.println("concat of s1& s2 " +s1.concat(s2));
		String x1="alandi";
		String x2="Pandherpur";
		System.out.println("x1 and x2 concat " +x1.concat(x2));
		String n1=x1.concat(x2);
		String n2=s1.concat(s2);
		String m1=" ";
		System.out.println("n1 and n2 concat " +n1.concat(n2));
		System.out.println("3 index chya pudhche character print karne " +s2.indexOf('n',2));
		System.out.println("3 index chya pudhche character print karne " +s2.indexOf("abd"));
		System.out.println("UPPERCASE " +s1.toUpperCase());
		System.out.println("lowercase " +s1.toLowerCase());
		System.out.println("trim " +s2.trim());
		String o1=s2.replace('a','m');
		System.out.println(m1.isEmpty());
		String h1=new String();
		System.out.println(h1.isEmpty());
		System.out.println(x2.replace('d','m'));
		
	
	}

}
