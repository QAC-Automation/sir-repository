package BroswerOprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {

	public static void main(String[] args) {
		String Driverpath1="D:\\New folder\\java workpace\\SeleniumPractice\\executables\\chromedriver.exe";
        //OR
String Driverpath2=".\\\\executables\\\\chromedriver.exe";
        //OR
String Driverpath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";


//step1: set driver executable path by using System.setProperty(String key,String value)
System.setProperty("webdriver.chrome.driver",Driverpath2);
//step2: create an instance of Chrome Browser
   WebDriver driver1=new ChromeDriver();
	}

}
