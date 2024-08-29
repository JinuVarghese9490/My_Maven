package collection;
import java.util.*;
public class linkedList {

	public static void main(String[] args) 
	{
		LinkedList<Integer> al=new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		al.set(2,80);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		int a=al.size();
		for(int i=0;i<a;i++)
		{
			System.out.println(al.get(i)+" ");
		}

	}

}
