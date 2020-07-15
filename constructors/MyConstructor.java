package constructors;

class Vehicle{
	int wheels;
	int headLights;
	String color;
	
	Vehicle(int wheels){
		this.wheels = wheels;
		headLights = 2;
		
	}
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}

public class MyConstructor {
	MyConstructor(){
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2);
		
		Vehicle eRikshaw = new Vehicle(3, "Yellow");
		System.out.println(eRikshaw.wheels +" wheels and color = " +eRikshaw.color);
		

	}

}
