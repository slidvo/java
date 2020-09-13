
public class Calculator {
	/*
	 * Few strings comment ClassName begin from UpperCase functionName begin from
	 * lowerCase
	 * 
	 */
	
	public Calculator() {
		System.out.println("Called constructor");
	}

	public void add() {
		System.out.println("Adding some numbers");
	}

	public void sub() {
		System.out.println("Substract some numbers");
	}

	public void div() {
		System.out.println("Divide some numbers");
	}

	public void mult() {
		System.out.println("Multiplicate some numbers");
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.div();
		calc.mult();
	}

}
