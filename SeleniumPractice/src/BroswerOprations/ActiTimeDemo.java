package BroswerOprations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver auto5=new ChromeDriver();
		auto5.get("https://demo.actitime.com/login.do");
	
		 System.out.println("current url "+auto5.getCurrentUrl());	
		 
		 String expectedTitle="https://demo.actitime.com/login.do";
		 String actualTitle=auto5.getCurrentUrl();	

			if(actualTitle.equals(expectedTitle)) {
				System.out.println("correct URL SHOW sucessfully...");
			}else {
				System.out.println("Either URL not CORRECT  or page URL got changed");
			}
	    System.out.println("title "+auto5.getTitle()); 
		String expectedTitle1="actiTIME - Login";
		String actualTitle2=auto5.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
//		  if(actualTitle.equals(expectedTitle)) {
//			System.out.println("Login page opened sucessfully...");
//		}else {
//			System.out.println("Either login page not opened or page title got changed");
//     
			/**
			 * In order to identify any object/element from the application UI we use findElement(By)
			 * this method returns WebElement
			 * 
			 * By is predefined class in selenium and all its method are static which are also known as "locator"
			 * Selenium support following locator:
			 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
			 * 
			 * Action: all the below actions will be performed on the webelement
			 * 			if you want to type any input on the field use--> sendKeys("");
			 * 		   if you want to click on any element use---> click();
			 * 		   clearing existing value from the field ---> clear();
			 */
						//loginButton
			//identify the required element from the UI
			WebElement UserName=auto5.findElement(By.id("username"));
			UserName.sendKeys("admin");
			//UserName.clear();
			//UserName.sendKeys("admin");
			
			WebElement PasswordName=auto5.findElement(By.name("pwd"));
			PasswordName.sendKeys("manager");
			//UserName.clear();
			//PasswordName.sendKeys("manager");
			
			WebElement LoginButton=auto5.findElement(By.id("loginButton"));
			LoginButton.click();
			
			//auto5.findElement(By.className("Logout")).click();
			auto5.findElement(By.id("logoutLink")).click();
		//	auto5.close();
   

	}

	}
	

