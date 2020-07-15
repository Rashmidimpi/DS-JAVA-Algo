package arrays;
import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of students: ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		System.out.println("enter the marks ");
		for(int i = 0; i<n; i++) {
			marks[i] = sc.nextInt();
		}
		
		int average = 0;
		for(int i =0; i<n; i++) {
			average += marks[i];
			
			
		}
		average /= n;
		System.out.println("the avg marks are "+ average);
		
		

	}

}
