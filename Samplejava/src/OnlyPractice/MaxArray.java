package OnlyPractice;

public class MaxArray {

	public static void main(String[] args) {
		int[] arr= {1,45,67,98,455,789};
		int max=Integer.MIN_VALUE;
		for(int element:arr) {
			if(element>max) {max=element;
		}

	}
System.out.println("Max element is"+max);
}
}