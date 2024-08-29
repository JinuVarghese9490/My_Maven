package test;

public class Voting 
{
  public void display(int a)
  {
	  if(a>=18)
	  {
		  System.out.println("eligible for voting");
	  }
	  else
	  {
		  System.out.println("not eligible");
	  }
  }
	
	
	
	public static void main(String[] args) 
	{
		Voting obj=new Voting();
		obj.display(30);

	}

}
