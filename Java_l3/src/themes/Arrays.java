package themes;
public class Arrays {

	public static void main(String[] args) {
//		Declaration of array
		int[] arr_0;
//		Array constructing
		int[] arr_1 = new int[10];
//		Initialization of array
		arr_1[0] = 42;
		System.out.println("arr_1[0] = "+arr_1[0]);
//		Declaration and initialization in a sing line
		int[] arr_2 = {42,44,46,48,49};
		forEach(arr_2);
		startsPyramid();
		enchancedArr();
		ench2dArr();
	}
	public static void forEach(int[] arr) {
		int len = arr.length;
		String res ="";
		for(int i=0;i<len;i++) {
			res+= arr[i]+" ";
		}
		System.out.println("elements of array : " + res );
	}
	
	public static void startsPyramid() {
		for(int o=0;o<10;o++) {
			for(int i=0;i<o;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void enchancedArr() {
		System.out.print("Enchanced array: for(int i:arr):");
		int[] arr = {1,2,3,4,5,6,7,8,9};
		for(int i:arr) {
			System.out.print(" "+ i);
		}
		System.out.println();
	}
	
	public static void ench2dArr() {
		System.out.print("Encahnced 2D array : ");
		int[][] arr = {{1,2,3},{4,5,6}};
		for (int[] x: arr) {
			for(int y:x) {
				System.out.print(y + "\t");
			}
		}
	}
}
