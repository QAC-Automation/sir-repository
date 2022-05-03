package BroswerOprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazoneAuto2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver auto1 = new FirefoxDriver();
		auto1.get("http://www.amazon.in/");
		System.out.println("Title" + auto1.getTitle());
		System.out.println("Title" + auto1.getTitle().length());
		System.out.println("current url" + auto1.getCurrentUrl());
		auto1.close();

	}

}
