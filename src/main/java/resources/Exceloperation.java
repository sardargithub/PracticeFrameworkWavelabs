package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Exceloperation 
{

public static String readdata(String Sheetname,int Rowno,int Cellno) throws EncryptedDocumentException, IOException
{
FileInputStream fis = new FileInputStream("D:\\DatadrivenSwagLabs.xlsx");
Workbook w1=WorkbookFactory.create(fis);
String returndata=w1.getSheet(Sheetname).getRow(Rowno).getCell(Cellno).getStringCellValue();
return returndata;
}
public static void writedata(String Sheetname,int Rowno,int Cellno,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("D:\\DatadrivenSwagLabs.xlsx");
	Workbook w2=WorkbookFactory.create(fis);
	w2.getSheet(Sheetname).getRow(Rowno).createCell(Cellno).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("D:\\DatadrivenSwagLabs.xlsx");
	w2.write(fos);
}
}
