package Day1TestNG;

import org.testng.annotations.Test;

public class Example_Param3 {
	@Test(enabled=true)
	public void login() {
		System.out.println("login succesfully");
	}
    @Test(enabled=true)
    public void sendmail() {
    	System.out.println("mail send succesfully");
    }
    @Test(enabled=false)
	public void logout() {
		System.out.println("logout succesfully");

}
}
/**
By default for each @Test enabled will set as enabled=true
enabled=true---> consider for execution
enabled=false---> don;t consider for execution
*/