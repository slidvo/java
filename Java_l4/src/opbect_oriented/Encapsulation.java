package opbect_oriented;
/*
 * Encapsulation
 * Getter
 * Setter
 */
public class Encapsulation {
	private int size;
	public Encapsulation() {
	 size = 42;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void display() {
		System.out.println("size : " + this.size);
	}
	
}
