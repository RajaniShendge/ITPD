package session_2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	public WebDriver driver;
	@Test
	public void openBrowser()throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\Atomation Setup\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("I'm in exception");
		getscreenshot();
	}
	public void getscreenshot() throws Exception
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\screenshot2.png"));
		
	}

}
