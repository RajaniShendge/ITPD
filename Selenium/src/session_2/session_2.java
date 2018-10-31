package session_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class session_2 {

	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		
		// Create FileInputStream Object  
		 FileInputStream fileInput = new FileInputStream(new File("C:\\Users\\GOODLUCK\\workspace\\Selenium\\testdata.properties"));  
		 // Create Properties object  
		 Properties prop = new Properties();  
		 //load properties file  
		 prop.load(fileInput);  
		 
		 driver.get(prop.getProperty("url"));
		 //driver.findElement(By.xpath("login")).sendKeys("username");
		 
		 
		
		
//		driver.get(".//*[@id='adsense-target']/div/div[6]/div/ol/li[1]/b/a");
		driver.manage().window().maximize();
		driver.close();
		

	}

}
