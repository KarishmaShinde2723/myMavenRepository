package testNGKeyWords;

import org.testng.annotations.Test;

public class DependsOnMethodKeyWord 
{
	@Test
	public void loginPageTest()
	{
		System.out.println(2/0);
		System.out.println("Login page testcase is passed");
	}
	
	@Test(dependsOnMethods = "loginPageTest")
	public void homePageTest()
	{
		System.out.println("Home Page Test Is passed");
	}
	
	@Test(dependsOnMethods = "loginPageTest")
	public void addToCartPageTest()
	{
		System.out.print("AddToCart Page Testcase is Passed");
		
	}
	//if testcase gets failed then rest of them will be skipped

}
