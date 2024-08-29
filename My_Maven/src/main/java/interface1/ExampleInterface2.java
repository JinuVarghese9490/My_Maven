package interface1;

public class ExampleInterface2 implements ExampleInterface
{

	
	
	public static void main(String[] args)
	{
		ExampleInterface2 obj=new ExampleInterface2();
		obj.display();
		obj.show();

	}

	@Override
	public void display() 
	{
	System.out.println("hii");
	
	}

	@Override
	public void show() 
	{
		System.out.println("hello");
		
	}

}
