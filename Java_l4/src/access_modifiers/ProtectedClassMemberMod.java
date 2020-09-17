package access_modifiers;

public class ProtectedClassMemberMod {
	/*
	 * Class member marked as protected is accessible in it's package
	 * and through inheritance
	 */
	protected static void protectedClassMemberMethod() {
		System.out.println("Hello! I am class member with 'protected modifier'"
				+ "I am accessible in my package and through inheritance.");
	}

}
