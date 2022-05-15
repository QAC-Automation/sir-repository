package Day1TestNG;

import org.testng.annotations.Test;

public class Example_Param1 {
	@Test(invocationCount=10)
	public void Param1() {
		System.out.println("hello im param 1");
	}

}
