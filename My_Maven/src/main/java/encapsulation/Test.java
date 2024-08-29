package encapsulation;

public class Test 
{

	public static void main(String[] args)
	{
   Student obj=new Student();//create object for parent class
   obj.setName("jinu");//call parent class with parameter as a string
   System.out.println(obj.getName());//get the output through getname()
	}

}
