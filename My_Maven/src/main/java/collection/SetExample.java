package collection;
import java.util.*;
public class SetExample {

	public static void main(String[] args)
	{
	Set<String>	al=new HashSet<String>();
	al.add("jasmine");
	al.add("rose");
	al.add("lotus");
	al.add("lilly");
	System.out.println(al);
	
	String s1="j";
	System.out.println(al.contains(s1));
	
	
	al.remove("rose");
	System.out.println(al);

	}

}
