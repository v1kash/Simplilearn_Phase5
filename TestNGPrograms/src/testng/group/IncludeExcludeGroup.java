package testng.group;

import org.testng.annotations.Test;

public class IncludeExcludeGroup {
     
	@Test(groups = { "include-test-one" })
	public void testMethodOne() {
		System.out.println("Test Method one");
	}
	
	@Test(groups = { "include-test-two" })
	public void testMethodTwo() {
		System.out.println("Test Method two");
	}
	
	@Test(groups = { "test-one-exclude" })
	public void testMethodThree() {
		System.out.println("Test Method three");
	}
	
	@Test(groups = { "test-two-exclude" })
	public void testMethodFour() {
		System.out.println("Test Method four");
	}
}
