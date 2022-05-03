package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class keyboardOp1 {

	public static void main(String[] args) {
		SeleniumUtility utility=new SeleniumUtility();
		WebDriver driver=utility.setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
	}

}
