package List;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Garima");  
		v.add("Ashish");  
		v.add("Amit");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
}
