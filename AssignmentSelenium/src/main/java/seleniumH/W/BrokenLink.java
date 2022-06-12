package seleniumH.W;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Thread.sleep(2000);

	// capture links from a webpage
	List<WebElement> links = driver.findElements(By.tagName("a"));

	// Number of links
        System.out.println("Total numbers of links : " + links.size());

        int j=0;
		for (int i = 0; i < links.size(); i++) {
	// by using href attributr we can get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url);
	// create connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
	// establish connection
			httpConn.connect();
			int rescode = httpConn.getResponseCode(); // return response if res code is above 400: broken link

			if (rescode >= 400) {
				System.out.println(url + " - " + "is broken link");
				j++;
			} else {
				System.out.println(url + " - " + "is valid link");
			}
			
		}
		System.out.println(" Total numbers of broken links: " + j);

	}

}
