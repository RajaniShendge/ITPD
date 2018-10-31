package session_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_methods {
	
	WebDriver driver;
	
	public void openURL(String object){
	driver = new FirefoxDriver();
	}
	public WebElement findElementXpath(String xpathExpression) {
		return driver.findElement(By.xpath(xpathExpression));
	}
	
	public String getProperty(String property) throws IOException{
		// Create FileInputStream Object  
				 FileInputStream fileInput = new FileInputStream(new File("C:\\Users\\GOODLUCK\\workspace\\Selenium\\testdata.properties"));  
				 // Create Properties object  
				 Properties prop = new Properties();  
				 //load properties file  
				 prop.load(fileInput);  
				 prop.getProperty(property);
				return property;
	}
}
