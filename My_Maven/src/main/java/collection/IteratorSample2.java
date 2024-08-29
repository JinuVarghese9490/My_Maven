package collection;
import java.util.*;
public class IteratorSample2 
{

	public static void main(String[] args)
	{
		ArrayList<String> cityNames = new ArrayList<String>();  
	    
        cityNames.add("Delhi");  
        cityNames.add("Mumbai");  
        cityNames.add("Kolkata");  
        cityNames.add("Chandigarh");  
        cityNames.add("Noida");  
    
        // Iterator to iterate the cityNames  
        Iterator  it  = cityNames.iterator ();  
    
        System.out.println("CityNames elements : ");  
    
        while ( it.hasNext()) 
        {
            System.out.println( it.next() + " ");  
        }
    
        System.out.println();  
   }  
}


