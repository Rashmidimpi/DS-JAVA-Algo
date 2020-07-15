package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("block 1");
	}
	
	static {
		System.out.println("block 2");
	}
	
	

	public static void main(String[] args) {
//		System.out.println(Math.max(23, 12));
		
		System.out.println("inside main");
		
		A objA = new A();
		B objB = objA.new B();
		C objC = new A.C();
		

	}
	
	static {
		System.out.println("in block 3");
	}

}
