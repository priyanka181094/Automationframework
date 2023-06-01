package Prcaticepackage;

import org.testng.annotations.Test;

public class Mavenpractice {
	@Test
	public  void readdata()
	{
		String URL=System.getProperty("url");
		System.out.println(URL);
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		String PASSWORD=System.getProperty("password");
		System.out.println(PASSWORD);
		
	}

}
