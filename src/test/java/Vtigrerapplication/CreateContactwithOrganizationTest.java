package Vtigrerapplication;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtigerObjectrepository.ContactHeaderPage;
import vtigerObjectrepository.Contactspage;
import vtigerObjectrepository.CreateNewContactPage;
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

 
@Listeners(vtigergenericUtility.Listenerimplenetationclass.class)
public class CreateContactwithOrganizationTest extends BaseClass
{

	@Test(groups="Regressionsuite")
	public void createcontactwithorganization() throws EncryptedDocumentException, IOException
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
		 //fetch the organization name
			
		 Organizationinformation ous=new Organizationinformation(driver);
			String result= ous. getorgHeaderApp();
			
			//assertion to validate
			Assert.assertTrue( result.contains(orgname));
			System.out.println("organizatiion created sucessfully");
			
			

			//now  navigate  to contact module
			//click on contact link
			hop.contactLinkApp();
			//click on contact lookup
			 Contactspage copp=new  Contactspage(driver);
			 copp.clickoncreatecontactlookupimageApp();
			
			
			//craete contact with organization
			 //taking the lastname input 
			 String lastnamecontact= eutility.excelgeneric("Contact",1,2)+jutility.getrandom();
			 CreateNewContactPage co=new  CreateNewContactPage(driver);
			 co.createContactwithlorganization(lastnamecontact, orgname, driver); 
			 //validate with contact
			 ContactHeaderPage uo=new ContactHeaderPage(driver);
			 
			String actualresult= uo.contactHeaderApp();
			//we are validating using assertion
			Assert.assertTrue( actualresult.contains(lastnamecontact));
			System.out.println("contact craeted succesfully");
			
			 
			 
					
			 
			
			
			
			
			
		

	}
	@Test
	public void demosuite()
	{
		System.out.println("demo suite is here");
	}
	{
		
	}

}

