package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class RedBus {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/");
		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".selected")).click();
		driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.cssSelector(".next")).click();
		driver.findElement(By.cssSelector(".wd:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#search_btn")).click();
		driver.findElement(By.cssSelector("li.checkbox:nth-child(4)")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		//WebElement bus=driver.findElement(By.xpath("//label[@title='AC']"));
		wait.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();
		//*[@id="fixer"]/div/div/div[1]/h2/span[2]
		List<WebElement> busname = driver.findElements(By.xpath("//*[@id=\"result-section\"]"));
		System.out.println("count element is " + busname.size());
		System.out.println(" "+busname);
		for(int i=0;i<=busname.size();i++) {
			System.out.println(""+busname.get(i).getText());
//		for(WebElement option1:busname)
//		{
//			String option=option1.getText();
//			System.out.println("all bus name  is:"+option);
//			
//		}
	 
		}
	}
}


	//*[@id="result-section"]
