package TestNGTutorials;

import org.testng.annotations.Test;

public class day2 {
  @Test
  public void funDay1() {
	  System.out.println("Having Fun 2");
  }
  
  @Test(groups = {"Smoke"})
  public void sunday1() {
	  System.out.println("Sunday 2");
  }
  
  @Test
  public void method1() {
	  System.out.println("Method 2");
  }
}
