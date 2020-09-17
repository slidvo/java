package overload;

public class Overloading {
	public Overloading() {
		System.out.println("No arguments.");
	}
	
	public Overloading(int x) {
		System.out.println("One argument x :" + x);
	}
	public Overloading(int x, String s) {
		System.out.println("int x & String s constructor :");
		System.out.println("x:"+x);
		System.out.println("s:"+s);
		System.out.println();
	}
}
