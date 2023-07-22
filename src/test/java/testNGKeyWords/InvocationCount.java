package testNGKeyWords;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 7)
	public void addition()
	{
		int a=10;
		int b=20;
		int c=30;
		System.out.println(c);
	}

}
