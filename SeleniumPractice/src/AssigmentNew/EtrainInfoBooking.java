package AssigmentNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class EtrainInfoBooking {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://etrain.info/current-booking");
		driver.findElement(By.xpath("//input[@id='cbafi1']")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"suggest_row1\"]")).click();
		driver.findElement(By.xpath("//input[@id='cbafi2']")).sendKeys("Ltt");
	    driver.findElement(By.cssSelector("div[id='suggest_row1']")).click();
	
	driver.findElement(By.xpath("//button[@class='btn flexG1 pdud5']")).sendKeys(Keys.ENTER);
	
	List<WebElement> allTrainDetails=driver.findElements(By.xpath("//tr[@class='udborder lrborder']"));
	
	for(int i=0;i<allTrainDetails.size();i++) {
		System.out.println("********* "+allTrainDetails.get(i).getText()+" ************");
	

 }
	 
	}
	
}
//tr[@class='udborder lrborder']