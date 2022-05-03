package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class HandlingFrames1 {

	public static void main(String[] args) throws InterruptedException {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://jqueryui.com/droppable/");

		// switch your control to frame using WebElement
		WebElement Frame = driver.findElement(By.cssSelector("[class='demo-frame']"));
		driver.switchTo().frame(Frame);
		// or
		// driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		// or
		// Switch your control to frame using index
		// driver.switchTo().frame(0);

		Actions ac = new Actions(driver);
		WebElement src = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement des = driver.findElement(By.cssSelector("div[id='droppable']"));
		ac.dragAndDrop(src, des).build().perform();

		// get your control back to main page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]")).click();

	}

}
