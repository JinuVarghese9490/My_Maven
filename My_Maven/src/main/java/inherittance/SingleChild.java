package inherittance;

public class SingleChild extends SingleParent
{
	
	public void sub()
	{
		int d=a-b;
		System.out.println(d);
		
		}

	public static void main(String[] args)
	{
		SingleChild obj=new SingleChild();
		obj.sub();
		obj.display();


}
}

