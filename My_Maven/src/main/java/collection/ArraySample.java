package collection;
import java.util.*;
public class ArraySample {

	public static void main(String[] args)
	{
		
ArrayList<String> al=new ArrayList<>();
al.add("Jinu");
al.add("Nithin");
al.add("Aadav");
al.add("Ahaan");
System.out.println(al);
//get index 2
String s=al.get(2);
System.out.println(s);

//remove index 0 then print array
al.remove(0);
System.out.println(al);

//search an element
boolean isPresent=al.contains("appu");
System.out.println(isPresent);
boolean isPresent1=al.contains("Aadav");
System.out.println(isPresent1);

Iterator<String> it=al.iterator();
/*for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}*/

while(it.hasNext())
{
	System.out.println(it.next());
}


	}

}
