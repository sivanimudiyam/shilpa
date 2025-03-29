package Testpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class class1 {

		
		//instance variable
		
		WebDriver driver;
		
		
	@Test
	public void VerifyLoginPage() {
		
		//Enter the username
		
		driver.findElement(By.name("txtUserName")).sendKeys("sivani");
		
		// Enter the password
		
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		//Click on Login
		
		driver.findElement(By.name("Submit")).click();
		
		//Identify welcome selenium text
		
		String text = driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
		
		System.out.println(text);// Welcome selenium
		
		//Verify Welcome Selenium
		
		if(text.equals("Welcome selenium"))
		{
			System.out.println("Welcome page verified successfully");
		}else
		{
			System.out.println("Welcome page not verified successfully");
		}
		
		//Click on Logout
		
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
		
			
	  }

	@BeforeClass
	public void OpenBrowser() {
		
		//Open the firefox browser
		
		driver = new FirefoxDriver();//here driver is called object reference variable
		
		//Navigate the app URL
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
	  }

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	  }
	}
	
		
		
			


