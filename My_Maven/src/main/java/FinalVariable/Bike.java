package FinalVariable;//final key word used in variable

public class Bike
{
	final int speedlimit=700;// declare a final variable

	public void run()
   {
	//speedlimit=100;   //cannot be changed its fixed.
		System.out.println(speedlimit);
	}
	public static void main(String[] args) 
	{
		Bike obj=new Bike();
		obj.run();

	}

}
