package superKeyword;

public class Dog extends Animal 
{
	
     String color="red";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) 
	{
     Dog obj=new Dog();
     obj.display();
	}

}
