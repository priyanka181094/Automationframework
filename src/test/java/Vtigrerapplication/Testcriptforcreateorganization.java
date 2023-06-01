package Vtigrerapplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtigerObjectrepository.CreatenewOrganizationpage;
import vtigerObjectrepository.HomePagePOM;
import vtigerObjectrepository.LoginPagePOM;
import vtigerObjectrepository.Organizationinformation;
import vtigerObjectrepository.Organizatiopage;
import vtigergenericUtility.BaseClass;
import vtigergenericUtility.DatafileUtility;
import vtigergenericUtility.ExcelfileUtility;
import vtigergenericUtility.JavaUtility;
import vtigergenericUtility.PropertyfileUtility;
import vtigergenericUtility.WebDriverUtility;

public class Testcriptforcreateorganization extends BaseClass{

	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException
	{
		DatafileUtility dutility=new DatafileUtility();
		PropertyfileUtility putility=new PropertyfileUtility();
		ExcelfileUtility eutility=new ExcelfileUtility();
		WebDriverUtility wutility=new WebDriverUtility ();
		JavaUtility jutility=new JavaUtility();
		
		// TODO Auto-generated method stub

		
		
		
		String orgname=eutility.excelgeneric("Organization",1,2)+jutility.getrandom();
		
		
		
		
		 
		

		 //click on organization link
		 HomePagePOM hop=new HomePagePOM(driver);
		 hop.clickonorganizationLink();
		
		 //click on organization lookup
		 Organizatiopage  omo=new Organizatiopage (driver);
		 omo.createOrganizationimageApp();
		 //enter the orgname and save
		 CreatenewOrganizationpage cop=new CreatenewOrganizationpage(driver);
		 cop. createOrganizationApp(orgname);
		 Organizationinformation ous=new Organizationinformation(driver);
		String result= ous. getorgHeaderApp();
		
			
			System.out.println(result);
			
			if(result.contains(orgname))
				{
			System.out.println("testcase pass");
			}
			else
			{
			System.out.println("testcasefalied");
		}
			
		
		// TODO Auto-generated method stub

	}

}

