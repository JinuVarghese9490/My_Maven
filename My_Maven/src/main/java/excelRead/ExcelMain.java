package excelRead;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Ecxecel read not access in onedrive
public class ExcelMain
{
public static FileInputStream f;// read a file its an inbuilt
public static  XSSFWorkbook w;  // access from exemel spread sheet particular sheet 
public static XSSFSheet s;   // read sheet
public static String readStringData(int i,int j) throws IOException//excel contain string value and integer avlue
{                                    //i row,j col
	f=new FileInputStream("C:\\Users\\vargh\\Downloads\\sample.xlsx");//to readfile 
	w=new XSSFWorkbook(f);//read workbook from file to w
	s=w.getSheet("Sheet1");
	XSSFRow r=s.getRow(i);
	XSSFCell c=r.getCell(j);
    return c.getStringCellValue();	
}


public static String readIntegerData(int i,int j) throws IOException
{
	f=new FileInputStream("C:\\Users\\vargh\\Downloads\\sample.xlsx");
	w=new XSSFWorkbook(f);
	s=w.getSheet("Sheet1");
	XSSFRow r=s.getRow(i);
	XSSFCell c=r.getCell(j);
	int y=(int) c.getNumericCellValue();//type casting  convert integer to string
	return String.valueOf(y);//return string value
	
}
}






