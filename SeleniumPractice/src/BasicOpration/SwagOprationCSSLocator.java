package BasicOpration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagOprationCSSLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		//by using ID Atributes (id=#value)
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		//by using ID Atributes (id=Tagname#value)
		driver.findElement(By.cssSelector("input#login-button")).click();
		Thread.sleep(2000);
		//by using any Atributes(tagname[id='value'])
		driver.findElement(By.cssSelector("button[id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
	}
	
}
