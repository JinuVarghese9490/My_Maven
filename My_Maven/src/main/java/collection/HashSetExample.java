package collection;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) 
	{
		HashSet<String> ak=new HashSet<String>();
		ak.add("bag");
		ak.add("book");
		ak.add("pen");
		ak.add("box");
		System.out.println(ak);
		
		Iterator<String> it=ak.iterator();
		while(it.hasNext())
		{
			
			String s=it.next();
			if((s=="box"))
			{
				it.remove();
			}
			
		}
System.out.println(ak);
	}

}
