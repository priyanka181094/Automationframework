package vtigergenericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public String getSystemdate()
	{
		Date d=new Date();
		return d.toString();
		// TODO Auto-generated method stub

	}
	//to covert it to myformat beacuse . is not accepted

	public String Systemdateinmyformat()
	{
		Date d=new Date();
		String currentdate[]=d.toString().split(" ");
		String month=currentdate[1];
		String date2=currentdate[2];
		String time=currentdate[3].replace(":","-");
		String year=currentdate[4];
		String finaldate=month+date2+time+year;
		System.out.println(finaldate);
		return finaldate;
		// TODO Auto-generated method stub

	}
	public int getrandom()
	{
		Random r=new Random();
		int ran=r.nextInt();
		return ran;
		
	}

}
