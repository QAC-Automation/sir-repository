package HandlingWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingWindow1 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");
		// get current window unique id
		String WinId1 = driver.getWindowHandle();
		System.out.println("current Window Id" + WinId1);

		// performing click operation to open Linkedin page in new tab
		WebElement linkId = driver.findElement(By.xpath("(//div[@class='pdud5']/a)[11]"));
		linkId.click();

		// get all windows unique IDs which are opened by selenium current instance
		Set<String> allWindoId = driver.getWindowHandles();
		System.out.println("get all WindoId" + allWindoId);

		// remove home window id from all window id dn you will get child window id
		allWindoId.remove(WinId1);
		System.out.println("after removing" + allWindoId);

		// get child window id using iterator
		Iterator<String> itr = allWindoId.iterator();
		String ChildWindow = itr.next();

		// switch control to child window
		//driver.switchTo().window(allWinIds.iterator().next());
						//or

		// switch control to child window
		driver.switchTo().window(ChildWindow);

		// now you are allow to identify any element from child window
		System.out.println("get current Title" + driver.getTitle());
		System.out.println("get current URL" + driver.getCurrentUrl());
		Thread.sleep(2000);
		// close current instance of browser
		// driver.close();
		// driver.quit();

		// switch back to home page window in order to perform any required operation on
		// that
		driver.switchTo().window(WinId1);
		// now you are allow to identify any element from home window
		System.out.println("get current Title" + driver.getTitle());
		System.out.println("get current URL" + driver.getCurrentUrl());

		// close current instance of browser
		// driver.close();
		// close all the driver instances opened by webdriver
		driver.quit();
	}

}
