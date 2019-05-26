package LearningProject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testTM {
	WebDriver driver = null;

	@Before()
	public void openBrowser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Documents/selenium/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	}
	
	@After()
	public void closeBrowser() throws Throwable {
		driver.close();
	}

	@When("^I open toastmasters International homepage$")
	public void when() throws Throwable {
		driver.get("https://www.toastmasters.org/");
	}

	@Then("^I veryfy the title of homepage$")
	public void iValidatePageTitle() throws Throwable {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Toastmasters International -Home";
		if (actualTitle.contentEquals(expectedTitle)) 
		{
			System.out.println("Test Passed");
		} 
		else
		{
			System.out.println("Failure");
		}
	}
	
}