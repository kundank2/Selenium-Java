package JavaInterviewPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static void main(String[] args) throws MalformedURLException, IOException {
		//broken URL
		// Step -1 to get all urls tied up to the links using Selenium
		// Java methods will call URL's and gets the status code - > OpenConnection method
		// if status code is >=400 then that url is not working -> link which tied to url is broken
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kndnk\\eclipse-workspace\\FreeCRMTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> allLinks =  driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		SoftAssert as = new SoftAssert();
		for(WebElement link : allLinks) {
			String url = link.getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode = connection.getResponseCode();
			System.out.println(responseCode);
			as.assertTrue(responseCode<400, "The link with text  "+link.getText()+" is broken with code  "+responseCode);
				
			}
			as.assertAll();
		}
		
		
		
		
	}

