package vtigerObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactHeaderPage {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement contactheadertext;
	
	public  ContactHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getContactheadertext() {
		return contactheadertext;
	}
	
	
	public String contactHeaderApp()
	{
		return  contactheadertext.getText();
	}

	

	

}
