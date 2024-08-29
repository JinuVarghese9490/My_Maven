package exceptions;

public class MultiCatchSample 
{

	public static void main(String[] args)
{
    int a=20;
    int b=0;
    //int g[]=new int[5];
		
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


catch(Exception u)//not know any exception
	{
		System.out.println("parent exception");
		}
System.out.println("rest of code");
}
}

