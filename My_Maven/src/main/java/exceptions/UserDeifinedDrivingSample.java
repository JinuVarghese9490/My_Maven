package exceptions;

public class UserDeifinedDrivingSample 
{
public void show(int a) throws UserDefinedDrivingException//instance method
{
	if(a>18)
	{
		System.out.println("not eligible");
	}
	else
	{
		throw new UserDefinedDrivingException("eligible for driving licence");
		
	}
}
	
	public static void main(String[] args)
	{
	
		UserDeifinedDrivingSample ojb=new UserDeifinedDrivingSample ();
		try {
			ojb.show(4);
		} catch (UserDefinedDrivingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}

}
