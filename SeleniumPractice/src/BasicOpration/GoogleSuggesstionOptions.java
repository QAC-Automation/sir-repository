package BasicOpration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggesstionOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		List<WebElement> search1 = driver.findElements(By.cssSelector("div.mkHrUc>ul>div>ul>li"));
		System.out.println("selenium search count is "+search1.size());
		for(WebElement searchoption:search1)
		{
			String option=searchoption.getText();
			System.out.println("All Mobile phones name  is:"+option);
			System.out.println(searchoption.isDisplayed());
			System.out.println(searchoption.isEnabled());
		}
	}

}
