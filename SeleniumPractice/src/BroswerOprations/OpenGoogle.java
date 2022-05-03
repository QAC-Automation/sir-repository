package BroswerOprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver drive123=new ChromeDriver();
		drive123.get("https://www.google.com/");
		
String sourcecode=drive123.getPageSource();
System.out.println("getpagesource"+sourcecode);

System.out.println("currentdirectory"+drive123.getCurrentUrl());
System.out.println("title"+drive123.getTitle());

//close current instance of browser
drive123.close();
	}

}
