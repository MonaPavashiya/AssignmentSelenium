package seleniumH.W;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.navigate().to("https://www.globalsqa.com/demo-site/tooltip/");

		WebElement globe = driver.findElement(By.xpath("//a[@rel='home']"));
		String expectedTooltip = "GlobalSQA";
		String actualTooltip = globe.getAttribute("title");

		System.out.println("Actual Title of Tool Tip : " + actualTooltip);

		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}
		driver.close();

   }		
		
}

