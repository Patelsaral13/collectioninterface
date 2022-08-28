package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
//		HashSet<Integer> hs = new HashSet<Integer>();
//		HashSet<Object> hs = new HashSet<Object>(100);
//		HashSet<Object> hs = new HashSet<Object>(100,(float)0.75);
		
	    //Add element into hashset
		
		hs.add(100);
		hs.add("saral");
		hs.add(0.58);
		hs.add('a');
		hs.add(null);
		
		System.out.println(hs);
		
		//remove
		
		hs.remove(100);
		
		System.out.println(hs);
		
		//contain
		
		System.out.println(hs.contains(100));
	
	     //isempty		
		
	    System.out.println(hs.isEmpty());
		
		//Reading element
	    
	    for(Object a:hs)
	    {
	    	
	    	System.out.println(a);
	    }
	
	      //iterator
	    
	    Iterator it = hs.iterator();
	    
	    while(it.hasNext())
	    {
	    	
	    	System.out.println(it.next());
	    }
	
	    HashSet<Integer> hp = new HashSet<Integer>();
	    
	    hp.add(1);
	    hp.add(2);
	    hp.add(3);
	    
	    System.out.println(hp);
	    
	    hs.addAll(hp);
	    
	    hs.removeAll(hp);
	    System.out.println("Difference" +hs);
	    
	}
	
	
}
