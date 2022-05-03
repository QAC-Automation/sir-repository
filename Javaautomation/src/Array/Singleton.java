package Array;

class sample{
	private sample(){
		System.out.println("private constructor");
	}
	public static sample  ref=new sample();
	public sample getsingletone() {
		return ref;
	}
}

public class Singleton {
	

	public static void main(String[] args) {
		sample.ref.getsingletone();

	}

}
