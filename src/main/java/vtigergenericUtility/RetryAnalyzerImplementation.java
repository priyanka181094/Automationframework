package vtigergenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer{
	

	int count=0;
	int retry=3;//puting manually

	public boolean retry(ITestResult result) {
		
		
		
		while(count<retry)
		{
			count++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
