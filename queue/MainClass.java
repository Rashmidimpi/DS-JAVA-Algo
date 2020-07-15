package queue;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(23);
		mq.enqueue(43);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(451);
		System.out.println(mq.dequeue());
//		Queue<Integer> q = new LinkedList<>();
//		q.add(12);
//		q.add(28);
//		q.add(32);
//		
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		
//		System.out.println(q.element());
		
//		System.out.println(q.poll());
		
		
		

	}

}
