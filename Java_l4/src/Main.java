import access_modifiers.PublicClassMod;
import custom_package.*;
import opbect_oriented.*;
import third.*;
public class Main {

	public static void main(String[] args) {
		new RunTestClass().runGreeting();
		new ClassInThird();

//		Access modifiers
		PublicClassMod pcm = new PublicClassMod();
		pcm.runDefaultClassMod();
		verticalGap();
		pcm.runPublicClassMemberMethod();
		verticalGap();
		pcm.runDefaultClassMemberMethod();
		verticalGap();
		pcm.runProtectedClassMemberMethod();
		verticalGap();
		pcm.runPrivateClassMemberMethods();
		verticalGap();
		Encapsulation encap = new Encapsulation();
		System.out.println("size : " + encap.getSize());
		encap.setSize(45);
		encap.display();

		Inheritance inh = new Inheritance();
		inh.display();

		verticalGap();
		Cat cat = new Cat();
		cat.sound();
		verticalGap();
		Dog dog = new Dog();
		dog.sound();

	}

	static void verticalGap() {
		System.out.println();
	}

}
