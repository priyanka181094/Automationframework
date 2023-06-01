package Prcaticepackage;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretryalalyzer {
	@Test(retryAnalyzer=vtigergenericUtility.RetryAnalyzerImplementation.class)
	public void practice()
	{
		Assert.fail();
		System.out.println("practice iretryannotation");
	}

}
