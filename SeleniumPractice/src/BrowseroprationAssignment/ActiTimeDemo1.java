package BrowseroprationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver auto5 = new ChromeDriver();
		auto5.get("https://demo.actitime.com/login.do");

		System.out.println("current url " + auto5.getCurrentUrl());

		String expectedURL = "https://demo.actitime.com/login.do";
		String actualURL = auto5.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("correct URL SHOW sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}
		System.out.println("title " + auto5.getTitle());
		String expectedTitle1 = "actiTIME - Login";
		String actualTitle2 = auto5.getTitle();
		System.out.println("length " + auto5.getTitle().length());
		if (actualTitle2.equals(expectedTitle1)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}
		// loginButton
		// identify the required element from the UI
		WebElement UserName = auto5.findElement(By.id("username"));
		UserName.sendKeys("admin");
		// UserName.clear();
		// UserName.sendKeys("admin");

		WebElement PasswordName = auto5.findElement(By.name("pwd"));
		PasswordName.sendKeys("manager");
		// UserName.clear();
		// PasswordName.sendKeys("manager");

		//WebElement LoginButton = auto5.findElement(By.id("loginButton"));
		//LoginButton.click();

	//	auto5.close();

	}

}
