package BroswerOprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefox {

	public static void main(String[] args) {

		String Driverpath1="D:\\New folder\\java workpace\\SeleniumPractice\\executables\\geckodriver.exe";
		                //OR
		String Driverpath2=".\\executables\\geckodriver.exe";
		                //OR
		String Driverpath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		

		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver",Driverpath1);
		//step2: create an instance of Firefox Browser
		WebDriver driver1=new FirefoxDriver();

	}

}
