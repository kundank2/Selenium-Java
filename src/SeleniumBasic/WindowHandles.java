

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kndnk\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h3/span")).getText());
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h3/span")).getText();
		String selenium = driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h3/span")).getText().split("on")[1].split(",")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(selenium);

	}

}
