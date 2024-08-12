package superKeyword;

public class DogConstructor extends AnimalConstructor 
{

	public DogConstructor()
	{
		super();
		System.out.println("simple");
	}
	
	public static void main(String[] args)
	{
		DogConstructor obj=new DogConstructor();

	}

}
