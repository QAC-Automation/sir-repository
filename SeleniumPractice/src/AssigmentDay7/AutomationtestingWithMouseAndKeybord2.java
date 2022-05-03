package AssigmentDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class AutomationtestingWithMouseAndKeybord2 {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		username.sendKeys("laxmikant");
		System.out.println("is display= "+username.isDisplayed());
		System.out.println("is enable="+username.isEnabled());
		System.out.println("is selected="+username.isSelected());
		Actions act = new Actions(driver);

		WebElement lastname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lastname.sendKeys("Mule",Keys.TAB);
		System.out.println("is display= "+lastname.isDisplayed());
		System.out.println("is enable="+lastname.isEnabled());
		System.out.println("is selected="+lastname.isSelected());
		
		WebElement Address = driver.findElement(By.cssSelector("textarea[class='form-control ng-pristine ng-valid ng-touched']"));
		Address.sendKeys("Chandan nagar,Pune",Keys.ENTER);
		System.out.println("is display= "+Address.isDisplayed());
		System.out.println("is enable="+Address.isEnabled());
		System.out.println("is selected="+Address.isSelected());

	}

}
