package SwitchingOpration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingActiveElement {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		//validate by default cursor is pointing to username input field
		WebElement active=driver.switchTo().activeElement();
		String actualObject=active.getAttribute("placeholder");
			String ExpectedObject="Username";
			if(actualObject.equals(ExpectedObject)) {
				System.out.println("curson pointer validation is sucessful");
			}else {
				System.out.println("curson pointer validation is unsucessful");
			}
			//login in actitime application without identifying any object
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
		
		
	}

}
