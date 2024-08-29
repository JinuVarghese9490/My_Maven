package collection;
import java.util.*;
public class ArrayListSample {

	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList<>();
	
	al.add("hello");
	al.add("java");
	al.add("simple");
	al.add(1, "hii");
	System.out.println(al);
	
	al.set(2,"welcome");
	System.out.println(al);

	al.remove(3);
	System.out.println(al);
	
	//for get() method used in for loop
	for(int i=0;i<al.size();i++)
	{
		
		System.out.println(al.get(i)+" ");
	}
/*System.out.println();
ArrayList<Integer> ak=new ArrayList<>();
ak.add(45);
ak.add(20);
ak.add(56);
System.out.println(ak);
int d=ak.size();
System.out.println(d);*/
	}

}
