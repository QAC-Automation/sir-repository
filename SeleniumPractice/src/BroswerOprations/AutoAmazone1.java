package BroswerOprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoAmazone1 {

	public static void main(String[] args) {
//site www.reddit.com open by using chrome browser we lounch,gettitle,pagesource,currentUrL,CLOSE;
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver auto = new ChromeDriver();
		auto.get("https://www.reddit.com/");
		System.out.println("title " + auto.getTitle());
		System.out.println("title " + auto.getTitle().length());
		String sourcecode = auto.getPageSource();
		System.out.println("pagesource" + sourcecode);
		System.out.println("current url " + auto.getCurrentUrl());
		auto.close();
		// OR

//site www.amazon.in open by using Firefox browser we lounch,gettitle,pagesource,currentUrL,CLOSE;
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver auto1 = new FirefoxDriver();
		auto1.get("http://www.amazon.in/");
		System.out.println("Title" + auto1.getTitle());
		System.out.println("Title" + auto1.getTitle().length());
		String sourcecode1 = auto1.getPageSource();
		System.out.println("pagesource" + sourcecode1);
		System.out.println("current url" + auto1.getCurrentUrl());
		System.out.println("Title" + auto1.getTitle());
		auto1.close();

	}

}
