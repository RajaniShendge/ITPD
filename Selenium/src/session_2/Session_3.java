package session_2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session_3 extends Common_methods {
	
		
	public static void main(String[] args) throws IOException {
	Common_methods obj = new Common_methods();

	String URL = obj.getProperty("url");
	obj.openURL(URL);
	
	//WebElement login = obj.findElementXpath(obj.getProperty("login"));
	//System.out.println(login.toString());
	//login.sendKeys(obj.getProperty("username"));

	
	
	}

}
