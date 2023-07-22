package testNGKeyWords;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsKeyword {
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("4. ---beforeMethod");
	}
	
	
	@Test(priority = 2,groups = "ABC")
	public void testcase1()
	{
		System.out.println("0. ---testcase1");
	}
	
	@Test(priority = 1 ,groups = "XYZ")
	public void testcase2() //testcase
	{
		System.out.println("0. ---testcase2");
	}
	
	@Test(priority = 3, groups = "MNO")
	public void testcase3()
	{
		System.out.println("0. ---testcase3");
	}
	
	@Test(priority = 4, groups = "XYZ")
	public void testcase4()
	{
		System.out.println("0. ---testcase4");
	}
	
	@Test(priority = 5, groups = "ABC")
	public void testcase5()
	{
		System.out.println("0. ---testcase5");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("5. ---afterMethod");
	}

}
