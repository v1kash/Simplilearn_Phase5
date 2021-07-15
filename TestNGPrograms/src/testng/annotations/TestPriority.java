package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority=1)
	public void b_method() {
		System.out.println("This is B method");
	}
	
	@Test(priority=2)
	public void a_method() {
		System.out.println("This is A method");
	}
	
	@Test
	public void d_method() {
		System.out.println("This is D method");
	}
	
	@Test
	public void c_method() {
		System.out.println("This is C method");
	}
	
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Starting the test");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Test Finished");
	  }
	
}
