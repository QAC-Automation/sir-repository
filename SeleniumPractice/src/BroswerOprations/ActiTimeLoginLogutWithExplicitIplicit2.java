package BroswerOprations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginLogutWithExplicitIplicit2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver auto5=new ChromeDriver();
		//implicit wait
				//auto5.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		auto5.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		auto5.get("https://demo.actitime.com/login.do");
		   System.out.println("title "+auto5.getTitle()); 
			String expectedTitle1="actiTIME - Login";
			String actualTitle2=auto5.getTitle();
			
			if(actualTitle2.equals(expectedTitle1)) {
				System.out.println("Login page opened sucessfully...");
			}else {
				System.out.println("Either login page not opened or page title got changed");
			}
			
			auto5.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			
			auto5.findElement(By.name("pwd")).sendKeys("manager");
			
			auto5.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			WebElement logoutbutton=auto5.findElement(By.id("logoutLink"));
			//auto5.findElement(By.linkText("Logout")).click();
			
			//explicit wait
			Thread.sleep(2000);
			
			String actualHomePage=auto5.getTitle();
			System.out.println("actualTile"+actualHomePage);
			String expectedHomePage="actiTIME - Enter Time-Track";
			if(actualHomePage.equals(expectedHomePage)) {
				System.out.println("login succesful pgae title verified");
			}else {
				System.out.println("login fail or change title");
			}
			auto5.findElement(By.id("logoutLink")).click();
			auto5.close();
	}

}
