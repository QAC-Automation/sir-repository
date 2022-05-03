package BrowseroprationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteautomationChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver auto5 = new ChromeDriver();
		auto5.get("https://demosite.executeautomation.com/Login.html");
		String actualTitle2 = auto5.getTitle();
		System.out.println("length " + auto5.getTitle().length());

		System.out.println("current url " + auto5.getCurrentUrl());

		String expectedURL = "https://demosite.executeautomation.com/Login.html";
		String actualURL = auto5.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("correct URL SHOW sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}
	
		WebElement UserName=auto5.findElement(By.name("UserName"));
		UserName.sendKeys("execution");
		
		WebElement Password=auto5.findElement(By.name("Password"));
		Password.sendKeys("admin");
		Password.clear();
		Password.sendKeys("admin");
		WebElement field1=auto5.findElement(By.name("Login"));
		//WebElement field2=auto5.findElement(By.linkText("LoginDemo.html"));
	//	WebElement field=auto5.findElement(By.tagName("a"));
		field1.click();
	}

}
