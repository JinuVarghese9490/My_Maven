package inherittance;

public class MultiChild extends MultiParent
{
	
	public void mul()
	{
	int v=a*b;
	System.out.println(v);
	}
	

	public static void main(String[] args) 
	{
		 MultiChild obj=new  MultiChild();
		 obj.mul();
		 obj.display();
		 obj.sub();
   
	}

}
