

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kndnk\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//td[@class*='ui-datepicker-today']")).click();
	}
	

}
