package exceptions;

public class UncheckedException 
{
public static void display() throws ArithmeticException
{
	throw new ArithmeticException();
	}
	
	
	
	public static void main(String[] args) 
	{
		//UncheckedException.display();
		try
		{
			UncheckedException.display();
		}
		catch( ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

}
