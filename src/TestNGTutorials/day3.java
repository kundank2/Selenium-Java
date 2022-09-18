package TestNGTutorials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(groups = {"Smoke"})
	public void webLoginCarLoan() {
		System.out.println("webLogin");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("it'll execute before execution of any method in the class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("it'll execute after execution of all method in the class");
	}
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I'll execute before every method");
	}
	
	@AfterMethod
	public void afterEvery() {
		System.out.println("I'll execute after every method");
	}
	
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("mobileLogin");
	}
	
	@Test
	public void loginAPICarLoan() {
		System.out.println("loginAPICarLoan");
	}

}
