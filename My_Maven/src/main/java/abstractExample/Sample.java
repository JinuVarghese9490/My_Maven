package abstractExample;

public class Sample extends AbstractClass 
{
	
public void print()
{
	System.out.println("Example of Abstract method");
}
	public static void main(String[] args)
	{
		
		Sample obj=new Sample();
		obj.print();
		obj.display();
	}

}
