package test;

public class ReverseWhile {

	public static void main(String[] args) 
	{
		String s1="jinu";
		int i=s1.length();
		while(i>0)
		{
			System.out.print(s1.charAt(i-1));
			i--;
		}

	}

}
