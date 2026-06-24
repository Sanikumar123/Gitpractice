package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {
	
	//testn
	@Test(groups="Reg", retryAnalyzer=RetryClass.class)
	public void test1()
	{
		
		Assert.assertTrue(false);
	}
	
	@Test(groups="Reg")
	public void test2()
	{
		
		System.out.println("Test2");
	}
	
	@Test(groups="Smoke")
	public void test3()
	{
		
		System.out.println("Test3");
	}
	
	
	@Test(groups="Smoke")
	public void test4()
	{
		
		System.out.println("Test4");
	}
	

}
