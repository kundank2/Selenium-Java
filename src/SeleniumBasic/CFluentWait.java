

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class CFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kndnk\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))

                .pollingEvery(Duration.ofSeconds(2))

        .ignoring(org.openqa.selenium.NoSuchElementException.class);
		 WebElement foo = wait.until(
	                new Function<WebDriver, WebElement>() {
	                    public WebElement apply(WebDriver driver) {
	                    	if(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
	                    		System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
	                    	}else {
	                    		System.out.println("Not available");
	                    	}
	                        return driver.findElement(By.xpath("//div[@id='finish']/h4"));
	                    }
	                    
	                }
	                
	        );
	    

	}

}
