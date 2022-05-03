package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) throws ArithmeticException {
		try{
			System.out.println("program start");
//			int a=25;
//	    int b=a/0;
//		String s=null;
//		System.out.println(s.length());
//			int [] array=new int[5];
//			array[5]=5;
			int [] array1=new int[5];
			array1[5]=5/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(ArrayIndexOutOfBoundsException k) {
			
			System.out.println("hello ArrayIndexOutOfBoundsException");
		}catch (NullPointerException h) {
			System.out.println("NullPointerException");
		}
System.out.println("program end");
}
}