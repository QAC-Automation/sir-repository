package TestNGAssigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestNGAssigments1 {
	 @BeforeTest
		public void openBrowser() {
		 SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
			
		}
		
		@Test(priority=1)
		public void verifyLogin() {
			//openBrowser();
			System.out.println("Successfully login..");
			SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver = s1.setUp("chrome", "https://demo.actitime.com/login.do");;
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			
			
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			System.out.println("actual"+driver.getTitle());
			//Assert.assertEquals(driver.getTitle(), "actiTIME  Login");
			Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");
		}
		@AfterTest
		public void closeBrowser() {
			System.out.println("Browser instance is closed");
		}
		@Test(priority=2)
		public void createTask() {
//			driver.findElement(By.xpath("//a[@class='content tasks']")).click();
//			driver.findElement(By.xpath("//div[@class='downIcon']")).click();
//			
//			driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
//			driver.findElement(By.xpath("//tr[@class='selectProjectRow projectSelectorRow']")).click();
//			System.out.println("Task created Successfully");
}
}