package exceptions;

public class UserExceptionSample 
{

	public void display(int age) throws LicenseException 
	{
		if(age<18)
		{
			throw new LicenseException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	
	public static void main(String[] args) throws LicenseException 
	{
		UserExceptionSample obj=new UserExceptionSample ();
		obj.display(40);

	}

}
