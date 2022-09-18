package ToolsQA;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kndnk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='userName']"));
		
		System.out.println(element.getTagName());
        System.out.println(element.getText());
        System.out.println(element.getCssValue("submit"));
        System.out.println(element.getAttribute("submit"));
        
        Point getLocation = element.getLocation();
        System.out.println(getLocation.x + "   " +getLocation.y);
		
		Dimension dimensions = element.getSize();
        System.out.println(dimensions.height + "   " + dimensions.width);
		element.clear();
		
		element.sendKeys("ToolsQA");
		
		
		
		WebElement CurrentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CurrentAddress.click();
		
		boolean status = element.isDisplayed();
		System.out.println(status);
		
//		WebElement notes = driver.findElement(By.xpath("//span[contains(text(),'Notes')]"));
//        boolean invalidStatus = notes.isDisplayed();
//        System.out.println(invalidStatus);
        
        boolean isEnabled = element.isEnabled();
        System.out.println(isEnabled);
		
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        CurrentAddress.sendKeys("Rajpura");
        submit.submit();
        
        
        
        
	
		
		

	}

}
