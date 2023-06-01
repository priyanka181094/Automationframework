 package vtigergenericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listenerimplenetationclass  implements ITestListener{
	
	
	//ExtentReports report;
	//ExtentTest test;

	public void onTestStart(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"...........START");
		//test=report.createTest(methodname);
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"...........PASS");
		//test.log(Status.PASS, methodname+"...........PASS");
		
	}

	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"...........FAILED");
		//test.log(Status.PASS, methodname+"...........Failed");
		WebDriverUtility wutility=new WebDriverUtility ();
		JavaUtility jutility=new JavaUtility();
//		try {
//			String path=wutility.takescreenshot(BaseClass.ssdriver,"screenshot");
//			test.addScreenCaptureFromPath(path);
//		}
			
//			
//		 catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"...........SKIPPED");
		//test.log(Status.PASS, methodname+"...........Skip");
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onStart(ITestContext context) {
		System.out.println("suit execution started");
		ExtentSparkReporter htmlreport=new ExtentSparkReporter(".\\ExtentReports\\Report-"+new JavaUtility(). Systemdateinmyformat()+".html");
		htmlreport.config().setDocumentTitle("VTIGER EXECUTION");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("VITIGER EXECUTION REPORT");
		
		
		ExtentReports report=new 	ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("base URL","http://localhost:8888/");
		report.setSystemInfo("Basebrowser","Chrome");
		report.setSystemInfo("Reportername","Priyanka");
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
	
	}

	public void onFinish(ITestContext context) {
		System.out.println("suit executionfinished");
		
		//report.flush();
		
		// TODO Auto-generated method stub
		
}
}

	