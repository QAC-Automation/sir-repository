package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class HandlingFrames2 {

	public static void main(String[] args) throws InterruptedException {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://jqueryui.com/sortable/");
		//driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement Frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(Frame);
		Actions ac = new Actions(driver);
		
		for (int i = 1; i <= 6; i++) {
			WebElement first = driver.findElement(By.cssSelector("ul.ui-sortable>li:nth-of-type(" + i + ")"));
			WebElement last = driver.findElement(By.cssSelector("ul.ui-sortable>li:nth-of-type(" + 6 + ")"));
			Thread.sleep(1000);
			ac.dragAndDrop(last, first).build().perform();

		
		
		}
		
		
		
//		WebElement src = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[6]"));
//		WebElement des = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
//		ac.dragAndDrop(src, des).build().perform();
		

	}

}

