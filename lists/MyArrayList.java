package lists;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class MyArrayList {

	public static void main(String[] args) {
		List<String> fruits = new LinkedList<>();
		List<String> vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("hi");
		fruits.remove(2);
		
//		String temp[] = new String[fruits.size()];
//		 fruits.toArray(temp);
		 
		 for(String e:fruits) {
			 System.out.println(e);
		 }
		
		List<String> toRemove = new ArrayList();
		toRemove.add("hi");
		toRemove.add("Apple");
		
		fruits.removeAll(toRemove);
		
		vegetables.add("potato");
		vegetables.add("tomato");
		vegetables.add("carrot");
		fruits.addAll(vegetables);
		
		System.out.println(fruits.set(1,"banana"));
		System.out.println(fruits.size());
		System.out.println(fruits.contains("guava"));
		
		
		
//		ArrayList<Integer> marks = new ArrayList();
//		
//		Pair<String, Integer>p1 = new Pair("Anuj",457);
//		Pair<Boolean, String>p2 = new Pair(true, "Hello");
//		
//		p1.getDescription();
//		p2.getDescription();

	}

}
