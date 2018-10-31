package session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Byxpath {
	    WebDriver driver;
	//WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		By UserName =By.id("Email");
		By Next = By.xpath(".//*[@id='next']");
		By Passward= By.xpath(".//*[@id='Passwd']");
		By SignIn =By.xpath(".//*[@id='signIn']");
		
		public Byxpath(WebDriver driver){
			this.driver= driver;
		}
	
		public void TypeUsername(){
		driver.findElement(UserName).sendKeys("shendagerajani@gmail.com");
		
		}
		public void Next(){
        driver.findElement(Next).click();
		}
		public void typepassward(){
		driver.findElement(Passward).sendKeys("sai9422693600");

		}
		public void signin(){
		driver.findElement(SignIn).click();
		}
		
	
		}

