package session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {


	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("https://google.com");
		//driver.findElement(By.xpath("//input[@id='gs_htif0'")).sendKeys("gmail");
		
		
		//finding xpath using //Tagname[@Attribute='value']
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("gmail");
		
		//finding xpath using text 
		driver.findElement(By.xpath(".//*[text()='Gmail - Google']")).click();
		driver.findElement(By.xpath(".//*[@type='email']")).sendKeys("shendagerajani@gmail.comgmail.com");
		driver.findElement(By.xpath(".//*[@value='Next']")).click();
		driver.findElement(By.xpath(".//*[@name='Passwd']")).sendKeys("sai9422693600");
		//driver.findElement(By.xpath(".//input[@id='signIn']")).click();
		driver.findElement(By.xpath(".//*[@value='Sign in']")).click();
		
		
		//element is not currently visible
		//driver.findElement(By.xpath(".//*[@name='signIn']")).click();
		//Not displaying text
		//String P=driver.findElement(By.xpath(".//*[@id='signIn']")).getText();
	    //System.out.println(P);
		
	

	}

}
