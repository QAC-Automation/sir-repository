package AssigmentNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class OpencartReg {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.opencart.com/index.php?route=account/register");
         driver.findElement(By.xpath("//input[@name='username']")).sendKeys("krishna@123",Keys.TAB);
		
		//driver1.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		driver.switchTo().activeElement().sendKeys("Rohit",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Sharma",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("user33@gmail.com",Keys.TAB);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='input-country']"));
		dropdown.click();
		Select option=new Select(dropdown);
		System.out.println("check multiple dropdown are/not "+option.isMultiple());
		
		List<WebElement> AllOptions=option.getOptions();
		System.out.println(" count of all options "+AllOptions.size());
		
		for(int i=0;i<AllOptions.size();i++) {
			System.out.println(" "+AllOptions.get(i).getText());
		}
		//option.selectByVisibleText("India");
		option.selectByValue("99");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Krish@9730");
	}

}
//https://www.opencart.com/index.php?route=account/register