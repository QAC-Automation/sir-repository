package BrowseroprationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLoginLogout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver auto5 = new ChromeDriver();
		auto5.get("https://demo.vtiger.com/vtigercrm/index.php");

		System.out.println("current url " + auto5.getCurrentUrl());

		String expectedURL = "https://demo.vtiger.com/vtigercrm/index.php";
		String actualURL = auto5.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("correct URL SHOW sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}
	
		WebElement UserName=auto5.findElement(By.id("username"));
		UserName.clear();
		UserName.sendKeys("admin");
		
		WebElement Password=auto5.findElement(By.id("password"));
		Password.clear();
		Password.sendKeys("Test@123");
		
		//auto5.findElement(By.linkText("forgot password?")).click();
		WebElement Login=auto5.findElement(By.className("button"));
		Login.click();
		auto5.findElement(By.className("fa-user")).click();
		auto5.findElement(By.linkText("Sign Out")).click();
	}
	
}
