package Polymorphism;

public class PolyMorphismChild extends PolyMorphismParent 
{
	
public void display()
{
	System.out.println("polymorphism child");

}
	
	
	public static void main(String[] args) {
		
		PolyMorphismChild obj=new PolyMorphismChild();
		obj.display();
		PolyMorphismParent obj1=new PolyMorphismParent();
		obj1.display();
	}

}
