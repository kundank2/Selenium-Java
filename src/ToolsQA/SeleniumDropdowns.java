package ToolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kndnk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Select oldStaticDropdown = new Select(driver.findElement(By.id("oldSelectMenu")));
		List<WebElement> options = oldStaticDropdown.getOptions();
		System.out.println("The dropdown options are:");
        for(WebElement lst: options)
            System.out.println(lst.getText());
		
		oldStaticDropdown.selectByIndex(4);
		oldStaticDropdown.selectByValue("9");
		oldStaticDropdown.selectByVisibleText("Yellow");

	}

}
