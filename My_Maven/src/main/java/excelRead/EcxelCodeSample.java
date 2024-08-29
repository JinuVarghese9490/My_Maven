package excelRead;
import java.io.IOException;
public class EcxelCodeSample {

	public static void main(String[] args) throws IOException
	{
		String s=ExcelMain.readStringData(0,0);//passing i j for printing values
		System.out.println(s);
		String d=ExcelMain.readIntegerData(1,1);
		System.out.println(d);
	}

}
