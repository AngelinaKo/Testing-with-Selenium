package com.example.angelina;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepageTitle {
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

	@When("^I open main page$")
	public void when() throws Throwable {
		driver.get("https://www.toastmasters.org/");
	}

	@Then("^I validate page title$")
	public void iValidatePageTitle() throws Throwable {
		assertEquals(driver.getTitle(), "Toastmasters International -Home");
	}
	
}
