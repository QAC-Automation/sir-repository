package BroswerOprations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFacebook2 {

	public static void main(String[] args) {
		//site www.facebook.com open by using chrome browser,gettitle,pagesource,currentUrL,CLOSE;
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				WebDriver auto=new ChromeDriver();
				auto.get("https://www.facebook.com/");
		       
		        String sourcecode=auto.getPageSource();
		        System.out.println("pagesource"+sourcecode);
		        System.out.println("current url "+auto.getCurrentUrl());
		        System.out.println("title "+auto.getTitle());
		        System.out.println("title "+auto.getTitle().length());
		        //in order to forgotpassword
		        WebElement forgotPassword = auto.findElement(By.linkText("Forgotten password?"));
		        forgotPassword.click();
		       // auto.close();

	}

}
