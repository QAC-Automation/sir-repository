

class test1{
	public void run1() {
		System.out.println("method 1");
	}
	
}
public class Runtimepoly extends test1 {
	public void run1() {
		System.out.println("method 2");
	}

	public static void main(String[] args) {
		test1 runtime=new Runtimepoly();
		runtime.run1();
		
	}

}
