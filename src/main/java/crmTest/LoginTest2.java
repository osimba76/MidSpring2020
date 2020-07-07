package crmTest;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {

	WebDriver driver;

	@Before // Anotations
	public void launchBrowser() {

		// Setting up the properties
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		// Creating Web driver instance
		driver = new ChromeDriver();

		// Maximizing Browser
		driver.manage().window().maximize();

		// Go to the site
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	@Test
	public void loginTest() throws InterruptedException {

		// Identify the username field pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// Identify the password field pass password
		driver.findElement(By.id("password")).sendKeys("abc123");

		// Identify the sign-in button and click
		driver.findElement(By.name("login")).click();

		// Stopping the browser for 2 seconds
		Thread.sleep(2000);
		
		//varType varName;
		
		String str = "gfakjg";
		int num = 5;
		
	}

}
