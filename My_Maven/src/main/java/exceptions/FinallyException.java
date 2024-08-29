package exceptions;//finally block execute with or without catch block

public class FinallyException {

	public static void main(String[] args) 
	{
	int a=10;
	int b=0;
		
try 
{
	
	int g[]=new int[5];
	g[10]=7;
	int c=a/b;
	
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException r)
{
	System.out.println(r);
	}


catch(Exception u)//not know any exception simply write Exception
	{
		System.out.println("parent exception");
	}
	
	
	finally
	{
		System.out.println("finally block will always executed");
	}
   System.out.println("rest of code");
}
}
