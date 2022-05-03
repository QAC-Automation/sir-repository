package AssigmentDay7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaValidation2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		System.out.println("current url " + driver.getCurrentUrl());
		System.out.println("get title =" + driver.getTitle());
		String expectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("login successfully");
		} else {
			System.out.println("Either Title not CORRECT  or page Title got changed");
		}
        List<WebElement> FlipcartMenu = driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li>a"));
		System.out.println("count element is " + FlipcartMenu.size());
		
		for (WebElement option1 : FlipcartMenu) {
			String option = option1.getText();
			System.out.println("Mobile phones name  is:" + option);
			

		}
	}

}
