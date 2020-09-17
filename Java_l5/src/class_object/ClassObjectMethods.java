package class_object;

import animals.Animal;
import animals.Cat;

public class ClassObjectMethods {
	private String str = "Text string";

	public void equalsDemo(String s1, String s2) {
		if (s1.equals(s2)) {
			System.out.println("'" + s1 + "'" + " is equal with " + "'" + s2 + "'");
		} else {
			System.out.println("'" + s1 + "'" + " is not equal with " + "'" + s2 + "'");
		}
		;
	}

	public void getClassDemo() {
		System.out.println("Classs of `str` variable is : " + str.getClass());
	}

	public void hasCodeDemo() {
		System.out.println("Hash code of `str` variable is : " + str.hashCode());
	}

	public void toStringDemo() {
//		???????????
	}

	public void instanceOfDemo(Animal a) {
		Object o = a;
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Cat);
		System.out.println(o instanceof Animal);
		System.out.println("class of `o` : " + o.getClass());
	}
}
