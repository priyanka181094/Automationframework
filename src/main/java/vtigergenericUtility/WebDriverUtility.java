package vtigergenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this method will maximize the window,if we declare the driver gobally always it svalue will be null, so its not desired so we should
 * always paramiterize the driver to get the vale by calling it.
 * @author Priyanka Ghosh
 *
 */

public class WebDriverUtility {
	
	
	public void maximizethewindow(WebDriver driver)
		{
			driver.manage().window().maximize();
		}

	public void minimizethewindow(WebDriver driver)
		{
			driver.manage().window().minimize();
		}
	public void waitforpage(WebDriver driver)

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// TODO Auto-generated method stub

	}
	public void waitforElementToBeVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(element));
}
	public void waitforclickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=	new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
}
	public void selectelementfromDropDown(WebElement wb,int index)
	{
		Select s =new Select(wb);
		s.selectByIndex(index);
	}
	public void selectelementfromDropDown(WebElement wb,String value)
	{
		Select s =new Select(wb);
		s.selectByValue(value);
	}
	public void selectelementfromDropDown(String visibletext,WebElement wb)
	{
		Select s =new Select(wb);
		s.selectByVisibleText(visibletext);
	}
	public void getAllOptionsfromDropDown(WebElement wb)
	{
		Select s =new Select(wb);
		List<WebElement>allops=s.getOptions();
		for(WebElement option:allops)
		{
			String text=option.getText();
			System.out.println(text);
		}
	}

		//scrolling operataion
		public void scrollByamount(WebDriver driver,int x,int y)
		{
			Actions act=new Actions(driver);
			act.scrollByAmount(x,y).perform();
			
		}
		public void scrollToElement(WebDriver driver,WebElement wb)
		{
			Actions act=new Actions(driver);
			act.scrollToElement(wb).perform();
			
		}
		//mouseoveraction
		///click on page anywhere
		public void rightclick(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.contextClick().perform();
			
		}
		//click on particular element
		
		public void rightclick(WebDriver driver,WebElement wb)
		{
			Actions act=new Actions(driver);
			act.contextClick(wb ).perform();
			
		}
		public void doubleclick(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.doubleClick( ).perform();
			
		}
		public void doubleclick(WebDriver driver,WebElement wb)
		{
			Actions act=new Actions(driver);
			act.doubleClick(wb ).perform();
			
		}
		public void draganddropaction(WebDriver driver,WebElement srcwb,WebElement deswb)
		{
			Actions act=new Actions(driver);
			act.dragAndDrop(srcwb,deswb ).perform();
			
		}
		public void mouseHoverAction(WebDriver driver,WebElement wb)
		{
			Actions act=new Actions(driver);
			act.moveToElement(wb).perform();
			
		}
		
		
//alertopoups
public String alertpopup(WebDriver driver)
{ 
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		
		return text;
}
public void  alertclick(WebDriver driver)
{ 
	 
	
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
}
public void alertdismiss(WebDriver driver)
{


Alert alt=driver.switchTo().alert();

alt.dismiss();
}

///handle frame

public void framehandlenameid(WebDriver driver,String nameId)
{
	driver.switchTo().frame(nameId);
}
public void framehandleWebelement(WebDriver driver,WebElement wb)
{
	driver.switchTo().frame(wb);
}
public void framehandleid(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
public void parentframe(WebDriver driver)
{
	driver.switchTo().parentFrame();
}
public void defaultframe(WebDriver driver)
{
	driver.switchTo().defaultContent();
}
//javascript excutor
public void javascriptexecutor(WebDriver driver,String code)
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript(code);
}

public void javascriptexecutorscroll(WebDriver driver)
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)","");
}
public void javascriptexecutorwebelemnent(WebDriver driver,WebElement wb)
{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	int y=wb.getLocation().getY();
	jse.executeScript("window.scrollBy(0,"+y+")",wb);
}
	
	

///window switching
public void windowswitching(WebDriver driver,String partialtitle)
{
	Set<String>winids=driver.getWindowHandles();
	for(String id:winids)
	{
		String title=driver.switchTo().window(id).getTitle();
		if(title.contains(partialtitle))
		{
			//will perform operation
			break;
	}
}
}
	public String takescreenshot(WebDriver driver,String screenshotnameCM) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		 String localdatetime = LocalDateTime.now().toString().replaceAll(":", "_");
		
		File trg=new File(".\\SCREENSHOTCHAITRA\\"+screenshotnameCM+" "+localdatetime+".png");//taking ssname from caller
		FileUtils.copyFile(src, trg);
		return trg.getAbsolutePath();
}
	
	
}

































