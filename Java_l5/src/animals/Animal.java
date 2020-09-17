package animals;

public class Animal {
	public void eat() {
	show("Eat habit.");	
	}
	public void roam() {
		show("Roam habit");
	}
	public void sound() {
		show("Just silence.");
	}
	
	public void show(String str) {
		System.out.println(str);
	}
	public void soundOf(Animal a) {
		a.sound();
	}
}
