package BroswerOprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoGoogle3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver auto3=new FirefoxDriver ();
		auto3.get("https://www.google.com/");
		String source4=auto3.getPageSource();
        System.out.println("pagesource"+source4);
        System.out.println(""+auto3.getTitle());
        //auto3.close();
        
	}

}
