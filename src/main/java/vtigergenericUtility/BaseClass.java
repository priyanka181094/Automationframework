package vtigergenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtigerObjectrepository.HomePagePOM;
import vtigerObjectrepository.LoginPagePOM;

public class BaseClass {
	DatafileUtility dutility=new DatafileUtility();
	PropertyfileUtility putility=new PropertyfileUtility();
	ExcelfileUtility eutility=new ExcelfileUtility();
	WebDriverUtility wutility=new WebDriverUtility ();
	JavaUtility jutility=new JavaUtility();
	
	public static WebDriver ssdriver;//for listener

	
	public WebDriver driver;
	
	@BeforeSuite(groups="SmokeSuite")
	public void bsConfig()
	{
		System.out.println("get the database connection");
	}
	
	@BeforeClass(groups="SmokeSuite")
	
	//for crossbrowser execution public void  bcConfig(String Browser)
	public void  bcConfig() throws Throwable
	{
		String browsername=putility.propertfileutility("browser");
		String url=putility.propertfileutility("url");
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			
			// WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 System.out.println("Base class is working"+browsername+"browser launched succesfully");
			
		}
		else 
		{
			 //WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println("edge browser is launched");
		}
		
		
		 ssdriver=driver;//renializaing;//listener
		wutility.maximizethewindow(driver);
		wutility.waitforpage(driver);
		 driver.get(url);
	}
	
	@BeforeMethod(groups="SmokeSuite")
	public void  bmConfig() throws Throwable
	{
		//for username and password and click on login
		
		String username=putility.propertfileutility("username");
		String password=putility.propertfileutility("password");
		 LoginPagePOM  logo=new LoginPagePOM (driver);
		 logo.LoginApp(username,password);	
		 System.out.println("login successfull");
		
	}
	@AfterMethod(groups="SmokeSuite")
	public void  amConfig()
	{
		
		 HomePagePOM hp=new  HomePagePOM(driver);
		hp.logoutApp(driver);
		System.out.println("logout from application");
	}



@AfterClass(groups="SmokeSuite")
public void  acConfig()
{
	driver.close();
	System.out.println("........browser closed.......");
}

@AfterSuite(groups="SmokeSuite")
public void  asConfig()
{
	System.out.println("delete the database connection");
}
	

	
	

}
