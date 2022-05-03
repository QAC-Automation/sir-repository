package AssigmentDay7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class AutomationTestingMouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		List<WebElement> mainMenu=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		//System.out.println("list of menu"+mainMenu.size());
		
		for(int i=0;i<mainMenu.size();i++) {
			System.out.println("list of menu....."+mainMenu.get(i).getText()+"................");
			act.moveToElement(mainMenu.get(i)).perform();
			Thread.sleep(1500);
			List<WebElement> subMenu=driver.findElements(By.cssSelector(".navbar-nav>li:nth-child(9)>ul>li>a"));	
	if(subMenu.size()>0) {
		for(int j=0;j<subMenu.size();j++) {
			System.out.println("list of menu"+subMenu.get(j).getText());
	}
		}else {
			System.out.println("no submenu");
		}

		}
	}
}
	


//ul[@class='nav navbar-nav']/li/a