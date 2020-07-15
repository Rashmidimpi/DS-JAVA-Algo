package oops;

class Cat{
	boolean hasfur;
	String color,breed;
	int legs,eyes;
	
	public void walk()
	{
		System.out.println("cat is walking");
	}
	
	public void eat() {
		System.out.println("cat is eating");
	}
	
	public void description() {
		System.out.println("my cat has " + legs +" legs and "+eyes+" eyes");
	}
	
	
}

class Dog{
	String breed, name;
	
	public void jump() {
		System.out.println("my dog"+ name +" jumped");
	}
	public void description() {
		System.out.println("my dog's name is " + name +" and its breed is " +breed );
	}
	
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.legs = 3;
		cat2.eyes = 2;
		cat2.legs = 4;
		cat1.eyes = 1;
//		cat1.walk();
//		cat2.eat();
		
		cat1.description();
		cat2.description();
		
		Dog husky = new Dog();
		Dog doodle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		doodle.breed = "Doodle";
		doodle.name = "Toodle";
		
		husky.jump();
		husky.description();
		doodle.description();
		
		
		
		

	}

}
