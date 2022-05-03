package BrowseroprationAssignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerActiveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.switchTo().activeElement();
		username.clear();
		username.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().clear();
		WebDriver password=driver.s
		password.("Test@123");
		//driver.switchTo().activeElement().sendKeys("admin",Keys.ENTER);
		driver.switchTo().activeElement().clear();
	//	driver.switchTo().activeElement().sendKeys("Test@123",Keys.ENTER);
	}

}
