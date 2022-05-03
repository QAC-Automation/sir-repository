package AssigmentNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoCred {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		
		String cred=driver.findElement(By.cssSelector("div[class='login_credentials_wrap-inner']")).getText();
		System.out.println(cred);
		
		cred=cred.replace("( Username : ", "");
		cred=cred.replace(" | Password : ", " ");
		cred=cred.replace(" )", "");
		System.out.println(cred);
		String[] loginDetails=cred.split(" ");
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys(loginDetails[2]);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(loginDetails[2]);
		
//		String []loginDetails=cred.split(" ");
//		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys(loginDetails[5]);
//		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(loginDetails[1]);
////		driver.findElement(By.cssSelector("input[id='login-button']")).click();

	}
	
}
