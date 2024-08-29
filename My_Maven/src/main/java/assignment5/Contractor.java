package assignment5;

public class Contractor extends  Employee
{

	
	public static void main(String[] args) 
	{
		 Contractor obj=new  Contractor();
		 obj.calculateSalary();
		 obj.calculateSalary(5);
	
	}

	@Override
	public void calculateSalary(int a) 
	{
      int b=500;
      int cal=(a*b);
      System.out.println("Total Salary of part time employee :" +cal);
		
	}
	public void  calculateSalary()
	{
		int b=800;
		int cal=8*b;
		System.out.println("Total Salary of full time employee :" +cal);
	}

}
