package access_modifiers;
/*
 * Class without access modifier have `default` modifier
 * and accessible in it's package only
 */
class DefaultClassMod {
	public void dcmGreetings() {
		System.out.println("Hello! I am a greeting method from DefaultClassMode.");
	}
}
