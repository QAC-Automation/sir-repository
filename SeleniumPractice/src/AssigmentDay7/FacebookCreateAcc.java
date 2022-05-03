package AssigmentDay7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAcc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		// WebElement realme=driver.findElement(By.id("a#u_0_2_8T"));

		System.out.println("current url " + driver.getCurrentUrl());
		System.out.println("title " + driver.getTitle());
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("correct homepage SHOW sucessfully...");
		} else {
			System.out.println("Either not CORRECT  or page URL got changed");
		}
		WebElement CreateButton = driver.findElement(By.linkText("Create New Account"));
		CreateButton.click();

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Rohit");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sharma");

		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9421668888");
		driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("Rohit@123");

		WebElement SkilloDropdown = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		SkilloDropdown.click();
//		//**** Create an instance of Select class and pass above element into its constructor
		Select dropdown = new Select(SkilloDropdown);
//		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("option is multiple or not check :" + dropdown.isMultiple());
		List<WebElement> options = dropdown.getOptions();
		System.out.println("Option count is:" + options.size());
		// Get dropdown option names
		for (int i = 0; i < options.size(); i++) {
			System.out.println("Option " + i + ": " + options.get(i).getText());

			System.out.println("Is it enable:" + SkilloDropdown.isEnabled());
			System.out.println("Already selected date is" + dropdown.getFirstSelectedOption().getText());

			// Selectday.selectByIndex(0);
			// Selectday.selectByValue("18");
			dropdown.selectByVisibleText("18");
			WebElement MonthField = driver.findElement(By.name("birthday_month"));
			MonthField.click();

			Select Selectmonth = new Select(MonthField);
			System.out.println("Multiple month is sElected or not:" + Selectmonth.isMultiple());

			List<WebElement> options1 = Selectmonth.getOptions();
			System.out.println("All month is" + options1.size());
			for (int j = 0; j < options1.size(); j++) {
				System.out.println(" " + options1.get(j).getText());
			}
			System.out.println("Month field is enabled or not" + MonthField.isEnabled());
			System.out.println("Already selected month is" + Selectmonth.getFirstSelectedOption().getText());
			Selectmonth.selectByIndex(8);
			// Selectmonth.selectByValue("September");
			// Selectmonth.selectByVisibleText("Sep");

			WebElement YearField = driver.findElement(By.id("year"));
			YearField.click();

			Select Selectyear = new Select(YearField);
			System.out.println("Multiple month is sElected or not:" + Selectyear.isMultiple());

			List<WebElement> options2 = Selectyear.getOptions();
			System.out.println("All month is" + options2.size());
			for (int k = 0; k < options2.size(); k++) {
				System.out.println(" " + options2.get(k).getText());
			}
			System.out.println("Month field is enabled or not" + YearField.isEnabled());
			System.out.println("Already selected year is" + Selectyear.getFirstSelectedOption().getText());
//Selectyear.selectByIndex(0);
			Selectyear.selectByValue("1997");
//Selectyear.selectByVisibleText("1997");
			YearField.click();
			break;

		}
//WebElement s=driver.findElement(By.xpath("//button[@name='websubmit']"));
//s.click();

	}

}

//		
////        WebElement forgotPassword = auto.findElement(By.linkText("Forgotten password?"));
////        forgotPassword.click();
