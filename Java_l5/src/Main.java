import animals.*;
import class_object.ClassObjectMethods;

public class Main {
	public static void main(String[] args) {
//		Polymorphic references and array
		Animal[] animal = new Animal[4];
		animal[0] = new Cat();
		animal[1] = new Dog();
		animal[2] = new Duck();
		animal[3] = new Snake();
		for(Animal i:animal) {
			i.sound();
		}
//		Polymorphic parameters and arguments
		Animal animal_2 = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println();
		animal_2.soundOf(cat);
		animal_2.soundOf(dog);
//		Important class Object methods
		ClassObjectMethods com = new ClassObjectMethods();
		com.equalsDemo("Hello World!","My name is Jurasik");
		com.equalsDemo("Hello", "Hello");
		com.getClassDemo();
		com.hasCodeDemo();
		com.toStringDemo();
		com.instanceOfDemo(new Cat());
		
		
		
		
	}
}
