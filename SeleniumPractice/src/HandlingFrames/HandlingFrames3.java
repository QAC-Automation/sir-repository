package HandlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);

		Actions act = new Actions(driver);

		for (int i = 1; i <= 6; i++) {
			WebElement first = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[6](" + i + ")"));
			WebElement last = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1](" + 6 + ")"));
			Thread.sleep(1000);
			act.dragAndDrop(last, first).build().perform();


	}

}
}
