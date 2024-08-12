package superKeyword;

public class DogMethod extends AnimalMethod {
	
	
	public void display()
	{
		System.out.println("welcome");
	}
	
	public void sum()
	{
		super.display();
	}

	public static void main(String[] args) {
		
		DogMethod obj=new DogMethod();
		obj.sum();
		obj.display();

	}

}
