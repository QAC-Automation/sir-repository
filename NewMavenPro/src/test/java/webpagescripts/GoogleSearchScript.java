package webpagescripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import WebPages.GoogleSearchPage;
import utilities.SeleniumUtility;

public class GoogleSearchScript {

	@Test
	public void testCase() {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.google.com");
		GoogleSearchPage getGoogleSearchPage=PageFactory.initElements(driver, GoogleSearchPage.class);
		getGoogleSearchPage.searchText("I am shailesh");
	}
}
