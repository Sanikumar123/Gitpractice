package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer{
	//retry
	int retry = 0;
	int max=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retry<max)
		{
			retry++;
			return true;
		}
		return false;
	}

}
