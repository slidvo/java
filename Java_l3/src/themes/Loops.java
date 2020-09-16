package themes;

public class Loops {
	public void whileExmpl() {
		int i = 0;
		System.out.print("Loop \"While\" example 0-9: ");
		while (i < 10) {
			System.out.print("i:" + i + " | ");
			i++;
		}
		System.out.println(" ");
	}

	public void doWhileExmpl() {
		int i = 0;
		System.out.print("Loop \"do while\" example 0-9: ");
		do {
			System.out.print("i:" + i + " | ");
			i++;
		} while (i<10);
		System.out.println(" ");
	}
	
	public void forLoopExmpl() {
		System.out.print("Loop \"for\" example 0-9: ");
		for (int i=0; i<10;i++) {
			System.out.print("i:" + i + " | ");
		}
		System.out.println(" ");
	}
	
	public void loopsNesting() {
		System.out.println("Loops nesting: ");
		for (int i=0;i<3;i++) {
			for(int j=0; j<10;j++) {
				System.out.print("j: "+ j + " | ");
			}
			System.out.println(" ");
		}
	}
}
