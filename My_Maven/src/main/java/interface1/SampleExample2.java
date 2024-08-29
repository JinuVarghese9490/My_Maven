package interface1;

public class SampleExample2 implements Interface2
{
	int a=10;
    int b=20;

	public static void main(String[] args) 
	{
		SampleExample2 obj=new SampleExample2();
		obj.add();
		obj.sub();
    }

	@Override
	public void add() 
	{
		
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void sub()
	{
		
		int d=b-a;
		System.out.println(d);
		
	}

}
