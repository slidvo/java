package interfaces;

public interface InterfaceDeclaration {
	// Methods in interface always public and abstract
//	Do not need to mark it
	void method1(); // abstract methods always empty

	int method2();

	String method3(int a, int b);

	public abstract int method4(); // public and abstract is redundant

	// Variables always must be public static and final
	public static final int value = 42;
}
