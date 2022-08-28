package collectiondemo;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PriorityQueue<Object> q = new PriorityQueue<Object>();
        
        q.add(100);
        q.add(101);
        q.add(102);
        q.add('c');
               System.out.println(q);
               
//        System.out.println(q.element());      
//        System.out.println(q.peek());
//       q.remove();
//       System.out.println(q); 

	}

}
