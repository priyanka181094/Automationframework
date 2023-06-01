package vtigerObjectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtigergenericUtility.WebDriverUtility;

public class HomePagePOM extends WebDriverUtility {

		@FindBy(linkText="Organizations")
		private WebElement organizationLink;
		

		@FindBy(linkText="Contacts")
		private WebElement contactLink;

		@FindBy(linkText="Opportunities")
		private WebElement opportunitiesLink;

		@FindBy(linkText="Products")
		private WebElement productLink;

		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement AdministrationlinkLink;

		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement logoutLink;
		//initialization creating constructor
		public HomePagePOM(WebDriver driver)
		{
			PageFactory.initElements(driver,this);

	}
		//geeter methods
		public WebElement getOrganizationLink() {
			return organizationLink;
		}
		
		public WebElement getContactLink() {
			return contactLink;
		}
		
		public WebElement getOpportunitiesLink() {
			return opportunitiesLink;
		}
		
		public WebElement getProductLink() {
			return productLink;
		}
		
		public WebElement getAdministrationlinkLink() {
			return AdministrationlinkLink;
		}
		
		public WebElement getLogoutLink() {
			return logoutLink;
		}
		//business librery
		public void clickonorganizationLink()
		{
			organizationLink.click();
		}
		public void contactLinkApp()
		{
			contactLink.click();
		}
		public void oppotunitiesLink()
		{
			opportunitiesLink.click();
		}
		public void ProductLink()
		{
			productLink.click();
		}
		public void AdmisnistrationLink()
		{
			AdministrationlinkLink.click();
		}
		public void logoutLink()
		{
			logoutLink.click();
		}
		//this method will perform logout operation
		public void logoutApp(WebDriver driver)
		
		{
			mouseHoverAction(driver,AdministrationlinkLink);
			logoutLink.click();
		}
			
			
			
		}
		 
		


