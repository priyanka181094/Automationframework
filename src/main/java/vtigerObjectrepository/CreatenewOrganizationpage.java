package vtigerObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtigergenericUtility.WebDriverUtility;

public class CreatenewOrganizationpage extends WebDriverUtility {

	
		@FindBy(xpath="//input[@name='accountname']")
		private WebElement orgnameedit;
		//choosefrom dropdown
		@FindBy(name="industry")
		private WebElement industrydropdown;
		//click on save
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement savebuttonedit;
		
		public CreatenewOrganizationpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getOrgnameedit() {
			return orgnameedit;
		}

		

		public WebElement getIndustrydropdown() {
			return industrydropdown;
		}

		
		public WebElement getSavebuttonedit() {
			return savebuttonedit;
		}

		//business librery
		//create organization with orgname
		public void createOrganizationApp(String orgname)
		{
			 orgnameedit.sendKeys(orgname);
			 savebuttonedit.click();
		}
		//another scenario
		//create organization with industry
		public void createOrganizationwithindustryApp(String orgname,String industryname)
		{
			orgnameedit.sendKeys(orgname);
			selectelementfromDropDown(industryname,industrydropdown);
			savebuttonedit.click();
		}
}
		


