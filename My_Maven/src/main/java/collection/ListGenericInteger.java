package collection;
import java.util.*;

public class ListGenericInteger 
{

	public static void main(String[] args) 
	{
		List<Integer> al=new ArrayList<>();//creating an object of list interface
		al.add(45);//used for updating element
		al.add(60);
		al.add(100);
		al.add(345);
		System.out.println(al);
		
		al.remove(2);//used to remove the element in a list
		System.out.println(al);
		
		al.set(1,700);//used to updating elements in list
		System.out.println(al);
		
		
		
	
		
		int s=al.get(0);//accesing single element from the list
		int s1=al.get(1);
		System.out.println(s);
		System.out.println(s1);
		
		boolean isPresent=al.contains(45);//checking if an element presenting in the list
	    System.out.println(isPresent);
	    boolean isPresent1=al.contains(1000);
	    System.out.println(isPresent1);
	

	}

}
