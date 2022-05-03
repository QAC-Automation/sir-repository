package OnlyPractice;

public class MINArray {

	public static void main(String[] args) {
		int[] arr= {1,45,67,98,455,789};
		int min=Integer.MAX_VALUE;
		for(int element:arr) {
			if(element<min) {min=element;
		}

	}
System.out.println("Max element is "+min);

	}

}
