package session_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	public WebDriver driver;
	//This test method declares that its data should be supplied by the Data Provider
	// "getdata" is the function name which is passing the data
	// Number of columns should match the number of input parameters
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
		Object[][] data = new Object[3][2];

		// 1st row
		data[0][0] ="sampleuser1";
		data[0][1] = "abcdef";

		// 2nd row
		data[1][0] ="testuser2";
		data[1][1] = "zxcvb";
		
		// 3rd row
		data[2][0] ="guestuser3";
		data[2][1] = "pass123";

		return data;
		}
	}