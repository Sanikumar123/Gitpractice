package testng;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Listeners {
	//listener2
	
	@Test(groups="Reg")
	public void test1()
	{
		
		Assert.assertTrue(true);
	}
	
	@Test(groups="Reg")
	public void test2()
	{
		
		Assert.assertTrue(false);
	}
	
	@Test(groups="Smoke")
	public void test3()
	{
		
		Assert.assertTrue(false);
	}
	
	
	@Test(groups="Smoke")
	public void test4()
	{
		
		Assert.assertTrue(true);
	}
	
	
	@AfterMethod
	public void testStatus(ITestResult status)
	{
		if(status.getStatus()==ITestResult.SUCCESS)
		{
			System.out.println(status.getMethod().getMethodName()+" Passed");
		}
		else if(status.getStatus()==ITestResult.FAILURE)
		{
			System.out.println(status.getMethod().getMethodName()+" Fail");
		}
		
	}

}
