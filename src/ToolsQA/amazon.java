package ToolsQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class amazon {

	@Test
	public void amazonTest() {
		System.setProperty("", "");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
		
		WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),' Mobiles & Accessories')]"));
		
		Actions action = new Actions(driver);
		
		
		
		
	}
}
