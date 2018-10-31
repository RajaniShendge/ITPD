package session_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class assert_1 {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com");
		driver.get("https://www.amazon.com");
		//String Actualtext;
		String S =driver.findElement(By.xpath(".//*[@id='nav-logo']/a[1]/span[1]")).getText();
		System.out.println(S);
		//Assert.assertTrue(S.toLowerCase().contentEquals("amazon"));
		//Assert.assertTrue(S.contains(S), "Amazon");
		Assert.assertEquals((S), "Amazon");
		//assertEquals
		//String expected = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).getText();
		//System.out.println(expected);
		//String actual = "Forgotten account?";
		//Assert.assertEquals(expected, actual);
		
		//assertNotEquals
		//String expected = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span")).getText();
		//System.out.println(expected);
		//String actual = "Rajani";
		//Assert.assertNotEquals(actual, expected);
		
		
		//WebElement radio = driver.findElement(By.xpath(".//*[@id='u_0_h']"));
//		radio.click();
		//Assert.assertFalse(radio.isSelected(), "Radio is not clicked");
		
		//Actualtext = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]")).getText();
		driver.close();
		//Assert.assertEquals(Actualtext, expected)
		
		//s_assert.assertEquals(Actualtext, "Tuesday, 01 January 2014", "1st assert failed.");
	}

}
