

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FunctionForWait implements Function<WebDriver, WebElement>{

	@Override
	public WebElement apply(WebDriver t) {
		// TODO Auto-generated method stub
		WebElement web=t.findElement(By.xpath("//div[@id='finish']/h4"));
		if(web.isDisplayed()) {
			System.out.println(t.findElement(By.xpath("//div[@id='finish']/h4")).getText());
		}else {
			System.out.println("NOt Able to find it");
		}
		
		return web;
		
	}

}
