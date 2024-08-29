package test;

public class StaticMethod 
{
	static int a=3;//static variable
	int d=5;//instance variable //for printing instance variable we need a instance method
	public static void display()
	{
		
		int b=16;//local variable in static method
		System.out.println(b);
		//System.out.println(v);
		//System.out.println(d);//Cannot make a static reference to the non-static field
		//System.out.println(y);
	}
	/*public void dis()
	{
		int v=8;//local variable in instance method
        System.out.println(d);
        System.out.println(v);
     //  System.out.println(b);
      
	}*/
	public StaticMethod()
	{
		int y=60;
		System.out.println(a);
		System.out.println(d);
		//System.out.println(b);
	}

	public static void main(String[] args) 
	{
		//System.out.println(a);
		//System.out.println(d);//also cannot in main method
		StaticMethod.display();
		//System.out.println(b);
		//System.out.println(v);
		StaticMethod obj=new StaticMethod ();
		//obj.dis();
		//System.out.println(y);
		

	}

}
