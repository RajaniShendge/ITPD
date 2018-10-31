package session_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmailtest {
	public WebDriver driver;
  @BeforeTest
  public void login()  {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Atomation Setup\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		//for open url
		driver.get("https://accounts.google.com/");
		
  }
  @Test
  public void login1() throws InterruptedException{
	  
  
		
		driver.findElement(By.id("identifierId")).sendKeys("rajanishendge@gmail.com");
	    driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Sai9422693600");
		
	    driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();

	    
	  
  }
 /* @AfterTest
  public void close(){
	  driver.close();
	  
     
	  
	  
  }*/
}

