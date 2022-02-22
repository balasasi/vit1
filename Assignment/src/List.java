import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>name = new ArrayList<String>();
		
		System.out.println("Displaying all elements:");
		name.add("Apple");
		name.add("Mango");
		name.add("Grapes");
		name.add("Banana");
		name.add("Orange");
		
		 for(String s:name){  
		     System.out.println(s);    // Display all the elements 
		   }  
		 System.out.println("******************");
		 
		 System.out.println("**Adding 3rd Position and Removing 4th index**");
		name.set(2,"Papaya");         //Add new fruit at the position 3rd

		name.remove(4);              //Removing fruit in index 4th

		for(String i :name) {
			System.out.println(i);
		}
		Collections.sort(name,Collections.reverseOrder());    //list in descending order
		System.out.println("******************");
		
		try{
			name.remove(6);
		}
		catch(Exception e)
		{
			System.out.println("No Fruits");
			System.out.println("******************");
			System.out.println("**Sorting the fruits list in Descending Order**");
		}
		
		Iterator<String> it=name.iterator();
		 
		while(it.hasNext())
		{
			System.out.println(it.next());
		
		}
	}
}
