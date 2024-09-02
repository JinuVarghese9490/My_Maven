package assignment5;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>(); 
		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("black");
		System.out.println("The arraylist are :"+al);//printing all arraylist
		
		String s=al.get(3);
		System.out.println("The retrieved element from the list at aspecified index :"+s);
		
		al.remove(2);//removing 3rd element from the list
		System.out.println("After removing third element :"+al);
		
		boolean isPresent=al.contains("violet");//searching an element in an arraylist
		System.out.println("The mentioned colour is present or not : "+isPresent);
		
		Iterator<String> it=al.iterator();//iterate the all arrayelements
		System.out.println("The iterated colours are :");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}

}
