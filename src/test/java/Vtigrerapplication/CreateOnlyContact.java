package Vtigrerapplication;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtigerObjectrepository.ContactHeaderPage;
import vtigerObjectrepository.Contactspage;
import vtigerObjectrepository.CreateNewContactPage;
import vtigerObjectrepository.HomePagePOM;
import vtigerObjectrepository.LoginPagePOM;
import vtigergenericUtility.BaseClass;
import vtigergenericUtility.DatafileUtility;
import vtigergenericUtility.ExcelfileUtility;
import vtigergenericUtility.JavaUtility;
import vtigergenericUtility.PropertyfileUtility;
import vtigergenericUtility.WebDriverUtility;
@Listeners(vtigergenericUtility.Listenerimplenetationclass.class)
public class CreateOnlyContact extends BaseClass{
	@Test(groups="SmokeSuite")
	public void createcontactonly() throws Throwable
	{
	

	
		
		
		DatafileUtility dutility=new DatafileUtility();
		PropertyfileUtility putility=new PropertyfileUtility();
		ExcelfileUtility eutility=new ExcelfileUtility();
		WebDriverUtility wutility=new WebDriverUtility ();
		JavaUtility jutility=new JavaUtility();
		
		
		//to read data from excel
		String lastname=eutility.excelgeneric("Contact",1,2)+jutility.getrandom();
		
		
		
		 
		 
		
		//click on contact link
		 HomePagePOM homo=new  HomePagePOM(driver);
		 homo.contactLinkApp();
		 
		//click on contact lookup
		 Contactspage clogo=new Contactspage(driver);
		 clogo.clickoncreatecontactlookupimageApp();
		
			
		//enter lastname
		 CreateNewContactPage cnew=new CreateNewContactPage(driver);
		 cnew.createnewContactwithlastname(lastname);
		 
		 
		  //header
		 ContactHeaderPage chead=new ContactHeaderPage(driver);
		 String actualresult=chead.contactHeaderApp();
//		 //TO CHECK THE LISTENER
//		 Assert.assertTrue( actualresult.contains("Wasim"));
//			System.out.println("contact created failed");
			
			
			
			


		 Assert.assertTrue( actualresult.contains("Washim"));
			System.out.println("contact created passed");


	
	
		
		
		
		// TODO Auto-generated method stub

	}
	@Test(groups="SmokeSuite")
	public void demosuite()
	{
		System.out.println("demo suite is here");
		
	}
	//creating contact successful
	
		
	

}
