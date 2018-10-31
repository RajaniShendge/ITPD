package session_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority1 {
	Public WebDriver driver;
  @Test(priority = 1)
  public void open() {
	  System.setProperty("webdriver.chrome.driver","E:\\Atomation Setup\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://accounts.google.com/");
	  
  }
  @Test(priority = 2)
  public void login()
  {
	  driver.findElement(By.id("identifierId")).sendKeys("rajanishendge@gmail.com");
  }
  @Test(priority = 3)
  public void close()
  {
	driver.close();  
  }
}
