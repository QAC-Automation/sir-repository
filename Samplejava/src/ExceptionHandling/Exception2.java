package ExceptionHandling;

public class Exception2 {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("below 18 not allow");
		}else {
			System.out.println("above 18 allow");
		}
	}

	public static void main(String[] args) {
		try{
			validate(17);
		}catch(ArithmeticException e) {
			System.out.println("hello");
			System.out.println(e);
		}
		System.out.println("program continue");
	}
	
	}


