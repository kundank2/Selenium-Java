package JavaInterviewPrograms;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTestFileUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kndnk\\eclipse-workspace\\FreeCRMTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(2000);
		WebElement uploadFileButton = driver.findElement(By.xpath("//input[@name='files[]']"));
		uploadFileButton.sendKeys("C:/Users/kndnk/Pictures/Screenshot.png");
		WebElement startUploadButton = driver.findElement(By.xpath("//span[contains(text(),'Start upload')]"));
		startUploadButton.click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//a[text()='Screenshot.png']")).isDisplayed()) {
			assertTrue(true, "Image Uploaded");
			System.out.println("file uploaded");
		}else {
			assertTrue(false, "Image not Uploaded");
		}

	}

}
