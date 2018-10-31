package session_2;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class session_2_class1 {
	static WebDriver driver;
	
	
	@BeforeTest
	
	public void OpenBrowser(){
		driver = new FirefoxDriver();		
	}

	@Test
	public static void AmazonLogin(){
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		//System.out.println("I am here");
		
		driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]")).click();
		//System.out.println("I am here again");
		
		//driver.findElement(By.id("createAccountSubmit")).click();
		//driver.findElement(By.className("a-button-text")).click();
		
		driver.findElement(By.xpath(".//*[@id='createAccountSubmit']")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Rajani");
		driver.findElement(By.xpath(".//*[@id='ap_phone_number']")).sendKeys("9421345284");
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Rajani");
		//driver.findElement(By.xpath(".//*[@id='continue']")).click();
		driver.findElement(By.className("a-button-input")).click();
	}
	@Test (enabled = false)
        public void googleLogin(){
		
		driver.get("http://www.google.com");
	}
//	@AfterTest
	public void CloseBrowser(){
		driver.close();
	}
	

}
