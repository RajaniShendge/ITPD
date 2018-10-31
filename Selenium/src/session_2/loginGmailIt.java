package session_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginGmailIt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Atomation Setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//for open url
		driver.get("https://accounts.google.com/");
		
		WebElement Textbox=driver.findElement(By.name("identifier"));
		Textbox.sendKeys("rajanishendge@gmail.com");
		WebElement Button=driver.findElement(By.xpath("//*[@id='identifierNext']/content"));
		Button.click();
		Thread.sleep(3000);
		WebElement Textbox1=driver.findElement(By.name("password"));
		Textbox1.sendKeys("Sai9422693600");
	    WebElement Button1=driver.findElement(By.xpath("//*[@id='passwordNext']/content/span"));
		Button1.click();
		Thread.sleep(3000);
	    WebElement Button2=driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]"));
        Button2.click();
        Thread.sleep(3000);
	    WebElement Button3=driver.findElement(By.xpath("//*[@id=':ir']/div/div"));
	    Button3.click();
		WebElement Textbox2=driver.findElement(By.name("to"));
		//Textbox2.sendKeys("apoorvkhare259@yahoo.com");
		Textbox2.sendKeys("apoorvkhare259@yahoo.com");
		WebElement Textbox3=driver.findElement(By.name("subjectbox"));
		Textbox3.sendKeys("Test Mail");
		WebElement Textbox4=driver.findElement(By.xpath("//*[@id=':or']"));
		Textbox4.sendKeys("Test mail");
		WebElement Button4=driver.findElement(By.id(":ng"));
		Button4.click();

		

	    

        
		//Thread.sleep(3000);


		



	}

}
