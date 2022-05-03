package BasicProgram;

public class Dcharacter {

	public static void main(String[] args) {
		String g1="jagannath";
		int length=g1.length();
		char [] ch=g1.toCharArray();
		for (int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate "+ch[j]);
					break; 
				}
			}
		}

	}

}
