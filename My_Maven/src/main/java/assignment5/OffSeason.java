package assignment5;

public class OffSeason extends Onseason
{

	public void discount(int amount)
	{
		int amou=(amount*15)/100;
		System.out.println("your off season amount is :" +amou);
		super.discount(9000);
	}
	
	public static void main(String[] args)
	{
		OffSeason obj=new OffSeason();
		obj.discount(4000);

	}

}
