package vtigerObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactspage {
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement clickoncontactlookup;


	 public  Contactspage (WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }


	public WebElement getClickoncontactlookup() {
		return clickoncontactlookup;
	}


	//Businesslibrary
	public  void clickoncreatecontactlookupimageApp()
	{
		clickoncontactlookup.click();
	}

}
