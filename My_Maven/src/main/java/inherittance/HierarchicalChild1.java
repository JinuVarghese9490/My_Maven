package inherittance;

public class HierarchicalChild1 extends HierarchicalParent
{

	public void mul()
	{
		int f=a*b;
		System.out.println(f);
	}
	
	public static void main(String[] args) 
	{
		
		HierarchicalChild1 obj=new HierarchicalChild1();
		obj.add();
		obj.mul();
	}

}
