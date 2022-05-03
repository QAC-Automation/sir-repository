package BrowseroprationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteautomationFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver auto6 = new FirefoxDriver();
		auto6.get("https://demosite.executeautomation.com/Login.html");
		

		System.out.println("current url" + auto6.getCurrentUrl());

		String expectedURL = "https://demosite.executeautomation.com/Login.html";
		String actualURL = auto6.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("correct URL LOGIN sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}
		System.out.println("Title :" + auto6.getTitle());
		
		System.out.println("length " + auto6.getTitle().length());
		WebElement UserName=auto6.findElement(By.name("UserName"));
		UserName.sendKeys("execution");
		
		WebElement Password=auto6.findElement(By.name("Password"));
		Password.sendKeys("admin");
		
		WebElement Loginfield=auto6.findElement(By.tagName("input"));
		Loginfield.click();
		
		// auto6.close();
	}

}
