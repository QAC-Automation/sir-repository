package AssigmentNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class EtrainInfoBooking1 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://etrain.info/current-booking");

		driver.findElement(By.id("cbafi1")).sendKeys("Pune");
		driver.findElement(By.xpath("//div[@id='suggest_row1']")).click();
		driver.findElement(By.id("cbafi2")).sendKeys("Ltt");
		driver.findElement(By.xpath("//div[@id='suggest_row1']/a")).click();

		WebElement btn=driver.findElement(By.xpath("//button[@class='btn flexG1 pdud5']"));
		btn.click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@id=\"lowerdata\"]/table/tbody/tr"));
		
		for(int i=4;i<li.size()-1;i++) {
			
			WebElement trainName=driver.findElement(By.xpath("//div[@id=\"lowerdata\"]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[1]/span"));
			System.out.println("Train Name: "+trainName.getText());
			
			WebElement departureTime=driver.findElement(By.xpath("//div[@id=\"lowerdata\"]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[2]"));
			System.out.println(departureTime.getText());
			
			WebElement arivalTime=driver.findElement(By.xpath("//div[@id=\"lowerdata\"]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[3]"));
			System.out.println(arivalTime.getText());
			System.out.println();
		}
				
		
		
//		WebElement trainName=driver.findElement(By.xpath("((//tr[@class='udborder lrborder'])[1]/td)[1]/span"));
//		System.out.println("Train Name: "+trainName.getText());
//		WebElement departureTime=driver.findElement(By.xpath("((//tr[@class='udborder lrborder'])[1]/td)[2]"));
//		System.out.println(departureTime.getText());	
//		WebElement arivalTime=driver.findElement(By.xpath("((//tr[@class='udborder lrborder'])[1]/td)[3]"));
//		System.out.println(arivalTime.getText());
	}
	}


