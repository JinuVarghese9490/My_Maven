package collection;
import java.util.*;

public class ListNonGeneric 
{

	public static void main(String[] args) 
	{
		List al=new ArrayList();
		al.add(2);
		al.add(10);
		al.add(15);
		System.out.println(al);
		
		al.set(2,100);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
	    int a=(int) al.get(0);
	    System.out.println(a);
	    int b=(int) al.get(1);
	    System.out.println(b);
	    
	    boolean isPresent=al.contains(2);
	    System.out.println(isPresent);
	    boolean isPresent1=al.contains(34);
	    System.out.println(isPresent1);

	}

}
