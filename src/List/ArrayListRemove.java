package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
	public static void main(String[] args) {
		 // Creating an Arraylist object of string type
		 // Creating an object of arraylist class
        ArrayList<String> al = new ArrayList<>();
  
        // Adding elements to ArrayList
        // Custom addition
        al.add("Geeks");
        al.add("Geeks");
        // Adding element at specific index
        al.add(1, "For");
  
        // Printing all elements of ArrayList
        System.out.println("Initial ArrayList " + al);
  
        // Removing element from above ArrayList
        al.remove(1);
  
        // Printing the updated Arraylist elements
        System.out.println("After the Index Removal " + al);
  
        // Removing this word element in ArrayList
        al.remove("Geeks");  //first occurrence is removed
  
        // Now printing updated ArrayList
        System.out.println("After the Object Removal "
                           + al);
	}
}
