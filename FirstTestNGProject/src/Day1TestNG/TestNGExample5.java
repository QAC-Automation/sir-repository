package Day1TestNG;

import org.testng.annotations.Test;

public class TestNGExample5 {
	
	
@Test
public void testcase6() {
	displayed();
	System.out.println("hello Im testcase6");
}

@Test
public void testcase7() {
	
	System.out.println("hello Im testcase7");
	displayed();
}

public void displayed() {
	System.out.println("hello Im displayed");
}

}
