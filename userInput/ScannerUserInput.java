package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		double y = sc.nextDouble();
//		String hello = sc.nextLine();
//		
//		System.out.println(hello);
		
		int p = sc.nextInt();
		float rate = sc.nextFloat();
		int t = sc.nextInt();
		float simpleInterest = p*rate*t/100;
		System.out.println("the simple interest is " + simpleInterest);
		

	}

}
