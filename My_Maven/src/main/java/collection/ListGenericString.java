package collection;
import java.util.*;

public class ListGenericString
{

	public static void main(String[] args) 
	{
		List<String> al=new ArrayList<>();//creating an object of list interface
		al.add("jinu");//used for updating element
		al.add("hello");
		al.add("java");
		System.out.println(al);
		
		al.set(2,"hii");//used to updating elements in list
		System.out.println(al);
		
		al.remove(1);//used to remove the element in a list
		System.out.println(al);
		
		//al.getFirst();
		
		String s=al.get(0);//accesing single element from the list
		String s1=al.get(1);
		System.out.println(s);
		System.out.println(s1);
		
		boolean isPresent=al.contains("jinu");//checking if an element presenting in the list
		System.out.println(isPresent);
		boolean isPresent1=al.contains("welcome");
		System.out.println(isPresent1);
	

	}

}
