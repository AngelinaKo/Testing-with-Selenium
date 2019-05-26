package ToastTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TMtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Documents/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toastmasters.org/");
		driver.findElement(By.id("txtSiteSearch")).sendKeys("Pathways");
		driver.findElement(By.id("btnSiteSearch")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Toastmasters International -";
		driver.close();
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}


	}

}
