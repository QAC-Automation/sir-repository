package DayXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeByXpath11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		String expectedTitle1="actiTIME - Login";
		String actualTitle2=driver.getTitle();
		
		if(actualTitle2.equals(expectedTitle1)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[@class='downIcon']")).click();
		
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		//driver.findElement(By.xpath("//tr[@class='selectProjectRow projectSelectorRow']")).click();
	}

}
