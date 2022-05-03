package Day1TestNG;

import org.testng.annotations.Test;

public class TestNGExample2 {
	@Test
	public void testcase1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hello Im testNGExample2");
	}

}
