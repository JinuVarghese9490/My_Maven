import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter your name :");
		String s=in.nextLine();
		
		System.out.println("enter your age :");
		int a=in.nextInt();
		
		System.out.println("enter your salary :");
		double d=in.nextDouble();
		
		System.out.println("the details are :");
		System.out.println(s);
		System.out.println(a);
		System.out.println(d);
		in.close();

	}

}
