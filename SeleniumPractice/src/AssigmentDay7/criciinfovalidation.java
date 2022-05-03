package AssigmentDay7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class criciinfovalidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maxamize browser
		driver.manage().window().maximize();
		// implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		
		System.out.println("current url " + driver.getCurrentUrl());

		String expectedTitle = "https://www.espncricinfo.com/";
		String actualTitle = driver.getCurrentUrl();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("correct homepage SHOW sucessfully...");
		} else {
			System.out.println("Either homepage not CORRECT  or page URL got changed");
		}
        List<WebElement> FlipcartMenu = driver.findElements(By.cssSelector(".ds-popper-wrapper>a"));
		System.out.println("count element is " + FlipcartMenu.size());
		for (WebElement option1 : FlipcartMenu) {
			String option = option1.getText();
			System.out.println("Cricket site mean name  is:" + option);

		}
		

	}

}
