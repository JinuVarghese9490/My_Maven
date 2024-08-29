package exceptions;

public class ThrowSample2 
{
	public void vote(int age)
	{
		if(age>18)
		{
			throw new ArrayIndexOutOfBoundsException("not eligible");
		}
		else
		{
			//System.out.println("eligible for voting");
			throw new NullPointerException("eligible");
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		ThrowSample2 obj=new ThrowSample2();
		//obj.vote(5);
		try
		{
		obj.vote(50);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	