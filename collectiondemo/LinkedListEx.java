package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> list = new LinkedList<Object>();
		// LinkedList<Integer> list = new LinkedList<Integer>();

		list.add('a');
		list.add(100);
		list.add("Saral");
		list.add(15.57);

		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());

//		for (int i = 0; i < list.size(); i++)
//			;
//		{
//
//			System.out.println(list.get(i));
//
//		}
//             
//		for(Object k:list) {
//			
//			System.out.println(k);
//		}
//	
	    Iterator it = list.iterator();
	    
	     while(it.hasNext())
	     {
	    	 
	    	 System.out.println(it.next());
	     }
	      
	     list.addFirst("First");
	     list.addLast("last");
	  System.out.println(list); 
	
	}
	
	
	
	
	
	

}
