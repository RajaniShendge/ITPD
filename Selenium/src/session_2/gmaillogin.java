package session_2;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("deprecation")
public class gmaillogin {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com");
	    driver.manage().window().maximize();
		String email = "shendagerajani@gmail.com";
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		String password= "sai9422693600";
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		driver.findElement(By.xpath("//*[@class='gb_8a gbii']")).click();
		String myAccountEmailAdrress= driver.findElement(By.className("gb_vb")).getText();
		System.out.println(myAccountEmailAdrress);
		Assert.assertEquals(email, myAccountEmailAdrress);
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		}

}
