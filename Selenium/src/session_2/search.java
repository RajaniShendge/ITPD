package session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search {
	//WebElement element;

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.google.co.in");
		WebElement element = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		element.click();
		element.sendKeys("facebook");
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		//element.sendKeys(Keys.RETURN);
		
		

	}

}
