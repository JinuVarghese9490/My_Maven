package exceptions;

public class TryCatchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		//int c=a/b;
		//System.out.println(c);
		try
		{
			int c=a/b;//may throw an exception
		}
		
       //handling the exception
		catch(ArithmeticException e)  //e is the reference variable
		{
			System.out.println(e);
		}
		System.out.println("rest of code");
	}

}
