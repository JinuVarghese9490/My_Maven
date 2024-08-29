package assignment5;

public class Bank
{
	
	private double pin;
	public double getPin()
	{
		return pin;
	}
	public void setPin(double pin)
	{
		
		if((pin==1001)||(pin==1234)||(pin==1212))
		{
			this.pin=pin;
			System.out.println("Valid Pin Number \nYou can Withdraw your amount");
		}
		else
		{
			System.out.println("Invalid Pin Number");
		}
		
	}
}
