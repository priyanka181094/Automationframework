package vtigergenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelfileUtility {

	public String excelgeneric(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IConstantpath.excelsheetpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheet);
		DataFormatter format=new DataFormatter();
		String organizationame=format.formatCellValue(sh.getRow(row).getCell(cell));
		return organizationame;
		// TODO Auto-generated method stub

	}
	public int getRowNumber(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IConstantpath.excelsheetpath);	
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		int numrow=sh.getLastRowNum();
		return numrow;
	}
	public void writeinexcel(String sheet,int row,int cell,String value)throws Throwable
	{
		FileInputStream fis=new FileInputStream(IConstantpath.excelsheetpath);	
		Workbook wb2=WorkbookFactory.create(fis);
		Sheet sh=wb2.getSheet(sheet);
		FileOutputStream fos=new FileOutputStream(IConstantpath.excelsheetpath);	
		sh.createRow(row).createCell(cell).setCellValue(value);
		wb2.write(fos);
		fos.flush();
	
	}

}
