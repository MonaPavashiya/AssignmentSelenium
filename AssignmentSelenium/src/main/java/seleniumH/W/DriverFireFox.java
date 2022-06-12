package seleniumH.W;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFireFox {
         //create account for gmail
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		wd.manage().window().maximize();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//span[text()='For myself']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abcd");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@name='lastName']")).sendKeys("pqr");
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("input[type=email]")).sendKeys("mNOStU34G9");
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("input[name=Passwd]")).sendKeys("12345mnop");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("12345mnop");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[text()='Back']")).click();
	}

}
