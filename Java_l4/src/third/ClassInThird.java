package third;
import first.*;
import first.second.*;
public class ClassInThird {
	public ClassInThird() {
		ClassInFirst cif = new ClassInFirst();
		cif.showMessage();
		
		ClassInSecond cis = new ClassInSecond();
		cis.showMessage();
	}
}
