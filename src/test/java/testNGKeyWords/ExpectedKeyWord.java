package testNGKeyWords;

import org.testng.annotations.Test;

public class ExpectedKeyWord
{
    
	@Test(expectedExceptions= ArithmeticException.class)
	public void demo()
	{
		int a = 3/0;
		System.out.println(a);
	}

}////By using expectedExceptions keyword we can handle our exception without using
//try catch block