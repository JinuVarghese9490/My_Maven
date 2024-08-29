package exceptions;//final block execute without handling exceptions ie not contain catch block

public class FinallyWithoutCatch {

	public static void main(String[] args) 
	{
	
int a=10;
int b=0;
try
{
	int c=a/b;
}
finally
{
	System.out.println("it will always executed");//finally block print anything 
}
}
	
}
