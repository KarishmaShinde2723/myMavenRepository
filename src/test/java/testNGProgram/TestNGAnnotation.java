package testNGProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("1.....BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
    {
		System.out.println("2....BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("3....BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("4....BeforeMethod");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("0....TestCase1");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("0....TestCase2");
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("0....TestCase3");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("1....AfterMethod");
	}
	 
	@AfterClass
	public void afterClass()
	{
		System.out.println("2....AfterClass");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("3....AfterTest");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("4....AfterSuite");
	}

	
}
