package session_2;

import org.apache.bcel.generic.Select;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HmWk {
	public WebDriver driver;
	@BeforeTest
  
 public void open() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Atomation Setup\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://store.demoqa.com");
		Thread.sleep(3000);
  }
  @Test
  public void select(){
	  //driver.get("http://store.demoqa.com/products-page/product-category/");
	  driver.findElement(By.xpath("//*[@id='menu-item-33']/a")).click();
	 
	 driver.findElement(By.xpath("//*[@id='default_products_page_container']/div[3]/div[2]/form/div[2]/div[1]/span/input")).click();
	 driver.findElement(By.xpath("//*[@id='header_cart']/a")).click();
	 driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/a/span")).click();
	 }
@AfterTest
  public void close(){
	driver.close();
}
  

}
