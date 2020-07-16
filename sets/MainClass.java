package sets;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		x.add(12);
		x.add(1);
		x.add(23);
		
		Set<Integer> y = new HashSet<>();
		y.add(3);
		y.add(1);
		y.add(16);
		
		x.retainAll(y);
		System.out.println(x);
		
		
//		Set<String> fruits = new TreeSet<>();
		
//		fruits.add("Apple");
//		fruits.add("banana");
////		fruits.add("kiwi");
////		fruits.add("kiwi");
//		
//		System.out.println(fruits.add("kiwi"));
//		System.out.println(fruits.add("banana"));
//		
//		System.out.println(fruits);

	}

}
