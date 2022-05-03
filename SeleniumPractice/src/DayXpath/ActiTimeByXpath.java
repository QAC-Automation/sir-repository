package DayXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiTimeByXpath {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		String expectedTitle1="actiTIME - Login";
		String actualTitle2=driver.getTitle();
		
		if(actualTitle2.equals(expectedTitle1)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[@class='downIcon']")).click();
		
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		driver.findElement(By.xpath("//tr[@class='selectProjectRow projectSelectorRow']")).click();
//		
//       driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("MlctroSemiCemi");
//     //  driver.findElement(By.xpath("(//div[@class='dropdownButton'])[16]")).click();
//	   driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
//		driver.findElement(By.xpath("(//div[@class='img'])[38]")).click();
//		//System.out.println("current title "+driver.getTitle());
		
		
		
		
		//create task name
		WebElement taskname = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[1]/input"));
		taskname.sendKeys("Mini Project");
		
		WebElement create = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[2]/div[2]/div[1]/div/div[1]"));
		create.click();
////		Thread.sleep(3000);
//		//click on check box
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/table/tbody/tr/td[1]/div/div"));
		checkbox.click();
//		
		//delete task
		WebElement delete = driver.findElement(By.xpath("//div[text()='Delete']"));
		delete.click();
		//delete permanently
		WebElement prodelete = driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div"));
		prodelete.click();
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"logoutLink\"]"));
		logout.click();
		
		
		
	}
	
}
