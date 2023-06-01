package vtigerObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizatiopage {

	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement  createOrganizationimage;
	
	public Organizatiopage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//getter utilization

	public WebElement getCreateOrganizationimage() {
		return createOrganizationimage;
	}
	//business librery
	//to click on lookup
	public void  createOrganizationimageApp()
	{
		createOrganizationimage.click();
	}

	
	
		
	
		// TODO Auto-generated method stub

	}


