package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class keyboardOp4 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility utility=new SeleniumUtility();
		WebDriver driver=utility.setUp("chrome", "https://www.flipkart.com/");
		WebElement element=driver.findElement(By.cssSelector("body"));
	    element.sendKeys(Keys.ESCAPE);
	    for(int i=0;i<10;i++) {
	    	element.sendKeys(Keys.PAGE_DOWN);
	    	Thread.sleep(1500);
	    	
	    }

	}

}
