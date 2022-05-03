package SwitchingOpration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingPromptPopup {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//as the required element is present inside the frame, so need to switch our control inside frame first
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Sillod");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

}
//https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
/**
In order handle any JavaScirpt Pop-up we need use driver.switchTo().alert()
because java script popup doesn't contain HTML code
we use predefined functions of Alert to perform any operation on it
after every action control comes back to the main page


*/