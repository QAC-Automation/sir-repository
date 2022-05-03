package BasicOpration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategories {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		WebElement categories=driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		System.out.println("is dispalyed "+categories.isDisplayed());
		System.out.println("is editable/enable"+categories.isEnabled());
		System.out.println("is "+categories.isDisplayed());
		System.out.println(""+categories.getText().equals("CATEGORIES"));
		
		WebElement phone=driver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		System.out.println("is dispalyed "+phone.isDisplayed());
		System.out.println("is editable/enable"+phone.isEnabled());
		System.out.println("is "+phone.isDisplayed());
		System.out.println(""+phone.getText().equals("phone"));
		
		WebElement Laptops=driver.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
		System.out.println("is dispalyed "+Laptops.isDisplayed());
		System.out.println("is editable/enable"+Laptops.isEnabled());
		System.out.println("is "+Laptops.isDisplayed());
		System.out.println(""+Laptops.getText().equals("Laptops"));
		
		WebElement Monitors=driver.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
		System.out.println("is dispalyed "+Monitors.isDisplayed());
		System.out.println("is editable/enable"+Monitors.isEnabled());
		System.out.println("is "+Monitors.isDisplayed());
		System.out.println(""+Monitors.getText().equals("Monitors"));
	}

}
