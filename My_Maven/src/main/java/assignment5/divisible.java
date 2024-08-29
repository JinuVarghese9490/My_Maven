package assignment5;

public class divisible extends addition
{
	
	public void display()
	{
		System.out.println(super.c);
		int d=c%10;
		if(d==0)
		{
			System.out.println("the sum divisible by 10");
		}
		else
		{
			System.out.println("the sum not divisible by 10");
		}
	}

	
	public static void main(String[] args) 
	{
		divisible obj=new divisible();
		obj.display();

	}

}
