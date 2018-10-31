package session_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	public WebDriver driver;
	//This test method declare that its data should be supplied by the Data Provider
	//
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Atomation Setup\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://facebook.com");
		 driver.findElement(By.name("email")).sendKeys(username);
		 driver.findElement(By.id("pass")).sendKeys(password);
		 
			
	}
	@DataProvider
	public Object[][] getData(){
		//Row - Number of times your test has to be repeated.
		//Column - Number of parameter in test data.
		Object[][] data =new Object[3][2];
		data[0][0]="abc";
		data[0][1]="3600";
		return data;
		
		
	}
	

}
