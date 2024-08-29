package interface1;

public class Sample2 implements Sample1 {

	public void display()
	{
		System.out.println("interface example");
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		//Sample2 obj=new Sample2();
		//obj.display();
		//obj.add();
		           //we get only display()(interface method)
Sample1 obj=new Sample2();//create object of current interface =new constructor call 
obj.display();
	}

}
