package Day1TestNG;

import org.testng.annotations.Test;

public class Example_Param2 {
	@Test(priority=1)
	public void login() {
		System.out.println("login succesfully");
	}
    @Test(priority=2)
    public void sendmail() {
    	System.out.println("mail send succesfully");
    }
    @Test(priority=3)
	public void logout() {
		System.out.println("logout succesfully");
}
}

/**

By Default each @Test has priority as 0
lowest priority will get executed first
*/