package Array;

public class Array0 {

	public static void main(String[] args) {
	//	String cars[];
	//	cars=new String[4];
	//	    OR
//		String[]cars=new String[4];  //DECLARE
//		cars[0]="volvo";             //Initiolization
//	    cars[1]="BMW";
//		cars[2]="FORD";
//		cars[3]="MERCEDZ";
	//another method of initiolazation below
		String[]cars= {"volvo","BMW","FORD","MERCEDZ"};
		
		//CHANGE THE ARRAY ELEMENT
		cars[0]="mahindra";
		cars[1]="toyoto";
		System.out.println(cars[0]);//update cars[0]=mahindra
		System.out.println(cars[1]);//update cars[1]=toyoto
		//count an array element
		System.out.println(cars.length);//4
		
		//iterate an array element using normal for loop
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		//iterate an array using for each loop
		for(String i:cars) {
			System.out.println(i);
		}
		
	}

}
