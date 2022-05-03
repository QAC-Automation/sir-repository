package AssigmentDay7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GsmarenaValidation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		//step2: create an instance of Firefox Browser
		WebDriver driver=new FirefoxDriver();
		// maxamize browser
		driver.manage().window().maximize();
		// implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		WebElement realme=driver.findElement(By.linkText("REALME"));
		  realme.click();
		
		System.out.println("current url " + driver.getCurrentUrl());

		String expectedTitle = "https://www.gsmarena.com/";
		String actualTitle = driver.getCurrentUrl();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("correct homepage SHOW sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}
        List<WebElement> FlipcartMenu = driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li>a"));
		System.out.println("count element is " + FlipcartMenu.size());
		
		for (WebElement option1 : FlipcartMenu) {
			String option = option1.getText();
			System.out.println("Mobile phones name  is:" + option);

		}
 
	}

}
