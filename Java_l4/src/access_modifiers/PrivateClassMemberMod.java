package access_modifiers;

public class PrivateClassMemberMod {
/*
 * Class member with `private` access modifier is accessible in it's class only
 */
	public void runPrivateMethods() {
		privateClassMemberMethod();
	}
	private static void privateClassMemberMethod() {
		System.out.println("Hello! I am class member with private modifier"
				+ "\nI am accessible in my class only");
	}
}
