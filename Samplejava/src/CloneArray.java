import java.util.Arrays;

public class CloneArray {

	public static void main(String[] args) {
		int [] array= {23,67,90};
		int []clonearray=array.clone();
		
		
//		for(int i:clonearray) {
//			System.out.println(i);
//			
			
		for(int i=0;i<clonearray.length;i++)	{
			
			System.out.println(clonearray[i]);
			System.out.println(Arrays.equals(array,clonearray));
		}
	}

}
