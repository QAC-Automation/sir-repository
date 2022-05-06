package Day1TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestNGExample6 {
	@Test
	public void ActiTimeLoginLogOut(){
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		System.out.println("actual"+driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), "actiTIME  Login");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");
		
		
		//loginButton
	//identify the required element from the UI
	WebElement UserName=driver.findElement(By.id("username"));
	UserName.sendKeys("admin");
	//UserName.clear();
	//UserName.sendKeys("admin");
	
	WebElement PasswordName=driver.findElement(By.name("pwd"));
	PasswordName.sendKeys("manager");
	//UserName.clear();
	//PasswordName.sendKeys("manager");
	
	WebElement LoginButton=driver.findElement(By.id("loginButton"));
	LoginButton.click();
	
	//auto5.findElement(By.className("Logout")).click();
	driver.findElement(By.id("logoutLink")).click();
	driver.close();
	}
	@Test
  public void ActiTimeValidation(){
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		System.out.println("Before login page title"+driver.getTitle());
		// validation using TestNG
		//Assert.assertEquals(driver.getTitle(), "actiTIME  Login");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");
		
		// identify the required element from the UI and perform required action 
		WebElement UserName=driver.findElement(By.id("username"));
		Assert.assertTrue(UserName.isDisplayed());
		Assert.assertTrue(UserName.isEnabled(), "User name input field is not functional");
		Assert.assertEquals(UserName.getAttribute("placeholder"), "Username", "Username input field placeholder name is changed");
		
		// identify remember check box
		WebElement checkbox=driver.findElement(By.xpath("//input[@name='remember']"));
		Assert.assertTrue(checkbox.isDisplayed());
		Assert.assertTrue(checkbox.isEnabled(), "checkbox is not enable");
		Assert.assertFalse(checkbox.isSelected(), "checkbox is bydefault select");
		
		checkbox.click();
		Assert.assertFalse(checkbox.isSelected(), "checkbox is bydefault select");
		//Assert.assertTrue(checkbox.isSelected(), "checkbox is bydefault select");
		driver.close();
	}
}
