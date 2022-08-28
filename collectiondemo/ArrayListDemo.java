package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Types of declare ArrayList
		
		//ArrayList<Integer> al = new ArrayList<Integer>(); 
		//ArrayList<String> al = new ArrayList<String>();
		//List al = new ArrayList();
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(100);
		al.add("Saral");
		al.add(15.57);
		al.add('a');
		
		System.out.println("List of element is " +al);
		System.out.println(al.size());
		al.remove(2);
		System.out.println("After remove 15.57 :" +al);
		al.add(1, 'c');
		System.out.println("After adding c: "+al);
		System.out.println(al.get(1));
		System.out.println("\n");
		al.set(1,'d');
		System.out.println(al.isEmpty());
		System.out.println(al.contains(100));
		System.out.println("After replce d with c: "+al);
		if(al.contains("Saral")) {
			
			System.out.println("Saral is present");
		}
		else
		{
			
			System.out.println("Saral is not present");
		}
		
		
		System.out.println("Reading the element thru for loop");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("Reading thru for each loop");
    
		for(Object r:al) {
			
			System.out.println(r);
		}
		
		System.out.println("Reading thru iterative method");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
		al.add('j');
		al.add('k');
		al.add('L');
		
		
	
		System.out.println(al);
	}  

}
