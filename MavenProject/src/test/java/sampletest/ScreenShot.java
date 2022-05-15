package sampletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ScreenShot extends SeleniumUtility {
	
	@Test
	public void testScreenShot() throws IOException {
		WebDriver driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/");
		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot)driver;
		// capture screenshot as output type FILE
		//File file=ts.getScreenshotAs(OutputType.FILE);
		File file = ts.getScreenshotAs(OutputType.FILE);
		// save the screenshot taken in destination path
		FileUtils.copyFile(file, new File(".\\src\\test\\resources\\ScreenShots\\Amazone.jpg"));
		
		cleanUp();
		
	}
		@Test
		public void testScreenShot2() {
			setUp("chrome", "https://www.google.com/maps/place/20%C2%B018'38.4%22N+75%C2%B039'28.6%22E/@20.3105391,75.6577546,19.65z/data=!4m14!1m7!3m6!1s0x3bdbcd87b78044a5:0x91dd7271c3685bd6!2sSillod,+Maharashtra!3b1!8m2!3d20.3079382!4d75.6528116!3m5!1s0x3bdbd279856f8983:0x3b0b552bee019d87!7e2!8m2!3d20.3106773!4d75.6579494");
			//String title=driver.getTitle();
			takeScreenShotOfThePage(".\\src\\test\\resources\\ScreenShots\\homemap.jpg");
			cleanUp();
		
	}

	
}
