package AssigmentNew;

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
		WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/search?fromCityName=Swargate%2C%20Pune&fromCityId=67159&toCityName=Panjim%2C%20Goa&toCityId=76065&onward=11-May-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		wait.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();
	
	}

}
