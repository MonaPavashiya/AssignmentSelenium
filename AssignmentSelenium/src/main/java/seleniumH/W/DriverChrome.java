package seleniumH.W;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome {
           //buy laptop from Best Buy as pick up at store.
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.bestbuy.ca/en-ca?intlreferer=https://www.google.com/&intlredir=https://www.bestbuy.com/");
		
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Laptop");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        //driver.findElement(By.linkText("Laptops On Sale")).click();
        driver.findElement(By.xpath("//p[text()='Laptops On Sale']")).click();
        Thread.sleep(2000);
 
       driver.findElement(By.xpath("//span[text()='HP 14\" Laptop - Silver (Intel Core i3-1115G4/512GB SSD/8GB RAM/Windows 10)']")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//span[text()='Pick Up at Store']")).click();
       
       driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	}

}
