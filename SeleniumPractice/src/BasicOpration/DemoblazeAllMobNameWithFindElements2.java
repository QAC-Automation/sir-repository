package BasicOpration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeAllMobNameWithFindElements2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maxamize browser
		driver.manage().window().maximize();
		//implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		//use findelements...method to find multiple element
		List<WebElement> FlipcartMenu = driver.findElements(By.cssSelector(".card-block>h4>a"));
		System.out.println("count element is " + FlipcartMenu.size());
		for(WebElement option1:FlipcartMenu)
		{
			String option=option1.getText();
			System.out.println("Mobile phones name  is:"+option);
			System.out.println(option1.isDisplayed());
			System.out.println(option1.isEnabled());
		}

	}

}
