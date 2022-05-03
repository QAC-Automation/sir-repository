package Array;

final class my{
	void display(int i) {
		System.out.println("display of class"+i);
	}
}
public class Println {
static my ref= new my();
	public static void main(String[] args) {
		Println.ref.display(25);
		System.out.println("hello");
	}

}
