
public class Systemarraymethod {

	public static void main(String[] args) {
		char [] copyFrom= {'a','c','d','b','k','o','r','u','s','f','d'};
		char [] copyTo=new char [8];
		System.arraycopy(copyFrom, 4, copyTo, 0, copyTo.length);
		for(int i:copyTo) {
			System.out.println(i);
		}
//		for( int i=0;copyTo.length;i++) {
//			System.out.println(copyTo[i]);
//		}
	}

}
