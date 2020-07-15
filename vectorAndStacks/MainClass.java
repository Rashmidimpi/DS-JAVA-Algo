package vectorAndStacks;

import java.util.Stack;


public class MainClass {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> stack = new MyStack();
		stack.push(34);
		stack.push(12);
		stack.push(24);
		
		int popped = stack.pop();
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		

	}

}
