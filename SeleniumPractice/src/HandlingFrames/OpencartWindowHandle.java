package HandlingFrames;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class OpencartWindowHandle {

	public static void main(String[] args) {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.opencart.com/index.php?route=account/register");
		System.out.println("get current Title" + driver.getTitle());
		System.out.println("get current URL" + driver.getCurrentUrl());
		String WinHome=driver.getWindowHandle();
		System.out.println(" home WindowId"+WinHome);
		WebElement facebook=driver.findElement(By.xpath("//a[text()='Facebook']"));
		facebook.click();
		
		Set<String> allWindoId = driver.getWindowHandles();
		System.out.println("get all WindoId" + allWindoId);
		
		allWindoId.remove(WinHome);
		System.out.println(" "+allWindoId);
		
		Iterator<String> itr = allWindoId.iterator();
		String ChildWindow = itr.next();
		driver.switchTo().window(allWindoId.iterator().next());
	    //driver.switchTo().window(ChildWindow);
	    
		System.out.println("get current URL" + driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@placeholder='Email or phone']")).sendKeys("9730387934");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("8888342355");
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).sendKeys(Keys.ENTER);
		
		driver.quit();
//		String WinFb=driver.getWindowHandle();
//		System.out.println("current winfbId "+WinFb);
//		//input[@placeholder='Email or phone']
//		
//		Set<String> AllWinnew=driver.getWindowHandles();
//		System.out.println("current winfbId "+AllWinnew);
//		
//		AllWinnew.remove(WinFb);
//		System.out.println("child win "+AllWinnew);
//		
//		Iterator<String> itr1 = AllWinnew.iterator();
//		String ChildWindow1 = itr.next();
//		driver.switchTo().window(allWindoId.iterator().next());
//		System.out.println("get current URL" + driver.getCurrentUrl());
//		
	}

}
