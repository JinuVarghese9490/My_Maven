package Polymorphism;

public class PolyChild extends PolyParent
{
public void display()
{
	System.out.println("jinu");
	super.display();
	}
	
	public static void main(String[] args) 
	{
		PolyChild obj=new PolyChild();
		obj.display();
	}

}
