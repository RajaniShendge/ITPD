package session_2;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class session_2_class {
	static WebDriver driver;

	@BeforeTest
	public void OpenBrowser(){
		driver = new FirefoxDriver();
	}

	@Test
	public static void faceLogin() throws InterruptedException {
		//Initializiong browser
//		WebDriver driver = new FirefoxDriver();
		//open URL
		driver.get("https://www.facebook.com");
		
		//Find element by ID
		driver.findElement(By.id("u_0_1")).sendKeys("Ritu");
		
		//Find element by Name
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		
		//Find element by ClassName
		driver.findElement(By.id("u_0_5")).sendKeys("9421345284");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("9421345284");
		
		driver.findElement(By.xpath("//*[@id='u_0_a']")).sendKeys("test@123");
		driver.findElement(By.xpath("//*[@id='day']")).click();
		driver.findElement(By.xpath("//*[@id='day']/option[11]")).click();
		
		driver.findElement(By.xpath("//*[@id='month']")).click();
		driver.findElement(By.xpath("//*[@id='month']/option[11]")).click();
		
//		driver.findElement(By.xpath("//*[@id='year']")).click();
//		driver.wait(1);
		driver.findElement(By.xpath("//*[@id='year']/option[20]")).click();

		
		driver.findElement(By.xpath("//*[@id='u_0_i_1']")).click();
		
		driver.findElement(By.name("websubmit")).click();

	}

	@Test(enabled = false) 
	public void googleLogin(){
		
		driver.get("http://www.google.com");
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
}
