package Pattern;

public class New {

	public static void main(String[] args) {
		String str="Maharashtra";
		int length=str.length();
		char[] ch=str.toCharArray();
		for(int x=0;x<length;x++){
			for(int j=x +1;j<length;j++){
				if (ch[x]==ch[j]) {
					System.out.println("duplicate "+ch[j]);
					break;
				}
			}
		}

	}

}



