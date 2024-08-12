package inherittance;

public class HierarchicalChild2 extends HierarchicalParent
{
	public void sub()
	{
	int g=a-b;
	System.out.println(g);
	}

	public static void main(String[] args) 
	{
		
		HierarchicalChild2 obj1=new HierarchicalChild2();
		obj1.sub();
		obj1.add();
	}

}
