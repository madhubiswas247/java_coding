package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInsertChangeValue {
	public static void main(String[] args) {
		 // Creating an Arraylist object of string type
        ArrayList<String> al = new ArrayList<>();
  
        // Adding elements to Arraylist
        // Custom input elements
        al.add("Geeks");
        al.add("Geeks");
  
        // Adding specifying the index to be added
        al.add(1, "Geeks");
  
        // Printing the Arraylist elements
        System.out.println("Initial ArrayList " + al);
  
        // Setting element at 1st index
        al.set(1, "For");
  
        //  Printing the updated Arraylist
        System.out.println("Updated ArrayList " + al);
	}
}
