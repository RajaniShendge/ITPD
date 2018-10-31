package CallByxpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import session_2.Byxpath;

public class Gmaillogin {
	@Test
	public void Verifylogin(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		Byxpath login = new Byxpath(driver);
		login.TypeUsername();
		login.Next();
		login.typepassward();
		login.signin();
	}

	

}
