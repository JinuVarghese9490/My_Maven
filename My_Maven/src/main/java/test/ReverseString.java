package test;

public class ReverseString             //using for loop
{
 
public static void main(String[] args)
	{
		
String s1="hello";
for(int i=s1.length();i>0;i--)               //i is the length of the string ie 5 
{
	System.out.print(s1.charAt(i-1));        //printing the character at index i-1  (5-1)
}
	}

}
