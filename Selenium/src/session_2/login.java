package session_2;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.PauseAction;
import org.openqa.selenium.support.ui.Sleeper;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]"))
				.click();
		Thread.sleep(10);
		String email = "shendagerajani@gmail.com";
		String password = "sai9422693600";
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(
				password);
		driver.findElement(By.xpath("//*[@id='signInSubmit']"));
		
		String myAccountEmailAdrress= driver.findElement(By.xpath(".////")).getText();
		Assert.assertEquals(email, myAccountEmailAdrress);
		
		
	}

}
