package exceptions;

import java.io.IOException;

public class CheckedThrows
{

	public static void add() throws IOException

	{
		throw new IOException("error");
		
	}
	public static void main(String[] args)
	{
		
		try {
			CheckedThrows.add();
		} catch (IOException e) {
		
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
