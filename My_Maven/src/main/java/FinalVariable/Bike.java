package FinalVariable;//final key word used in variable

public class Bike
{
	final int speedlimit=100;// declare a final variable

	public void run()
   {
	//speedlimit=300;   //cannot be changed its fixed.
	}
	public static void main(String[] args) 
	{
		Bike obj=new Bike();
		obj.run();

	}

}
