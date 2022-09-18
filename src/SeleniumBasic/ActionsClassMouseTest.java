

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionsClassMouseTest {

	@Test
	public void ActionsClassTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kndnk\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.amazon.in/");
		// whether the string in sendkeys is capital or small it'll be converted in to capital, if press shift key
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("iPhOnE").keyUp(Keys.SHIFT).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList-nav-line-1")));
		
		// Mouse hover using actions class
		WebElement accountList = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		actions.moveToElement(accountList).build().perform();
		
		WebElement yourAccount = driver.findElement(By.xpath("//div[@id='nav-al-your-account']/a/span"));

		yourAccount.click();
		
		WebElement yourOrder = driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']"));
		actions.moveToElement(yourOrder).contextClick().build().perform();
	}

}
