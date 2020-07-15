package oops.interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
//		obj.study();
//		obj.makeVideo();
		
		Youtuber obj2 = obj;
		obj2.editVideo();
		obj2.makeVideo();
		

	}
	
	public void study() {
		System.out.println("person is studying");
		
	}
	
	public void makeVideo() {
		System.out.println("person is making a good video");
		
	}

	@Override
	public void editVideo() {
		System.out.println("youtuber is editing");
		
		
	}
	
	public void uploadVideo() {
		
	}

}
