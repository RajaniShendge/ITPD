package session_2;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Session4 {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(10);
//		driver.findElement(By.xpath("//*[text()='Forgotten account?']")).click();
//		
//		Boolean iselementpresent = driver.findElements(By.xpath(".//*[@class='!clearfix uiHeaderTop']|.//*[text()='!Find Your Account']")).size()!= 0;
		String expected = driver.findElement(By.xpath("//*[text()='Forgotten account?']")).getText();
		System.out.println(expected);
		String actual = "Forgotten account?";
		Assert.assertEquals(expected, actual);
		
		//		driver.navigate().to("https://www.google.com");
//		driver.navigate().back();
//		driver.getCurrentUrl();
//		driver.navigate().forward();
//		driver.getCurrentUrl();
//		String text = driver.findElement(By.xpath("//*[@id='u_0_e']")).getText();
//		System.out.println("Text is "+ text);
//		driver.manage().window().maximize();
		
		//Wait for 15 seconds
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Wait until element loads
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
		
//		Select mydrpdwn = new Select(driver.findElement(By.id("month")));
//		mydrpdwn.selectByVisibleText("Aug");
//		
//		
//		if (text == "Create an account"){
//			System.out.println("Test is passed");
//		} else {
//			System.out.println("Test failed");
//		}
//		Select listbox = new Select(driver.findElement(By.xpath("//*[@id='year']")));
//		listbox.selectByValue("2016");
//		
//		Select listbox1 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
//		listbox1.selectByIndex(3);
//		
//		driver.close();

	}

}
