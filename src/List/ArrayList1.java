package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		// Using the Get method and the
        // for loop
        for (int i = 0; i < list.size(); i++) {
  
            System.out.print(list.get(i) + " ");
        }
  
        System.out.println();
  
        // Using the for each loop
        for (String str : list)
            System.out.print(str + " ");
	}
}