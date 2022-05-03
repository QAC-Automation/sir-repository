package AssigmentDay7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartValidation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maxamize browser
		driver.manage().window().maximize();
		// implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement Meanu = driver.findElement(By.className("_2doB4z"));
		Meanu.click();
		System.out.println("current url " + driver.getCurrentUrl());

		String expectedTitle = "https://www.flipkart.com/";
		String actualTitle = driver.getCurrentUrl();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("correct homepage SHOW sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}
        List<WebElement> FlipcartMenu = driver.findElements(By.cssSelector("div[class='_37M3Pb']>div"));
		System.out.println("count element is " + FlipcartMenu.size());
		for (WebElement option1 : FlipcartMenu) {
			String option = option1.getText();
			System.out.println("Mobile phones name  is:" + option);

		}

	}

}
