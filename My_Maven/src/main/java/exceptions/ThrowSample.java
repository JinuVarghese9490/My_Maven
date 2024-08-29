package exceptions;

public class ThrowSample
{
public static void sum(int a,int b)//create a static method for throw.throw only inside a method
{
	int c=a+b;
	if(c>30)
	{
		throw new ArithmeticException("sum greater than 30");
	}
	else
	{
		//may throw new exception
		System.out.println("sum lesser 30");
	}
}
	
	
	public static void main(String[] args) 
	{
		//ThrowSample.sum(32, 60);
		try
		{
		ThrowSample.sum(32, 60);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		

	}

}
