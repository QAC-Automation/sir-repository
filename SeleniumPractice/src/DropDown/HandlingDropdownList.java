package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		//**** Idetify dropdown list
		WebElement SkilloDropdown=driver.findElement(By.id("Skills"));
		//**** Create an instance of Select class and pass above element into its constructor
		Select dropdown=new Select(SkilloDropdown);
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("option is multiple or not check :"+dropdown.isMultiple());
		//**** get default or already select option
		System.out.println("check defaultselected element get text :"+dropdown.getFirstSelectedOption().getText());
		//get option count
		List<WebElement> NoOfOptions=dropdown.getOptions();
		System.out.println("list count and text"+NoOfOptions.size());
		Thread.sleep(3000);
		for(int i=0;i<NoOfOptions.size();i++) {
			System.out.println("option "+i+" "+NoOfOptions.get(i).getText());
			//select options from dropdown
			//dropdown.selectByIndex(2);
			   //OR
//			dropdown.selectByValue("Adobe Photoshop");
//			      //OR
			dropdown.selectByVisibleText("Art Design");
		}
		
		
	}

}
