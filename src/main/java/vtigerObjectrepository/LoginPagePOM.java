package vtigerObjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {

	
		//1.create pom class for every webpage
		//2.identifuy webelemet with @FindBY,@FindBys,@ FindAll
		@FindBy(name="user_name")
		private WebElement usernameedit;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement passwordedit;
		
		@FindBy(id="submitButton")
		private WebElement submitbuttonedit;
		//Rule 3
		//create a constructor to initialize the webElement
		public LoginPagePOM(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//Rule 4
		public WebElement getusernameedit()
		{
			return usernameedit;
		}
		public WebElement getpasswordedit()
		{
			return passwordedit;
		}
		public WebElement getsubmitbuttonedit()
		{
			return submitbuttonedit;
		}
		//Business Libraries .generic method spefied in curent project
		//this method will execute login id and password(generic method
		public void LoginApp(String username,String password)
		{
			usernameedit.sendKeys(username);
			passwordedit.sendKeys(password);
			submitbuttonedit.click();
			
			
		}
		
	
		
		
		
		// TODO Auto-generated method stub

	

}
