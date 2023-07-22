package assertProgram;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertAndSoftAsert {
	
	SoftAssert s = new SoftAssert();
	
	
	@Test
	public void fun()
	{
		System.out.println("line 1");
		System.out.println("line 2");
		Assert.assertEquals(true, false);//hardAssert
		
		//s.assertEquals(true, false);//SoftAssert
		System.out.println("line 3");
		System.out.println("line 4");
		System.out.println("line 5");
		System.out.println("line 6");
		//s.assertAll();
	}
	
	@Test
	public void myMethod()
	{
		System.out.println("line 7");
		System.out.println("line 8");
	}
	
	

	
	
}
