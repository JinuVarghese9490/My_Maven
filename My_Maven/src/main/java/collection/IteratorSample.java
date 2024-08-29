package collection;
import java.util.*;

public class IteratorSample {

	public static void main(String[] args) 
	{
	ArrayList<Integer> al=new ArrayList<>();	
al.add(2);
al.add(40);
al.add(90);
al.add(6);
System.out.println(al);

Iterator<Integer> it=al.iterator();
while(it.hasNext())//move next value
{
	Integer i=it.next();
	if(i<10)
	{
		it.remove();
	}
}
System.out.println(al);
	}

}
