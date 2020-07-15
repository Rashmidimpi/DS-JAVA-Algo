package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(45);
		pq.add(12);
		pq.add(100);
		pq.add(1);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		
//		pq.add("kiwi");
//		pq.add("apple");
//		pq.add("banana");
//		pq.add("mango");
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());

	}

}
