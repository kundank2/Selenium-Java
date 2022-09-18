package TestNGTutorials;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	@Parameters({"URL"})
	public void webLoginHomeLoan(String url) {
		System.out.println("webLogin");
		System.out.println(url);
	}
	
	@Test
	@Parameters({"URL"})
	public void mobileLoginHomeLoan(String urlName) {
		System.out.println("mobileLogin");
		System.out.println(urlName);
	}
	
	@Test(groups = {"Smoke"})
	public void loginAPIHomeLoan() {
		System.out.println("loginAPICarLoan");
		
	}

}
