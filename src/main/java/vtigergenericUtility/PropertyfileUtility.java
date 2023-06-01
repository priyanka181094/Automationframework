package vtigergenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**this class consist of greneric methods to read data from property  file
 * @author priyanka
 */

//singlelinecommand

public class PropertyfileUtility {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws Throwable
	 */

	public String propertfileutility(String key) throws Throwable
	{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Priyanka Ghosh\\OneDrive\\Desktop\\chaitrapropertyfile.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
		// TODO Auto-generated method stub

	}

}
