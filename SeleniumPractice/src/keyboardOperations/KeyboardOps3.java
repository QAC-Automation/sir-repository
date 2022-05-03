package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class KeyboardOps3 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		driver.navigate().refresh();
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		
	
	}

}
/**
 * possible ways to refresh the browser:
 * 1. driver.navigate().refresh();
 * 2. sendKeys(Keys.f5)
 * 3. by hitting same URL again
 * 4. ctrl+R
 */