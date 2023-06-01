package vtigerObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationinformation {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement organizationheadertext;
	
	public Organizationinformation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrganizationheadertext() {
		return organizationheadertext;
	}

	//Businessutility
	//validate but no use of if else in Pom class
	public String getorgHeaderApp()
	{
		return organizationheadertext.getText();
	}
	
	

}
