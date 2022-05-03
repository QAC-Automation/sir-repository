package BasicOpration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategoriesWithFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maxamize browser
		driver.manage().window().maximize();
		//implicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		//use findelements...method to find multiple element
		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("count element is " + categories.size());
		List<String> L1 = new ArrayList<String>();
		L1.add("CATEGORIES");
		L1.add("phone");
		L1.add("Laptops");
		L1.add("Monitors");
		//Logic to get one by one element from the list and performing validation on that
		
		for(int i=0;i<categories.size();i++) {
		WebElement cat=categories.get(i);
		System.out.println(""+cat.getText());
		System.out.println(cat.isDisplayed());
		System.out.println(cat.isEnabled());
		System.out.println(""+cat.getText().equals(L1.get(i)));
		}
	}

}
/**
 * findElements(By) ---> List<WebElement>
 * 					---> use to identify multiple elements or when you want to perform operation on multiple elements
 * 					---> we use findElements(By)
 * 					---> in order count the identified element you size()
 * 					---> in order get specific element from the list use get(int index) ---> return WebElement
 */ 