package vtigerObjectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtigergenericUtility.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility
{
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement clicksavebutton;
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img[@title='Select']")
	private WebElement organizationlookup;
	//now handling window in webpage
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchtext;
	@FindBy(xpath="//input[@type='button']")
	private WebElement searchbuttonclick;
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}
	public WebElement getOrganizationlookup() {
		return organizationlookup;
	}
	public WebElement getSearchtext() {
		return searchtext;
	}
	public WebElement getSearchbuttonclick() {
		return searchbuttonclick;
	}
	public  CreateNewContactPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Businesslibrary
	public void createnewContactwithlastname(String lastnameinput)
	{
		lastname.sendKeys(lastnameinput);
		clicksavebutton.click();
	}
	public void createContactwithlorganization(String lastnameinput,String orgname,WebDriver driver)
	{
		lastname.sendKeys(lastnameinput);
		organizationlookup.click();
		 windowswitching(driver,"Accounts&action");
		searchtext.sendKeys(orgname);
		searchbuttonclick.click();
		driver.findElement(By.xpath( "//a[text()='"+orgname+"']")).click();//dynamicxpath
		 windowswitching(driver,"Contacts");
		 clicksavebutton.click();
		
	}









	






	











	}






	






	






	






	


