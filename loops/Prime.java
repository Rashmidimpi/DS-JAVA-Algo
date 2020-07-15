package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(n < 2) isPrime = false;
 System.out.println("isPrime " + isPrime);
	}

}
